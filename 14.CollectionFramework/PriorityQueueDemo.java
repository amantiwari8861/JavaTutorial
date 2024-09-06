import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) throws InterruptedException
    {

        Comparator<Integer> asc = (e1, e2) -> {
            // System.out.println("comparing "+e1+" and "+e2);
            if (e1 == e2) {
                return 0;
            } else if (e1 > e2) {
            // } else if (e1 < e2) {
                return 1;
            } else {
                return -1;
            }
        };
        PriorityQueue<Integer> pq = new PriorityQueue<>(asc);
        pq.addAll(List.of(56, 283, 24, 67, 678, 99, 35, 12, 98));

        System.out.println(pq);
        while (!pq.isEmpty()) 
        {
            System.out.print(pq.poll()+",");
            Thread.sleep(3000);
        }
       

    }
}
