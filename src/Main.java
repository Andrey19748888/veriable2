public class Main {
    public static void main(String[] args) {
        byte doesPerMinute = 16/2;
        short makesInDay = 1440 * 8;
        int doesItInThreeDays = 11520 * 3;
        int doesInMonth = doesItInThreeDays * 30;
        System.out.println(" За одини сутки машина произвела бутылок " + makesInDay + " штук");
        System.out.println(" За три дня  машина произвела бутылок " + doesItInThreeDays + " штук ");
        System.out.println(" За один месяц машина произвела бутылок " + doesInMonth + " штук ");


    }
}