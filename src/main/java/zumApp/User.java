package zumApp;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String homeState;
    private String homeZip;

    public User(String firstName, String lastName, String email, String phone, String homeState, String homeZip) {

        this.firstName = firstName;
        this.lastName =lastName;
        this.email = email;
        this.phone = phone;
        this.homeState = homeState;
        this.homeZip = homeZip;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getHomeState() {
        return homeState;
    }

    public String getHomeZip() {
        return homeZip;
    }


}
