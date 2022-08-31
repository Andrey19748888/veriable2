public class Main {
    public static void main(String[] args) {
        int mashaOld = 67760;
        int mashaNew = (int)(mashaOld * 1.1);
        int mashaDiff = (mashaNew - mashaOld) * 12;
        System.out.println(" Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на "
                +  mashaDiff +  " рублей.");
        int denisOld = 83690;
        int denisNew = (int)(denisOld * 1.1);
        int denisDiff = (denisNew - denisOld) * 12;
        System.out.println(" Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на "
                +  denisDiff +  " рублей.");
        int kristinaOld = 76230;
        int kristinaNew = (int)(kristinaOld * 1.1);
        int kristinaDiff = (kristinaNew - kristinaOld) * 12;
        System.out.println(" Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на "
                +  kristinaDiff +  " рублей.");


    }
}