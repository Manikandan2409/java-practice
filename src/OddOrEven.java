public class OddOrEven {
    public static void main(String[] args) {
        if (isEven(5)) {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }

     static boolean   isEven(int n){
        return (n & 1) == 0;
    }
    
}
