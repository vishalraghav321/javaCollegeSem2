public class EmployeeSalary {

    public void calculatePay(double basePay, int hoursWorked) {

        if (hoursWorked > 60) {
            System.out.println("Error: Employee worked more than 60 hours");
        } 
        else {
            double totalPay = basePay * hoursWorked;
            System.out.println("Total Pay = " + totalPay);
        }

    }

    public static void main(String[] args) {

        EmployeeSalary obj = new EmployeeSalary();

        obj.calculatePay(10.5, 40);
        obj.calculatePay(12.0, 50);
        obj.calculatePay(9.5, 65);

    }
}