package fluxos;

/**
 * crie uma nova classe, escreva um for que inicie uma variável n (número atual)
 * como 1 e fatorial (resultado total) como 1. Faça seu laço entre 1 a 10 e
 * calcule o resultado!
 **/

    //utilizando o  (for)
public class Fatorial {
    
    public static void main(String[] args) {
       // try (Scanner in = new Scanner(System.in)) {
       //     System.out.println("Digite sua jornada de trabalho (em horas!)");
       //     int fat = in.nextInt();
        int fat = 1;
        for (int n = 1; n<=10; n++) {
            fat *= n;
            System.out.println("O fatorial de " + n + " é " + "(" + (n - 1) + "!) * " + n + " = " + fat);
        }

        //utilizando o (while + for)
        int total = 0;
        int f = 1;
        for (int n = 1; n <= 10; n++) {
        while (f <= 10) {
            total = n * f;
            System.out.println(total);
            n = total;
            f++;
        }
    }
    }
}
