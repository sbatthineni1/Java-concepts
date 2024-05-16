import java.util.Comparator;

public class Employee {
    public static class EmployeeComparator<T extends Employee>
            implements Comparator<Employee> {
        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if(sortType.equalsIgnoreCase("yearStarted")) {
                //System.out.println( o1.getName() +  "  o1.yearStared - " + o2.getName() + " o2.yearStared: " +( o1.yearStared - o2.yearStared));
                return o1.yearStared - o2.yearStared;

            }
            return o1.name.compareTo(o2.name);
        }
    }

    private int employeeID;
    private String name;

    private int yearStared;

    public Employee() {
    }

    public Employee(int employeeID, String name, int yearStared) {
        this.employeeID = employeeID;
        this.name = name;
        this.yearStared = yearStared;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "%d %-15s %d".formatted(employeeID, name, yearStared);
    }
}
