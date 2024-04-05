package edu.miu.cs489.quiz1;

import com.google.gson.Gson;
import edu.miu.cs489.quiz1.model.Contact;
import edu.miu.cs489.quiz1.model.EmailAddress;
import edu.miu.cs489.quiz1.model.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PhoneNumber> p1 = new ArrayList<>();
        p1.add(new PhoneNumber("641-233-8769", "Mobile"));
        p1.add(new PhoneNumber("211-655-1908", "Home"));
        p1.add(new PhoneNumber("344-788-1421", "Work"));

        List<EmailAddress> e1 = new ArrayList<>();
        e1.add(new EmailAddress("jhon@gmail.com", "Personal"));
        e1.add(new EmailAddress("jhon@miu.edu", "School"));
        e1.add(new EmailAddress("jhon@global.com", "Job"));

        Contact contact = new Contact("John", "Smith", "Global Ltd", "Senior Software Engineer", p1, e1);

        //Print a contact with john format
        System.out.println("JSON format output: ");
        System.out.println(new Gson().toJson(contact));
    }
}