class Calculator {
   public int add(int a,int b){
      return a+b;
   }
   protected int add(int a,int b,int c){
      return a+b+c;
   }
   private double add(double x,double y){
      return x + y;
   } 
   public void display(double x,double y){
     double total = x + y;
     System.out.println("the sum is:" + total);         
   }
}
public class Main{
   public static void main(String[] args){
      Calculator sum1 = new Calculator();
      Calculator sum2 = new Calculator();
      int tot1 = sum1.add(6,7);
      double tot2= sum2.add(4,1);
      sum1.display(6.7,4.1);
      System.out.println(tot1);
      System.out.println(tot2);
   }
}