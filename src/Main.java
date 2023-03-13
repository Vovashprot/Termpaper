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
        Employee min = null;
        for (Employee employee : employees){
            if (min == null || employee.getSalary() < min.getSalary()){
                min = employee;
            }
        }
     return min;
    }
    Employee findMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    double findAverageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
                sum += employee.getSalary();
        }
        double average = (double) sum / employees.length;
        return average;
    }
    void  printFullNameOfEmployee(){
        for (Employee employee: employees){
            System.out.println(employee.getFullName());
        }
    }


}