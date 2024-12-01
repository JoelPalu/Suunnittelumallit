
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFacade {

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Failed to get response from the server. HTTP response code: " + responseCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();

        JSONObject jsonResponse = new JSONObject(content.toString());
        if (!jsonResponse.has(attributeName)) {
            throw new IllegalArgumentException("Attribute " + attributeName + " not found in the JSON response.");
        }

        Object attributeValue = jsonResponse.get(attributeName);
        return attributeValue.toString();
    }
}