public class Main {
    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] =new Employee("Иван Иванов Иванович",5,30000);
        employees[1] =new Employee("Анна Аньева Олеговна",2,100000);
        employees[2] =new Employee("Дмитрий Дмитриев Александрович",5,80000);
        employees[3] =new Employee("Олег Овновский Дмитриевич",1,20000);
        employees[4] =new Employee("Светлана Пуха Владимировна",2,30000);
        employees[5] =new Employee("Эдуард Хохмачев Викторович",4,90000);
        employees[6] =new Employee("Тимур Каштан Игоревич",5,50000);
        employees[7] =new Employee("Тарас Петренко Валерьевич",1,80000);
        employees[8] =new Employee("Олег Баранов Сергеевич",2,70000);
        employees[9] =new Employee("Наталья Гущенко Артемовна",3,50000);

        printEmployees();
        System.out.println();
        System.out.println("Сумма зарплат - " + sum());
        System.out.println();
        System.out.println(findMinSalary());
        System.out.println();
        System.out.println(findMaxSalary());
        System.out.println();
        System.out.println("Средняя зарплата - "+findAverageSalary());
    }


    static void printEmployees() {
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    static int  sum(){
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
            return sum;
        }
    static Employee findMinSalary() {
        Employee min = null;
        for (Employee employee : employees){
            if (min == null || employee.getSalary() < min.getSalary()){
                min = employee;
            }
        }
     return min;
    }
    static Employee findMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    static double findAverageSalary() {
        double average = (double) sum() / employees.length;
        return average;
    }
    static void  printFullNameOfEmployee(){
        for (Employee employee: employees){
            System.out.println(employee.getFullName());
        }
    }


}