package question9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximumUsingStreamMain {
    public static void main(String args[]){

        List<Employee> employeeList = createEmployeeList();
        Iterator<Employee> iterator = employeeList.listIterator();

        for(int i=0; i<employeeList.size()-1; i++) {
            System.out.print(employeeList.get(i).getName() + ", ");
        }
        System.out.println(employeeList.get(employeeList.size()-1).getName());

        while(iterator.hasNext()) {
            Employee current = iterator.next();
            if (iterator.hasNext() == true) {
                System.out.print(current.getName() + ", ");
            } else {
                System.out.print(current.getName() + "\n");
            }
        }

        String employeeListResult = employeeList
                .stream()
                .map(e -> e.getName())
                .collect(Collectors.joining(", "));
        System.out.print(employeeListResult);
}

public static List<Employee> createEmployeeList(){
        List<Employee> employeeList=new ArrayList<>();
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        return employeeList;
    }
}
