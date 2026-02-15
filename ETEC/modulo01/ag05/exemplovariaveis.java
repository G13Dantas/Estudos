public class exemplovariaveis {
    public static void main (String args []) {
        //Declaração de variáveis
        //Inteiros
        byte numeroByte = 127;
        short numeroShort = 32767;
        int numeroInt = 2147483647;
        long numeroLong = 9223372036854775807L;
        //Reais
        float numeroFloat = 1e38f;
        double numeroDouble = 1e308;
        //Caractere
        char caractereChar = 'A';
        String textoString = "Texto Exemplo";
        //Booleano
        boolean verdadeiroBoolean = true;
        boolean falsoBoolean = false;

        //Exibição de valores
        System.out.println("ValorByte: " + numeroByte);
        System.out.println("ValorShort: " + numeroShort);
        System.out.println("ValorInt: " + numeroInt);
        System.out.println("ValorLong: " + numeroLong);
        System.out.println("ValorFloat: " + numeroFloat);
        System.out.println("ValorDouble: " + numeroDouble);
        System.out.println("ValorChar: " + caractereChar);
        System.out.println("ValorString: " + textoString);
        System.out.println("ValorBoolean Verdadeiro: " + verdadeiroBoolean);
        System.out.println("ValorBoolean Falso: " + falsoBoolean);
    }
}