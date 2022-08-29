public class Main {
    public static void main(String[] args) {
       int totalSheets = 480;
       int ludmilaStudents = 23;
       int annaStudents = 27;
       int katiaStudents = 30;
       int totalStudents =  ludmilaStudents + annaStudents + katiaStudents;
       System.out.println(totalStudents);
       int sheetsPerPerson = totalSheets / totalStudents;
        System.out.println(" На каждого ученика расчитано " + sheetsPerPerson + " листов ");




    }
}