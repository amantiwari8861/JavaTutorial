public class StudentDaoImpl implements StudentDao
{
    @Override
    public void renewMembership(Student student) 
    {
        System.out.println(INSTITUTE_NAME);
        student.setMembershipExpired(false);
        System.out.println(student);
        
    }
}