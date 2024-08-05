public class Main {
    public static void main(String[] args) {
        //caller
        System.out.println("hello");


        //Function...
        //print();
        //access modifier
        //public everyone can access this function
        //private only current class can access
        //default can be accessible in default package/folder
    }
    public static void print(){
        //callie
        System.out.println("message 1");
        print1();
    }

    private static void print1() {
        System.out.println("message 2");
        print2();
    }

    private static void print2() {
        System.out.println("message 3");
    }

}
