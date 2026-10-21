import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {

        for (Employee existingEmployee : employees) {

            if (existingEmployee.getEmployeeId()
                    == employee.getEmployeeId()) {

                System.out.println("Employee ID already exists!");
                return;
            }
        }

        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee : employees) {
            employee.displayEmployee();
            System.out.println("--------------------");
        }
    }

    public void searchEmployee(int employeeId) {

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == employeeId) {
                employee.displayEmployee();
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void updateEmployee(int employeeId, String name,
                               String department, double salary) {

        for (Employee employee : employees) {

            if (employee.getEmployeeId() == employeeId) {

                employee.setEmployeeName(name);
                employee.setDepartment(department);
                employee.setSalary(salary);

                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int employeeId) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getEmployeeId() == employeeId) {

                employees.remove(i);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }

        System.out.println("Employee not found.");
    }
}
