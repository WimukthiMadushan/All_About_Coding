//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void SwapUsingThirdVariable(int a, int b){
        System.out.println("Before Swapping " + "a = " + a + " and " +  " b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping " + " a = " + a + " and " +  " b = " + b);
    }
    public static void SwapWithoutVariable(int a, int b){
        System.out.println("Before Swapping " + "a = " + a + " and " +  " b = " + b);
        a = a + b;  // a = 30
        b = a - b;  // b = 10
        a = a - b;  // a = 20
        System.out.println("After Swapping " + " a = " + a + " and " +  " b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //SwapUsingThirdVariable(a, b);
        SwapWithoutVariable(a, b);


    }
}