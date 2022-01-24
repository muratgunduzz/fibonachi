import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        int n,x = 0,y = 1,z;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");//Eleman sayısı girilecek.
        n = inp.nextByte();
        for (int i = 1;i <= n;i++){
            z = x + y;
            System.out.println(z);
            x = y;
            y = z;
        }
    }
}
