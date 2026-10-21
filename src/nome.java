import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;
public class nome {
    public static void main(String args[]) {

        Ni();
    }

    public static void Ni() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:\n  ");
        String nome = sc.nextLine();
        System.out.println("Seu nome é  " + nome);
        System.out.println("Digite um numero positivo:  ");
        int numero = sc.nextInt();
        sc.close();
        for (int n = 1; n <= numero; n++) {
            System.out.println(n);
            n++;
        }
        for (int n1 = numero; n1 > 0; n1--) {
            System.out.println(n1);

        }
        if (nome.length() >= 6){
        int n2=0;
            while(numero>n2){
                System.out.println(nome);
                n2++;

            }
        }else{
            System.out.println(nome);
        }
    }
}





