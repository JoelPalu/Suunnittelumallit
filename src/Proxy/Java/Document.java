import java.sql.Date;

public interface Document {
    int getId();
    Date getDocumentDate();
    String getDocumentContent(String username);
}
