public class CodingHours {
    public static void main(String[] args) {
        // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        // Egy félév hosszúsága 17 hét
        //
        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        //
        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra

        int weeklycodinghours = 6+5;
        int semester = 17;
        double weeklyworkinghours = 52;
        double percentage = (weeklycodinghours/weeklyworkinghours)*100;

        System.out.println("Egy hallgató egy félév során " + weeklycodinghours*semester + " órát tölt kódolással.");
        System.out.printf("Egy hallgató a félév %.2f " , percentage);
        System.out.print("százalékát tölti kódolással.");
    }
}
