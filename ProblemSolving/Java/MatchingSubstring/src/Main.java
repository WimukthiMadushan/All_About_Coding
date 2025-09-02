public class Main {
    public static void main(String[] args) {
       //FindSubstring();
       FindAndCountSubstringWithOverlap();
       FindAndCountSubstringWithOutOverlap();
    }

    public static void FindSubstring(){
        String text = "hello world";
        String pattern = "world";
        if(text.contains(pattern)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void FindAndCountSubstringWithOverlap(){
        String text = "aababa";
        String pattern = "aba";

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(pattern, index)) != -1){
            count++;
            index++;
        }

        System.out.println("Count (with overlap): " + count);
    }

    public static void FindAndCountSubstringWithOutOverlap(){
        String text = "ababa";
        String pattern = "aba";

        int index = 0;
        int count = 0;

        while((index = text.indexOf(pattern, index)) != -1){
            count++;
            index += pattern.length();
        }
        System.out.println("Count (without overlap): " + count);

    }

}