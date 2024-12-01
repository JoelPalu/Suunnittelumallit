import java.io.IOException;

public class FacadeMain {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();

        try {
            // Example 1: Retrieve a Chuck Norris joke
            String jokeUrl = "https://api.chucknorris.io/jokes/random";
            String joke = apiFacade.getAttributeValueFromJson(jokeUrl, "value");
            System.out.println("Chuck Norris Joke: " + joke);

            // Example 2: Retrieve the latest foreign exchange rates
            String fxRatesUrl = "https://api.exchangerate-api.com/v4/latest/USD";
            String rate = apiFacade.getAttributeValueFromJson(fxRatesUrl, "rates");
            System.out.println("Exchange Rates: " + rate);

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}