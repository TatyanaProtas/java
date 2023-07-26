class Answer {
    public int countNTriangle(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}

public class Printer{ 
    public static void main(String[] args) { 
      int n = 0;

      if (args.length == 0) {
        n = 4;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     

      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}
