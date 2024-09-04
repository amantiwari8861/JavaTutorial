import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ArrayList : 
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        
        // Collection -> works on non-primitive(object)
        // Wrapper classes 
        Student stu=new Student(18050, "rajat", 1200, 'M', false, LocalDate.of(2000, 10, 25) , "15 june", 8448179216L);

        // Generics
        List<Student> studentsList=new ArrayList<>();
        studentsList.add(stu);
        studentsList.add(new Student(100, "Aman", 1200, 'M', false, LocalDate.of(2000, 10, 25) , "15 june", 8448179216L));
        // studentsList.add(stu);
        studentsList.add(new Student(18050, "rajat", 1200, 'M', false, LocalDate.of(2000, 10, 25) , "15 june", 8448179216L));

        System.out.println("All Students List :");
        // studentsList.addAll(List.of(new Student(),new Student()));
        // studentsList.forEach(student -> System.out.println(student));

        // Student arr[]=new Student[studentsList.size()];
        // studentsList.toArray(arr);
        // System.out.println("________________________________________");
        // System.out.println(Arrays.toString(arr));

        // List<Student> stuList=Arrays.asList(arr);
        // System.out.println("____________________________________");
        // stuList.toArray(arr);
        // System.out.println(Arrays.toString(arr));

        // List<Student> stulist1=new ArrayList<>();
        // stuList.add(new Student(101, "Rajat", 1500, 'M', false, LocalDate.of(2000, 10, 25) , "15 june", 8448179216L));
        System.out.println(studentsList);
        // studentsList.removeIf(s->s.getId()==100);
        // System.out.println("==========================================================================");
        // List<Student> newStuList=studentsList.stream().map(e->{
        //     e.setName(e.getName()+" ducat student ");
        //     return e;
        // }).collect(Collectors.toList());
        // System.out.println(studentsList);



    }
}