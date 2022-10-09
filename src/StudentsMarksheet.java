public class StudentsMarksheet {
    //global static variables
   static int total;
   static double percentage;
   //no return type with parameter static method
    public static void studentmarksheet(String name, int maths, int science, int english) {
        total = maths + science + english;
        percentage = total/3;

        System.out.println(name +":Total Marks = " + total +" & percentage = " + percentage);

    }

public static void main(String[] args){
        studentmarksheet("Vijay",20,30,40);
        studentmarksheet("Sameer",30, 40,50);
        studentmarksheet("Raj", 40, 50, 60);
}
}

