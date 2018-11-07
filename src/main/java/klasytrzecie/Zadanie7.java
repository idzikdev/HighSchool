package klasytrzecie;

public class Zadanie7 {
    public static int countDividors(int number){
        int counter=2;
        for (int i = 2; i < number; i++) {
            if (number%i==0) counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        int a=2;
        int b=10000;
        int max=1;
        int elMax=2;
        for (int i = a; i <= b; i++) {
            if (countDividors(i)>max){
                max=countDividors(i);
                elMax=i;
            }
        }
        System.out.println("Liczba "+elMax+" ma największą liczbę dzielników "+max);
    }
}
