class Helper {
    void changeNum(int num) // pass by value (primitive data type)
    {
        num = 50;
        System.out.println("num=" + num + " in changeNum");
    }

    void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

    void bubbleSort(int arr[]) 
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

public class PassByValueAndReference {

    public static void main(String[] args) {

        Helper h = new Helper();
        // int num = 10;
        // h.changeNum(num);
        // System.out.println("num=" + num + " in main");

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (1000.0 * Math.random());

        System.out.print("Before sorting :");
        h.printArray(arr);
        h.bubbleSort(arr);
        
        System.out.print("After sorting :");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }
}