import java.util.ArrayList;
import java.util.Scanner;

class EmployeeOperations {
    static ArrayList<Employee> Emp = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static boolean actions(int ch) {
        switch (ch) {
            case 0 -> {
                System.out.println("Exiting program...\n\n\t\tTHANK YOU FOR USING OUR SYSTEM!");
                return false;
            }
            case 1 -> addEmployee();
            case 2 -> {
                if (showEmployeeList() == false)
                    break;
                System.out.print("Enter Employee Id of employee which you want to update the details: ");
                int n = sc.nextInt();
                for (Employee emp : Emp) {
                    if (emp.empId == n) {
                        emp.updateEmployee();
                        return true;
                    }
                }
                System.out.println("Employee not found with id " + n);
            }
            case 3 -> deleteEmployee();
            case 4 -> {
                if (showEmployeeList() == false)
                    break;
                System.out.print("Enter Employee Id of employee which you want to see the details: ");
                int n = sc.nextInt();
                for (Employee emp : Emp) {
                    if (emp.empId == n) {
                        System.out.println(emp);
                        return true;
                    }
                }
                System.out.println("Employee not found with id " + n);
            }
            case 5 -> showEmployeeList();
            default -> System.out.println("Please Enter the Valid Input!!");
        }
        return true;
    }

    public static void addEmployee() {
        System.out.print("Enter Employee Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee name: ");
        // clear line buffer
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double sal = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Contact No: ");
        String contactNo = sc.nextLine();

        // Creating an employee object
        Employee emp = new Employee(id, name, sal, contactNo);
        // Adding employee to array list
        Emp.add(emp);
        System.out.println("Employee added successfully!!");
    }

    public static boolean showEmployeeList() {
        if (Emp.size() == 0) {
            System.out.println("Nothing to display, please add employee in the system!");
            return false;
        }
        System.out.println("------------------------------------------------");
        System.out.printf("%10s %14s %21s", "SR. NO", "EMPLOYEE ID", "NAME");
        System.out.println();
        System.out.println("------------------------------------------------");
        for (int i = 0; i < Emp.size(); i++) {
            // System.out.println("[" + (i + 1) + "] " + Emp.get(i).empId + " " +
            // Emp.get(i).eName);
            System.out.format("%10s %14s %21s", "[" + (i + 1) + "] ", Emp.get(i).empId, Emp.get(i).eName);
            System.out.println();
        }
        return true;
    }

    public static void deleteEmployee() {
        if (showEmployeeList() == false)
            return;
        System.out.print("Enter Employee Id of employee which you want to delete: ");
        int n = sc.nextInt();
        for (int i = 0; i < Emp.size(); i++) {
            if (Emp.get(i).empId == n) {
                System.out.print("Are you sure, you want to delete " + Emp.get(i).eName + "(y/n)? ");
                char ch = sc.next().charAt(0);
                if (ch == 'y' || ch == 'Y') {
                    Emp.remove(i);
                    System.out.println("Employee Deleted!!");
                    return;
                } else {
                    System.out.println("Process Canceled!!");
                    return;
                }
            }
        }
        System.out.println("Employee not found with id " + n);
    }

}
