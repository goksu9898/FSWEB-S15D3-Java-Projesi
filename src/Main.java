import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "Goksu", "Yesilada"));
        employeeList.add(new Employee(1, "Cansu", "Yesilada"));
        employeeList.add(new Employee(2, "Dogancan", "Kinik"));
        System.out.println("Employee List-----------------\n" + employeeList);
        List<Employee> duplicateEmployeesList = new LinkedList<>();

        Map<Integer, Employee> uniqueEmployeeMAp = new HashMap<>();

        for(int i = 0; i < employeeList.size(); i++) {
            if (!uniqueEmployeeMAp.containsKey(employeeList.get(i).getId())) {
                uniqueEmployeeMAp.put(employeeList.get(i).getId(), employeeList.get(i));
            } else {
                duplicateEmployeesList.add(employeeList.get(i));
                employeeList.remove(i);
                i--;
            }
        }

        System.out.println("unique map:-------------------\n" + uniqueEmployeeMAp);
        System.out.println("duplicate list:---------------\n" + duplicateEmployeesList);
        System.out.println("last version list:-----------------\n" + employeeList);
    }

}