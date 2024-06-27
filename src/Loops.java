import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the row count :");
        int n = in.nextInt();
        Loops l = new Loops();

        l.consecutiveNumber(n);
        
    }

// iteration recursive
    public void consecutiveNumber(int n){
        if (n>0) {
            
            consecutiveNumber(n-1);
        }
        if ((n& 1) ==0) {
            System.out.print(n+" ");
        }
    }
// Left Triangle
    public void leftTriangle(int n){
        //Left Triangle
        System.out.println("--------------------left Triangle-----------------");
        for(int i =1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
            // number
                System.out.print(j+" ");
            // star
            //System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
