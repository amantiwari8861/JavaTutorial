import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // initialization ; condition ; iteration
        // for(;;)
        // {
        //     System.out.println("Hiii");
        // }
        // for (int i = 0; i < 10; i++) 
        // {
        //     System.out.println(i);
        // }
        // int i,j;
        // for (i = 1000,j=1; i>0 ; i/=5,j++) 
        // {
        //     System.out.println(i+" : "+j);
        // }
        // for(int i=1000;i>0;i--)
        // {
        //     System.out.print(i+" ");
        // }
        /*
         *  psuedo code (dry-run)
         * 
         * Step 1: i=0
         *         0<10 True
         *         print 0
         * 
         * Step 2: i=1
         *          1<10 T
         *          print 1
         * 
         * .
         * .
         * Step 11: i=10
         *          10<10 False
         *      loop terminated! 
         */

        //  while (true) {
        //     System.out.println("Hiii");
        //  }
        // int i=0;
        // while (i<10) 
        // {
        //     System.out.println(i);
        //     i++;
        // }
        // int i=10;
        // while (i>0) 
        // {
        //     System.out.println(i);
        //     i--;
        // }
        
        //Case : 1
        // int i=0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i<10);
        
        // case 2:
        
        // int i=0;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while (i>10);
        // boolean ans;
        // do {
        //     System.out.println("deadpool and wolverine dekhne chalna hai ?");
        //     ans=sc.nextBoolean();
        // } while (ans!=true);
        // System.out.println("Good job !");

        int arr[]={10,100,1023,46,7,8,9,8765,3,5,54};
        // for (int j = 0; j < arr.length; j++) 
        // {
        //     System.out.println(arr[j]);
        // }

        for (int e : arr) 
        {
            System.out.println(e);
        }


        sc.close();
    }
}
