public class Nested {

    public static void main(String[] args) throws Exception {
        
        // 10 chapters -> task
        //      5 sections -> sub task
        //          2 para -> 

        // for (int i = 1; i <= 10; i++) 
        // {
        //     System.out.println("Chapter :"+i);
        //     for (int j = 1; j <= 5; j++) 
        //     {
        //         System.out.println("\tSection :"+j);
        //         for (int k = 1; k <= 2; k++) 
        //         {
        //             System.out.println("\t\tPara :"+k);
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < 5; i++) 
        // {
        //     for (int j = 0; j < 4; j++) 
        //     {
        //         System.out.print("i="+i+" j="+j+"\t");
        //         Thread.sleep(1000);
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("*");
                // Thread.sleep(1000);
            }
            System.out.println();
        }


    }
}