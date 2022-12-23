package practice;

import java.util.List;
import java.util.Optional;

public class Java8FeatureExamples {
    public static void main(String[] args) {

        Optional<EmployeeData> employeeData = findByStudentId(101);

        int odd = 1;

//        if(odd){
//
//        }

        if(employeeData.isPresent()){
            System.out.println(employeeData);
        }else{
            employeeData.orElse(new EmployeeData(101,"data"));
        }



    }

    public static Optional<EmployeeData> findByStudentId(int id){
        return null;
    }

    public static void printEvenNumbers(List<Integer> numbers){
        numbers.stream().filter(number -> number /2 ==0).forEach(number -> System.out.println(number));
    }
}
