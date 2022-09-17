package day18_garbageCollection;

public class Contact {
    public String name, email, phoneNumber;


    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void call(){
        System.out.println("Calling " + name + " now");
    }
    public void sendMassage(){
        System.out.println("Sending message to " + phoneNumber + " now");
    }
    public void sendEmail(){
        System.out.println("Sending email to" + email+ " now");

    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
