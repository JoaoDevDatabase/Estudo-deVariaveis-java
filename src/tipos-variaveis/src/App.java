public class App {
    public static void main(String[] args) throws Exception {

        byte numero = 18; /*
                           * usamos o byte para número pequenos,
                           * mesmo que a JVM transforme o byte para o int e nos de
                           * a mesma resposta
                           */

        short ano; /*
                    * Já o short usamos para números um pouco mais extensos
                    * do que o byte ( que usamos para números menores);
                    * podemos usar o int para número do tamanho de pagamento de funcionário
                    * ou tambem para o ano que estamos querendo mostrar;
                    */

        ano = 2023;

        short numerocurto = 1;
        int numerolongo = numerocurto;
        short numeroLongo = (short) numerolongo; /*
                                                  * Aqui nós usamos o metodo casting,
                                                  * para poder converter o tipo de nosso código !
                                                  */

        System.out.printf("%d%n", numeroLongo);
        System.out.printf("Feliz %d%n", ano);
        System.out.printf("João tem %d%n ", numero);
        System.out.println("Hello, World!");
    }
}
