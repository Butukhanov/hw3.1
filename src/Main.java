public class Main {
    public static void main(String[] args) {
        int price = 1_000;
        int theNumberOfRublesForOneBonusMilli = 20;
        int bonus = price / theNumberOfRublesForOneBonusMilli;
        System.out.println(bonus);
    }
}
