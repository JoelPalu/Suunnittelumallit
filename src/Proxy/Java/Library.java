import java.util.HashMap;

public class Library {
    private HashMap<Integer, Document> documents = new HashMap<>();

    public void addDocument(Document document) {
        documents.put(document.getId(), document);
    }

    public Document getDocument(int documentId) {
        return documents.get(documentId);
    }

    public void addProtectedDocument(Document document, String username) {
        documents.put(document.getId(),document);
        AccessControlService.getInstance().grantAccess(username, document.getId());
    }

}
