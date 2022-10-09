public class VariableExercise {
    //global static/class variable declared outside methods inside class so all methods can access
   static String name = "Di-pika";
   public static void printMyLastName(){
       //local variable for printMyLastName
       String lastname = "Patel";
       System.out.println(lastname);
    }
    public static void printMYAge(){
       int age = 100;
       System.out.println(age);
   }
    public static void main(String[] args){
       //local variable only accessible to main method body
        int a = 10;

        System.out.println(name);
        System.out.println(a);
        printMYAge();
        printMyLastName();
    }
}

