package TestSellenium;

public class Pattern {
    public static void main(String[] args) {
        PatternPrint(5);
        }

    static void PatternPrint(int n){
        for (int i = 0; i < n; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
