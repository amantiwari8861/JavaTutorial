// import com.ducat.courses.C;
import com.ducat.councellors.Councellor1;
// import com.ducat.courses.Java;
// import com.ducat.courses.Python;
// import com.ducat.courses.*;
// import com.ducat.councellors.*;
import com.ducat.councellors.Councellor2;
import com.ducat.management.Receptionist;
import com.ducat.trainers.Trainer1;

public class App 
{
    public static void main(String[] args)
    {
        // Java j=new Java(46, 25000);
        // j.showDetails();

        // com.ducat.trainers.Java jt=new com.ducat.trainers.Java(84, 28000);
        // jt.showDetails();

        // C c_course=new C(36, 10000);
        // c_course.showDetails();

        // Python p=new Python(46, 12000);

        // Councellor1 deep=new Councellor1();
        // System.out.println(deep.name);
        // System.out.println(deep.cabinNo);
        // System.out.println(deep.mobileNo);
        // System.out.println(deep.salary);

        // Councellor2 c2=new Councellor2();
        // c2.tellDeepikaMamNo();

        // Receptionist r=new Receptionist();
        // r.showDeepikaMaamDetails();

        Trainer1 t=new Trainer1();
        // t.name="Aman";
        // System.out.println(t.name);

        t.setAge(25);
        System.out.println(t.getAge());

    }
}