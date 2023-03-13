public class Employee {
    private static int idGenerator = 0;
    private int id;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.id = idGenerator++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public static int getId() {
        return idGenerator;
    }

    public static String getFullName() {
        return fullName;
    }

    public static int getDepartment() {
        return department;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        this.salary = salary;
    }

    public static void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
