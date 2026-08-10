import java.util.Scanner;

public class Test {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);


        // Default Constructor
        Student s1 = new Student();


        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();


        System.out.print("Enter Name: ");
        String name = sc.nextLine();


        // Constructor with PRN and Name
        Student s2 = new Student(prn, name);


        System.out.print("Enter Year: ");
        Year year = Year.valueOf(sc.nextLine().toUpperCase());


        System.out.print("Enter Department: ");
        String dept = sc.nextLine();


        System.out.print("Enter Division: ");
        String div = sc.nextLine();


        System.out.print("Enter Mobile: ");
        String mobile = sc.nextLine();


        System.out.print("Enter Percentage: ");
        double per = sc.nextDouble();


        // Constructor with all attributes
        Student s3 = new Student(
                prn,
                name,
                year,
                dept,
                div,
                mobile,
                per
        );


        System.out.println("\nStudent 1:");
        System.out.println(s1);


        System.out.println("\nStudent 2:");
        System.out.println(s2);


        System.out.println("\nStudent 3:");
        System.out.println(s3);


        sc.close();
    }
}
