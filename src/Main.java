public class Main {
    public static void main(String[] args) {
        double price = 25874.95;
        int mile = 20;
        int bonus = (int) (price / mile);

        /*long price = 25_874_95L; // в копейках
        int mile = 20_00; // в копейках
        int bonus = (int) (price / mile);*/

        System.out.println("Количество бонусных миль: " + bonus);

     }
}


