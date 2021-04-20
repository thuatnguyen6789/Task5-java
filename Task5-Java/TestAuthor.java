package session6;
// A test driver for the Author class.
public class TestAuthor {
    public static void main(String[] args) {
        // Test constructor and toString()
        Author ahTeck = new Author("Tan Ah Teck", "teck@nowhere.com", 'm');
        System.out.println(ahTeck); // toString()
        // Tan Ah Teck (m) at teck@nowhere.com
        // Test Setters and Getters
        ahTeck.setEmail("teck@somewhere.com");
        System.out.println(ahTeck); // toString()
        // Tan Ah Teck (m) at teck@somewhere.com
        System.out.println("name is: " + ahTeck.getName());
        // name is: Tan Ah Teck
        System.out.println("gender is: " + ahTeck.getGender());
        // gender is: m
        System.out.println("email is: " + ahTeck.getEmail());
        // email is: teck@somewhere.com
    }
}
