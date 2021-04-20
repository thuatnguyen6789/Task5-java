package session6;
// The Author class model a book's author
public class Author {
    // The private instance variable
    private String name;
    private String email;
    private char gender; //'m' or 'f'
    // Constructs a Author instance with the given inputs
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // The public getters and setters for the private instance variables.
    // No setters for name and gender as they are not designed to be changed.
    // Return the name
    public String getName() {
        return name;
    }
    // Return the gender
    public char getGender() {
        return gender;
    }
    // Return the email
    public String getEmail() {
        return email;
    }
    // Sets the email
    public void setEmail(String email) {
        this.email = email;
    }
    // Returns a self-descriptive String
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
