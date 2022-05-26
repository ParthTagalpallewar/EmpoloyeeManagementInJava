import java.util.Scanner;

class Employee {
    protected int empId;
    protected String eName, contactNo;
    protected double sal;

    public Employee(int empId, String eName, double sal, String contactNo) {
        this.empId = empId;
        this.eName = eName;
        this.sal = sal;
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "EmployeeDetails [empId=" + empId + ", eName=" + eName + ", contactNo=" + contactNo + ", sal=" + sal + "]";
    }

    public void updateEmployee() {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select what you want to update: ");
        System.out.print(
                "\t[1] Employee Id\n\t[2] Employee name\n\t[3] Employee Salary\n\t[4] Contact details\n\tInput: ");
        ch = sc.nextInt();
        sc.nextLine();
        switch (ch) {
            case 1:
                System.out.print("Enter new Employee Id: ");
                empId = sc.nextInt();
                break;
            case 2:
                System.out.print("Enter new Employee Name: ");
                eName = sc.nextLine();
                break;
            case 3:
                System.out.print("Enter new Employee salary: ");
                sal = sc.nextDouble();
                break;
            case 4:
                System.out.print("Enter new Contact Number: ");
                contactNo = sc.nextLine();
                break;
            default:
                System.out.println("Please enter valid Input!!");
                updateEmployee();
        }

        sc.close();
    }
}
