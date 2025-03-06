//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String word = "Learn Test Automation with Java";

        String rev = "";

        String[] splitword = word.split("");
        int count = splitword.length;
        System.out.println(count);

        for(int i= splitword.length-1; i>=0; i--){
            rev = rev + splitword[i] + " ";
        }
        System.out.println(rev);
    }
}