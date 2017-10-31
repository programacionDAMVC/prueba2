public class TestMatematicas {
    public static void main(String args[]){

        int numeroLeido = 170;

        boolean resultadoUno = Matematicas.esPar(numeroLeido);
        System.out.println(numeroLeido + " ¿es par? " + resultadoUno);

        boolean resultadoDos = Matematicas.esDivisiblePorTres(numeroLeido);
        System.out.println(numeroLeido + " ¿es divisible por tres? " + resultadoDos);

        boolean resultadoTres = Matematicas.esDivisiblePorCinco(numeroLeido);
        System.out.println(numeroLeido + " ¿es por cinco? " + resultadoTres);


    }
}
