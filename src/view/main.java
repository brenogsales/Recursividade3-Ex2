package view;

import controller.Ex2;

public class main {
    public static void main(String[] args) {
        int num = 565255;
        int digito = 5;

        if(num < 10 || num > 999999){
            System.out.print("Número inválido.");
            return;
        }
        if (digito < 0 || digito > 9){
            System.out.print("Digito inválido.");
            return;
        }

        int quantidadeAparicoes = Ex2.numeroAparicoes(num, digito);
        System.out.printf("O digito %d aparece %d vezes no número %d", digito, quantidadeAparicoes, num);
    }
}
