public class Recursion_Basic {
    public static void main(String[] args) {
        int n=5;
        PrintFromLast(n);
        System.out.println("------------------------------");
        PrintFromFirst(n);
        System.out.println("------------------------------");
        System.out.println( Factorial(n) );
        System.out.println("------------------------------");
        int n2=1234;
        System.out.println(SumOfDigits(n2));
        System.out.println("------------------------------");
        System.out.println(ProductOfDigits(n2));
        System.out.println("------------------------------");
        Increment(n);
        System.out.println("------------------------------");
        Rev(n2);
        System.out.println(sum);
        System.out.println("------------------------------");
        int n3=1234321;
        isPalin(n3);
        System.out.println(palin==n3);
        System.out.println("------------------------------");
        int n4=6040;
        NumOfZeroes(n4);
//        System.out.println(count);
        System.out.println("------------------------------");
        System.out.println(countZeroes(n4));
    }
    public static void PrintFromLast(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        PrintFromLast(n-1);
    }
    public static void PrintFromFirst(int n){
        if(n==0){
            return ;
        }
        PrintFromFirst(n-1);
        System.out.println(n);
    }
    public static int Factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * Factorial(n-1);
    }
    public static int SumOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) + SumOfDigits(n/10);
    }
    public static int ProductOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * SumOfDigits(n/10);
    }
    public static void Increment(int n){
        if(n==0){
            return;
        }
//        Increment(n--); it will give infinte because n-- is post decrement which means it will return the current value
//        and after that it will try to decrement like that in all the cases it will first return the value and after that decrement hence it will return 5 always never decrements
//        System.out.println(n);
        Increment(--n);
        System.out.println(n);
    }
    static int sum=0;
    public static void Rev(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        Rev(n/10);
    }
    static int palin=0;
    public static void isPalin(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        palin=palin*10+rem;
        isPalin(n/10);
    }
    static int count=0;
    public static void NumOfZeroes(int n){
        if(n%10==n){
            return;
        }
        if(n%10==0){
            count++;
            NumOfZeroes(n/10);
        }
        NumOfZeroes(n/10);
    }

    //another way is taking helper function

    public static int countZeroes(int n){
        int counter=0;
        return helper(n,counter);
    }
    public static int helper(int n,int counter){
        if(n==0){
            return counter;
        }
        if(n%10==0){
            return helper(n/10,counter+1);
        }
        return helper(n/10,counter);
    }
}
