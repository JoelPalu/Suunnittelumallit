public class VisitorMain {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory subDir1 = new Directory("subDir1");
        Directory subDir2 = new Directory("subDir2");

        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("file3.log", 30);

        root.addElement(subDir1);
        root.addElement(subDir2);
        root.addElement(file1);
        subDir1.addElement(file2);
        subDir2.addElement(file3);

        // Calculate total size
        SizeCalculatorVisitor sizeCalculator = new SizeCalculatorVisitor();
        root.accept(sizeCalculator);
        System.out.println("Total size: " + sizeCalculator.getTotalSize() + " MB");

        // Search for files with ".txt" extension
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Matching files:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }
    }
}