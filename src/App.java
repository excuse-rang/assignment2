import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MemberManagerInterface school = new School(); // 인터페이스 타입으로 선언
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== School Member Management ===");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. List Students");
            System.out.println("4. List Staff");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMemberMenu(school, scanner);
                    break;
                case 2:
                    removeMemberMenu(school, scanner);
                    break;
                case 3:
                    school.listStudents();
                    break;
                case 4:
                    school.listStaff();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addMemberMenu(MemberManagerInterface school, Scanner scanner) {
        System.out.println("\n=== Add Member ===");
        System.out.println("1. Add Student");
        System.out.println("2. Add Staff");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Student Sex: ");
            String sex = scanner.nextLine();
            System.out.print("Enter Student Birth Year: ");
            String birthYear = scanner.nextLine();
            System.out.print("Enter Student Grade: ");
            String grade = scanner.nextLine();
            System.out.print("Enter Year of Admission: ");
            String yearOfAdmission = scanner.nextLine();
            school.addMember(new Student(name, sex, birthYear, grade, yearOfAdmission));
        } else if (choice == 2) {
            System.out.print("Enter Staff Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Staff Sex: ");
            String sex = scanner.nextLine();
            System.out.print("Enter Staff Birth Year: ");
            String birthYear = scanner.nextLine();
            System.out.print("Enter Staff Salary: ");
            String salary = scanner.nextLine();
            System.out.print("Enter Year of Joining: ");
            String yearOfJoining = scanner.nextLine();
            school.addMember(new Staff(name, sex, birthYear, salary, yearOfJoining));
        } else {
            System.out.println("Invalid option. Returning to main menu.");
        }
    }

    private static void removeMemberMenu(MemberManagerInterface school, Scanner scanner) {
        System.out.println("\n=== Remove Member ===");
        System.out.print("Enter Member Name to remove: ");
        String name = scanner.nextLine();
        school.removeMember(name);
    }
}