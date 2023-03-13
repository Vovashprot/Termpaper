public class Main {
    Employee[] employees = new Employee[10];
    public static void main(String[] args) {

    }

    void printEmployees() {
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    void  sum(){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
            System.out.println("Сумма зарплат = " + sum);
        }
     Employee findMinSalary() {
        int min = Integer.MAX_VALUE;
        int employeeWithMinimalSalary = 0;
        for (int i = 0; i < employees.length; i ++){
            if (employees[i]!= null && employees[i].getSalary() < min){
                min = employees[i].getSalary();
                employeeWithMinimalSalary = employees[i].getId();
            }
        }
        System.out.println("Минимальная зарплата составляет " + min +
                ", ее получает сотрудник" + employeeWithMinimalSalary);
        System.out.println();
     return null;
    }
}