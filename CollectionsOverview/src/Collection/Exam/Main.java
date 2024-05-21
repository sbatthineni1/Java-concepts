package Collection.Exam;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> email = ContactData.getData("email");
        List<Contact> phone = ContactData.getData("phone");
        printData("Email List", email);
        printData("Phone List", phone);

    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("--------".repeat(5));
        System.out.println(header);
        System.out.println("--------".repeat(5));
        contacts.forEach(System.out::println);
    }
}
