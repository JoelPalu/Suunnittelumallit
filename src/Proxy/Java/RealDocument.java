import java.sql.Date;

public class RealDocument implements Document{

    private static int idCounter;
    public int id;
    public Date documentDate;
    private final String documentContent;

    public RealDocument(String documentContent){
        this.id = idCounter++;
        this.documentDate = new Date(System.currentTimeMillis());
        this.documentContent = documentContent;
    }



    @Override
    public int getId() {
        return id;
    }

    @Override
    public Date getDocumentDate() {
        return documentDate;
    }

    @Override
    public String getDocumentContent(String username) {
        return documentContent;
    }

}
