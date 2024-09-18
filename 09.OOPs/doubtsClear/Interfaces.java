interface RBI {
    double MIN_INTEREST_RATE = 4.0;
    double MAX_INTEREST_RATE = 12.0;
    void openCustAccount();
    default void holiday()
    {
        auditDate();
        System.out.println("there will be holiday on saturday and sunday ");
    }
    static void showBankHolidays()
    {
        System.out.println("there will be holiday on saturday and sunday acc. to RBI"); 
    }
    private void auditDate()
    {
        System.out.println("there will be holiday on last day of month");
    }
}

class PNB implements RBI {
    @Override
    public void openCustAccount() {
        auditDate();
        System.out.println(MIN_INTEREST_RATE+" : "+MAX_INTEREST_RATE);
    }
}

class SBI implements RBI {

    @Override
    public void holiday()
    {
        System.out.println("there will be holiday on saturday and sunday ");
        System.out.println("and there is lunch of 2 hours");
    }
    @Override
    public void openCustAccount() {
        System.out.println(MIN_INTEREST_RATE+" : "+MAX_INTEREST_RATE);
    }
}

public class Interfaces {

    public static void main(String[] args) {
        // SBI s=new SBI();
        // s.openCustAccount();
        // s.holiday();
        // s.showBankHolidays();

        PNB p=new PNB();
        p.holiday();

        // RBI.showBankHolidays();
    }
}