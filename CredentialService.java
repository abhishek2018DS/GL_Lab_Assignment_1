package lab.greatlearning.credentialservice;

import lab.greatlearning.employee.Employee;
import java.util.Random;

public class CredentialService
{
    public String generateEmail(final String firstname, final String lastname, final String department) {
        return String.valueOf(firstname) + lastname + "@" + department + ".greatlearning.com";
    }
    
    public String generatePassword() {
        final String numbers = "0123456789";
        final String capitalletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String smallletters = "abcdefghijklmnopqrstuvwxyz";
        final String specialcharacters = "!@#$%^&*=/.?><";
        final String values = String.valueOf(capitalletters) + smallletters + numbers + specialcharacters;
        final Random random = new Random();
        final char[] password = new char[8];
        for (int i = 0; i < 8; ++i) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return String.valueOf(password);
    }
    
    public void showCreds(final Employee emp, final String email, final String password) {
        System.out.println("Dear" + emp.getFirstName() + ":" + "\nyour generated credentials listed below:");
        System.out.println(email);
        System.out.println(password);
    }
}