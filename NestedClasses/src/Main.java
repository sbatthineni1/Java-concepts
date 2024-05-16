import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10022, "Jane", 2021),
                new Employee(10005, "Carole", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018)
        ));
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("Store Members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "bud", 2016, "Target")
        ));
        //var genericEmployee = new StoreEmployee();
        //StoreEmployee.StoreComparator<StoreEmployee> comparator = new StoreEmployee().new StoreComparator<>(); or just use var keyword
        var comparator = new StoreEmployee().new StoreComparator<>();

        storeEmployees.sort(comparator);
        for (StoreEmployee e : storeEmployees) {
            System.out.println(e);
        }


        /*
        List<Integer> intValues = new ArrayList<>();
        intValues.add(1);
        intValues.add(2);
        intValues.addAll(List.of(3,4,5,6,7,8,9));
        System.out.println(intValues);

         */
    }
}