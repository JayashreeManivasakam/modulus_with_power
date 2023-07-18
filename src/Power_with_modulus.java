import java.util.Scanner;
public class Power_with_modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a,b,c");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int result=1;
        for (int i=0;i<b;i++){
            a=a%c;
            result=(result*a)%c;
        }
        System.out.println(result%c);
    }
}
