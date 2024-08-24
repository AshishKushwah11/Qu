package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
         que.add(20);
        que.add(30);

        System.out.println(que.remove());
           System.out.println(que.peek());

    }
    
}
