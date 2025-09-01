public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,39,19,0,56,83,2,76,10,94,21,12,94,76,46,24};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length-1; j++){
                if(numbers[j] > numbers[j+1]){
                    int a = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = a;
                }
            }
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}