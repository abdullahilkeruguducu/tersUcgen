import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayisini yaziniz :");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++){
            for (int a=1; a<=i; a++){
                System.out.print(" ");
            }
            for (int b=(2*n)-1; b>2*i; b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}