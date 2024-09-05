import java.time.LocalDate;
import java.util.LinkedList;

class LinkedListDemo 
{
    public static void main(String[] args) {
        
        // LinkedList<String> ll=new LinkedList<>(); 
        // ll.add("rajat");
        // ll.add("Aman");
        // ll.add("Shiv shankar");
        // ll.add("Divyansh");

        // System.out.println(ll);
        // System.out.println(ll.get(1));

        // System.out.println(ll.contains("Aman"));
        Student stu=new Student(2, "Priya Verma", 48000, 'F', true, LocalDate.of(2000, 8, 22), "2023-06-15", 9876543211L);
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(new Student(1, "Rahul Sharma", 50000, 'M', false, LocalDate.of(1998, 5, 15), "2023-07-01", 9876543210L));
        studentList.add(stu);
        studentList.add(new Student(3, "Vikas Patel", 51000, 'M', false, LocalDate.of(1999, 3, 10), "2023-07-10", 9876543212L));
        studentList.add(new Student(4, "Sakshi Gupta", 47000, 'F', true, LocalDate.of(1997, 12, 5), "2023-08-01", 9876543213L));
        studentList.add(new Student(5, "Ankit Reddy", 52000, 'M', false, LocalDate.of(1996, 1, 19), "2023-07-20", 9876543214L));
        // studentList.forEach(s->System.out.println(s));
        // System.out.println(stu);
        // System.out.println(new Student());
        boolean status=studentList.contains(new Student(1, "Rahul Sharma", 50000, 'M', false, LocalDate.of(1998, 5, 15), "2023-07-01", 9876543210L));
        System.out.println(status);
        System.out.println(stu);
        System.out.println(studentList.contains(stu));
        System.out.println(studentList);
        System.out.println(studentList.indexOf(stu));

        studentList.offerFirst(stu);
        studentList.addFirst(stu);
        studentList.pollFirst();
        studentList.removeFirst();
        System.out.println(studentList);
    }
}