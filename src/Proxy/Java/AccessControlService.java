import java.util.HashMap;
import java.util.HashSet;

public class AccessControlService {
    private static AccessControlService INSTANCE;
    private HashMap<String, HashSet<Integer>> access = new HashMap<>();

    private AccessControlService() {
    }

    public static AccessControlService getInstance() {
        INSTANCE = INSTANCE == null ? new AccessControlService() : INSTANCE;
        return INSTANCE;
    }

    public void grantAccess(String username, int documentId) {
        access.computeIfAbsent(username, k -> new HashSet<>()).add(documentId);
    }

    public boolean isAllowed(String username, int documentId) {
        return access.containsKey(username) && access.get(username).contains(documentId);
    }




}
