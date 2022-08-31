public class Main {
    public static void main(String[] args) {
        int kilo = 1000;
        int weight = 7;
        int reduceWeight = kilo + weight;
        int losingWeight1 = 250;
        int losingWeight2 = 500;
        int numberOfDays1 = reduceWeight / losingWeight1;
        System.out.println( " Если спортсмен будет терять " + losingWeight1 + " ему понадобиться " +
                numberOfDays1 + " дня "       );
        int numberOfDays2 = reduceWeight / losingWeight2;
        System.out.println( " Если спортсмен будет терять " + losingWeight2 + " ему понадобиться " +
                numberOfDays2 + " дня "       );



    }
}