import java.sql.Date;

public class ProxyDocument implements Document{

    private RealDocument realDocument;
    private AccessControlService accessControlService;
    private int documentId;


    public ProxyDocument(RealDocument realDocument) {
        this.realDocument = realDocument;
        this.accessControlService = AccessControlService.getInstance();
        this.documentId = realDocument.getId();
    }


    @Override
    public int getId() {
        return realDocument.getId();
    }

    @Override
    public Date getDocumentDate() {
        return realDocument.getDocumentDate();
    }

    @Override
    public String getDocumentContent(String username) {
        if(accessControlService.isAllowed(username, documentId)){
            return realDocument.getDocumentContent(username);
        }else {
            throw new AccessDeniedException("Access denied");
        }
    }

}
