/**
 * method(a function in class) : group of statements which together performs a task
 * Advantages of methods :
 * 1. reusability
 * 2. modularity
 * 3. reduce complexity
 * 4. increase readibility
 * 
 * 1. Built in 
 * 2. user-defined
 * 
 *  1. no arguments no return type
 *  2. no arguments with return type
 *  3. with arguments no return type
 *  4. with arguments and return type
 */
public class Methods {

    //no arguments no return type
    void showCalcCompany()
    {
        System.out.println("Casio calculator");
    }
    //no arguments with return type
    public static void main(String[] args) {
        // showCalcCompany();
        System.out.println("before calling in main");
        Methods m=new Methods();
        m.showCalcCompany();
        m.showCalcCompany();
        m.showCalcCompany();
        m.showCalcCompany();
        m.showCalcCompany();
        m.showCalcCompany();
        m.showCalcCompany();
        System.out.println("after calling in main");

    }
}