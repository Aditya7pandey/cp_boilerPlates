import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for(int i =0;i<t;i++){
        fun(in);
      }
  }
  
  static void fun(Scanner in){
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<arr.length;i++){
      arr[i] = in.nextInt();
    }
    
  }
  
}