package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class Calculadora implements OperacaoMatematica {


    @Override
    public void soma(double operando1, double operando2) {
        System.out.println("Soma: " + operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println("Subtracao: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println("multiplicacao: " + operando1 * operando2);
    }

//    @Override
//    public void divisao(double operando1, double operando2) {
//       System.out.println("multiplicacao: " + operando1 / operando2);
//    }

}
