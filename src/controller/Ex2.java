package controller;

public class Ex2 {
    public Ex2(){
        super();
    }
    public static int numeroAparicoes(int num, int digito){
        if(num == 0){
            return 0;
        }

        int ultimoDigito = num % 10;
        int contador = 0;

        if(ultimoDigito == digito){
            contador = 1;
        }

        return contador + numeroAparicoes(num / 10, digito);
    }
}
