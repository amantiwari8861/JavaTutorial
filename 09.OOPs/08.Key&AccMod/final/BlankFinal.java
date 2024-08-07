class Person
{
    final long aadharNo;// blank final
    Person()
    {
        aadharNo=12345678L;
        // aadharNo=5567767L;// error
    }
    void changeAadharNo(long aadharNo)
    {
        // this.aadharNo=aadharNo;
    }
}
public class BlankFinal {

    public static void main(String[] args) {
        
        // final long aadharNo; // blank final variable
        // aadharNo=43234422778L;
        // aadharNo=672387834;

        Person p=new Person();
        System.out.println(p.aadharNo);
        p.changeAadharNo(5465647643783487L);


    }
}