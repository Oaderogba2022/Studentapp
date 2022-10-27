package ie.atu.week5;

import java.util.Scanner;

public class StudentApps {


    public static void main(String[] args) {

        //Created first Instance
        System.out.println("Please enter your Student name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        StudentClass classinfo = new StudentClass();
        classinfo.setName(name);
        System.out.println("You entered : " + classinfo.getName() );
        System.out.println("Please enter your Student email: ");
        String email = input.nextLine();
        classinfo.setEmail(email);
        System.out.println("You entered : " + classinfo.getEmail());
        System.out.println("Please enter your course: ");
        String course = input.nextLine();
        classinfo.setCourse(course);
        System.out.println("You entered : " + classinfo.getCourse());

        // Created Second instance
        System.out.println("Please enter your Student name: ");
        String name2 = input.nextLine();
        StudentClass classinfo2 = new StudentClass();
        classinfo2.setName(name2);
        System.out.println("You entered : " + classinfo2.getName() );
        System.out.println("Please enter your Student email: ");
        String email2 = input.nextLine();
        classinfo2.setEmail(email2);
        System.out.println("You entered : " + classinfo2.getEmail());
        System.out.println("Please enter your course: ");
        String course2 = input.nextLine();
        classinfo2.setCourse(course2);
        System.out.println("You entered : " + classinfo2.getCourse());

        //Created third instance
        System.out.println("Please enter your Student name: ");
        String name3 = input.nextLine();
        System.out.println("You entered : " + name3);
        System.out.println("Please enter your Student email: ");
        String email3 = input.nextLine();
        System.out.println("You entered : " + email3 );
        System.out.println("Please enter your course: ");
        String course3 = input.nextLine();
        System.out.println("You entered : " + course3);

        StudentClass classinfo3 = new StudentClass(name3,email3,course3);

        System.out.println("You entered : " + classinfo.getName() );
        System.out.println("You entered : " + classinfo.getEmail());
        System.out.println("You entered : " + classinfo.getCourse());

        System.out.println("You entered : " + classinfo2.getName() );
        System.out.println("You entered : " + classinfo2.getEmail());
        System.out.println("You entered : " + classinfo2.getCourse());


        System.out.println("You entered : " + name3);
        System.out.println("You entered : " + email3 );
        System.out.println("You entered : " + course3);

















    }



}
