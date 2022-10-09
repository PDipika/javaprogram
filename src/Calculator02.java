public class Calculator02 {
    static int Answer;


    public static void Addition(int a, int b){
        Answer = a + b ;
        System.out.println("Addition of " + a + " and " + b + " = " + Answer);
    }
    public void Subtraction(int a, int b){
        Answer = a - b ;
        System.out.print("Subtraction of " + a + " and " + b + " = " + Answer);
    }
     public static void main(String[] args){
        Calculator02 calculator02 = new Calculator02();
        Addition(30,40 );
        calculator02.Subtraction(-5, 15);
         Addition(300,40);
        calculator02.Subtraction(25, 15);
     }

}
