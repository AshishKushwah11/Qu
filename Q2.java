package Queue;
import java.util.ArrayDeque;
import java.util.ArrayDeque;

public class Q2 {
    public static void main(String[] args) {
       
        

    }
    
}
claas MyQueue{
    private int [] arr;
    private int [] itr;

    MayQueue(){
      this.arr = new int [10];
    }
    MyQueue(int size){
        this.arr = new int[size];
        this.itr = 0;
    }
    public void add(int val){
        if(this.itr==this.arr.length){
            System.out.println("Queue is full");

        }else{
            this.arr[itr]=val;
        }
    }
}
