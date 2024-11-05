public class ProxyMain {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("user1");
        User user2 = new User("user2");

        // Add documents
        Document doc1 = new RealDocument("Unprotected document");
        Document doc2 = new ProxyDocument(new RealDocument("Protected document"));
        library.addDocument(doc1);
        library.addProtectedDocument(doc2, user1.getUsername());

        // Access documents
        try {
            System.out.println(library.getDocument(doc1.getId()).getDocumentContent(user1.getUsername()));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(library.getDocument(doc2.getId()).getDocumentContent(user1.getUsername()));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(library.getDocument(doc2.getId()).getDocumentContent(user2.getUsername()));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }

    }
}