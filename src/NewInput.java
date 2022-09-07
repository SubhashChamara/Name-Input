import java.util.Scanner;

public class NewInput {

    public NewInput(String text) {
        this.text = text;
        this.replaceword = replaceword;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReplaceword() {
        return replaceword;
    }

    public void setReplaceword(String replaceword) {
        this.replaceword = replaceword;
    }

    private String text;
    private String replaceword;
    public void wordNew() {



        Scanner scn2 = new Scanner(System.in);
        System.out.print("Please enter a word to replace?:");
        String replaceword = scn2.next();

        Scanner scn3 = new Scanner(System.in);
        System.out.print("Please enter new word to replace?:");

        String newWord = scn3.next();


        Replace replace = new Replace(text,replaceword,newWord);
        replace.result();
    }


}
