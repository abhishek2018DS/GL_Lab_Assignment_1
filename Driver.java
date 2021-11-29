package lab.greatlearning.main;

import lab.greatlearning.employee.Employee;
import lab.greatlearning.credentialservice.CredentialService;
import java.util.Scanner;

public class Driver
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Name");
        final String firstname = sc.next();
        System.out.println("Enter your last Name");
        final String lastname = sc.next();
        System.out.println("Enter your Department");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Leagal");
        System.out.println("Enter choice");
        final int choice = sc.nextInt();
        String email = null;
        String password = null;
        final CredentialService cred_serv = new CredentialService();
        if (choice == 1) {
            final Employee emp = new Employee(firstname, lastname, "Technical");
            email = cred_serv.generateEmail(firstname, lastname, "Technical");
            password = cred_serv.generatePassword();
            System.out.println("email is ::" + email);
            System.out.println("password is ::" + password);
            cred_serv.showCreds(emp, email, password);
        }
        else if (choice == 2) {
            final Employee emp = new Employee(firstname, lastname, "Admin");
            email = cred_serv.generateEmail(firstname, lastname, "Admin");
            password = cred_serv.generatePassword();
            System.out.println("email is ::" + email);
            System.out.println("password is ::" + password);
            cred_serv.showCreds(emp, email, password);
        }
        else if (choice == 3) {
            final Employee emp = new Employee(firstname, lastname, "Human Resource");
            email = cred_serv.generateEmail(firstname, lastname, "Admin");
            password = cred_serv.generatePassword();
            System.out.println("email is ::" + email);
            System.out.println("password is ::" + password);
            cred_serv.showCreds(emp, email, password);
        }
        else if (choice == 4) {
            final Employee emp = new Employee(firstname, lastname, "Legal");
            email = cred_serv.generateEmail(firstname, lastname, "Legal");
            password = cred_serv.generatePassword();
            System.out.println("email is ::" + email);
            System.out.println("password is ::" + password);
            cred_serv.showCreds(emp, email, password);
        }
        else {
            System.out.println("Enter valid input");
        }
    }
}