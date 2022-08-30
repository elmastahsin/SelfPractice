package day12_customMethod;

public class EmailDomain {
    public static void emailDomain(String email) {

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
}
