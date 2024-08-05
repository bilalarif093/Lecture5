public class Main {
    public static void main(String[] args) {
        //factorial 4! = 3 * 2!
        //2! = 2 * 1!
        //1! = 1 * 0!
        //0! = 1 base condition
        // n! = n * n-1!
        //n*fact(n-1);

        //printSeries(3);
        //System.out.println(countDigit(123));
        System.out.println(fact(4));
        //power
        //n^p = n*n......p time
        //n^1  = n
        //n^2 = n*n^(1)
        //int prevpow = power(n,p-1);
        //return num*prevpow
    }
    static int power(int num,int exp){
        if (exp==0)
            return 1;
        return  num * power(num,exp-1);
    }
    //factorial
    private static int fact(int num){//1
        if(num == 0 || num == 1){
            return num;
        }
        int prevfact = fact(num-1);//2-1 = 1
        return num * prevfact;
    }







    //recursive function int n = 123/10;=>12.3==0 CountDigit(num/10)
//    public static int countDigit(int num){//1
//        //recursive solution
//        if (num/10==0)     //1/10 =0
//            return 1;
//        return 1 + countDigit(num/10);//12/10=1.2
//
//
//    }
    static void printSeries(int num){//3
        //base condition
        if(num>1) {
            printSeries(num - 1);// recursive call
        }
        System.out.println(num);//print 5 4 3 2 1

    }

}




//        //caller
//        System.out.println("hello");
//        /*
//        * call by value
//        *  print 1 to 5
//        * pass by reference
//        * */
//        printNumber(5);
//        printNumber(6.5);
//        int [] newArr = {10,20,30,40};
//        int res = sumOfArray(newArr);
//        System.out.println(res);
//
//
//
//        //Function...
//        //print();
//        //access modifier
//        //public everyone can access this function
//        //private only current class can access
//        //default can be accessible in default package/folder
//    }
//    //array non-primitive and reference data structure
//    static int sumOfArray(int [] arr){//pass by reference
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }
//    //function overloading
//    //1. same return type, same name but different number of arguments
//    //void abc(int n){}
//    //void abc(int n1,int n2){}
//    //2. same return type, same name but different sequence parameters/ arguments
//    //void abc(int n,doubt d){}
//    //void abc(doubt d, int n){}
//    //3. same return type, same name but different data type of parameters
//    //void abc(int n){}
//    //void abc(String n){}
//    //void abc(int n,doubt d){}
//    //void abc(int n,String s){}
//    private static void printNumber(int i) {//pass by value
//        for (int j = 0; j < i; j++) {
//            System.out.println(j+1);
//        }
//    }
//    private static void printNumber(double i) {
//
//    }
//
//    public static void print(){
//        //callie
//        System.out.println("message 1");
//        print1();
//    }
//
//    private static void print1() {
//        System.out.println("message 2");
//        print2();
//    }
//
//    private static void print2() {
//        System.out.println("message 3");
//    }


