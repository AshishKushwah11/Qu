package Queue;

// import Recursion.print_n_2;

public class Q3 {
    public static void main(String[] args) {
        MyQueue que = new MyQueue();

        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);

        
        System.out.println(que.remove());
        // System.out.println(que.peek());
        
        System.out.println(que);
        
    }
    
}
class MyQueue{
    private int [] arr;
    private int itr;

    MyQueue(){
        this.arr = new int[10];
        this.itr = -1;
    }
    public void add(int ele){
        if(this.itr == this.arr.length-1){
            System.out.println("Queue is full");

            int[] narr = new int[this.arr.length*2];
            for(int i=0;i<=this.itr;i++){
                narr[i] = arr[i];
            }
            this.arr = narr;

        }else{
            this.itr++;
            this.arr[this.itr]=ele;
        }
    }

    public int remove(){
        if(this.itr == -1){
            System.err.println("Queue is empty");
            return -1;
        }else{
            int ans = this.arr[0];
            return ans;
        }
    }
    public int size(){
        return this.itr+1;
    }
    public String toString(){
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<=this.itr;i++){
            ans.append(this.arr[i]+"," );
        }
        return ans.toString();
    }
}
