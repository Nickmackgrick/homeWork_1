public class HomeWorkApp {
    public static void main (String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Orange");
    }
    public static void checkSumSign(){
        int a = -100;
        int b = 20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c <= 0) {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void printColor(){
        int value = 200;
        if (value <= 0){
            System.out.println("Red");
        }
        if (0<value && value<=100){
            System.out.println("Orange");
        }
        System.out.println("Green");
    }
    public static void compareNumbers(){
        int a = 25;
        int b = 23;
        if (a>=b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}



