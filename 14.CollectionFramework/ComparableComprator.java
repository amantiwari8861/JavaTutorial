import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparableComprator
{
    public static void main(String[] args) {
        
        
        Student stu1=new Student(2, "Priya Verma", 48000, 'F', true, LocalDate.of(2000, 8, 22), "2023-06-15", 9876543211L);
        Student stu2=new Student(3, "Vikas Patel", 51000, 'M', false, LocalDate.of(1999, 3, 10), "2023-07-10", 9876543212L);
        Student stu3=new Student(1, "Rahul Sharma", 50000, 'M', false, LocalDate.of(1998, 5, 15), "2023-07-01", 9876543210L);
        Student stu4=new Student(5, "Ankit Reddy", 52000, 'M', false, LocalDate.of(1996, 1, 19), "2023-07-20", 9876543214L);
        Student stu5=new Student(4, "Sakshi Gupta", 47000, 'F', true, LocalDate.of(1997, 12, 5), "2023-08-01", 9876543213L);

        ArrayList<Student> students=new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);
        students.add(stu5);

        // System.out.println(students);
        // Sort using id  

        // Collections.sort(students);

        // System.out.println("after sorting ");
        // System.out.println(students);

        // "a".compareTo("A"); // 97-65 => 32
        // System.out.println("a".compareTo("A"));
        // System.out.println("A".compareTo("a"));
        // System.out.println("a".compareTo("a"));

        // Collections.sort(students,new NameComparator());
        // Collections.sort(students,
        // (e1,e2)->e1.getName().compareTo(e2.getName()));
        Collections.sort(students,
        (s1,s2)->s1.getId()>s2.getId() ? 1
        :(s1.getId()==s2.getId()? 0:-1));
        System.out.println(students);

    }
}

// class NameComparator implements Comparator<Student>
// {
//     @Override
//     public int compare(Student o1, Student o2) {
//         return o1.getName().compareTo(o2.getName());
//     }
// }