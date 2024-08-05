public class Main {
    public static void main(String[] args) {
        //recursive
        //num = 123
        /*digitCount(123)
        * 123 = digitCount(123/10) 123/10 = 12
        * 12 = 1+digitCount(12/10) 12/10 = 1
        * 1 = 1+digitCount(1/10) 1/10 = 0
        * num == 0 base condition
        * return 1
        * */

        /* factorial
        * 4! = 4 * 3 * 2 * 1 = 24
        * 3! = 3 * 2!
        * 2! = 2 * 1!
        * 1! = 1 * 0!
        * 0! = 1
        * n! = n * (n-1)!
        * */



        /*
        * int Power (base, exp){}
        * 2^4 = 2 * 2^3 = 16
        * 2^3 = 2 * 2^2 = 8
        * 2^2 = 2 * 2 = 2
        * 2^1 = 2 * 1 = 2
        * 2^0 = 1//base condition
        *
        * recursive problem always solve through break down process
        * n^p = n * n^p-1 (recursive call)
        *
        * */

        //recursion
        /*
        *  a function call itself
        *  5 4 3 2 1 solution recursive code
        *  through stack and through recursive tree
        *
        * */
        //printSeries(5);
        //remaining code
        //System.out.println("Power = "+power(2,4));
        //Power = 16
        //System.out.println(fact(4));//24
        System.out.println(digitCount(123));
    }
    //digit Count
    public static int digitCount(int num){//1
        if(num/10 == 0){//num/10 == 0 true
            return 1;
        }
        else{
            //recursive call
            return 1 + digitCount(num/10);//stack push
        }


    }


    //find factorial
//    public static int fact(int num){ // 1
//        if (num==0 || num==1){//num = 1 true
//            return 1;
//        }
//        else {
//            return num * fact(num - 1);//recursive call(stack push)
//        }
//    }






    //Power function using recursion
//    static int power (int base, int exp){//base= 2, exp = 0
//        if(exp==0) {//exp == 0 true
//            return 1;
//        }
//        else {
//            return base * power(base, exp - 1);//exp 1-1 = 0
//        }
//    }







//    //infinite time recursive calls
    public static void printSeries(int num){//1
        if(num>1) {//false
            printSeries(num - 1);
        }
        else {
            System.out.println(num);//1 2 3 4 5
        }
        //return
    }

}
