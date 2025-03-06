import javax.swing.plaf.IconUIResource;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*String word = "Learn Test Automation with Java";

        String rev = "";

        String[] splitword = word.split("");
        int count = splitword.length;
        System.out.println(count);

        for(int i= splitword.length-1; i>=0; i--){
            rev = rev + splitword[i] + " ";
        }
        System.out.println(rev);*/
        String input = "LearnAutomation";
        char toFind = 'a'; // Correct way to assign a character
        int Count = 0;

        input = input.toLowerCase();

        for(int i =0; i<input.length();i++){
            if(input.charAt(i) == toFind){
                Count = Count + 1;
            }
        }

        System.out.println(toFind + "is present" + Count + "Number of times");

    }
    }
