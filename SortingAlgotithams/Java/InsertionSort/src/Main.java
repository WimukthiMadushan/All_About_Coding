
public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,39,19,0,56,83,2,76,10,94,21,12,94,76,46,24};

        for(int i = 1; i < numbers.length; i++){
            int key = numbers[i];
            int j = i-1;
            while(j >= 0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}