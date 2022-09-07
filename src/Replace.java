import java.util.ArrayList;
import java.util.List;

public class Replace {

    public Replace(String text, String wordReplce, String newWord) {
        this.text = text;
        this.wordReplce = wordReplce;
        this.newWord = newWord;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWordReplce() {
        return wordReplce;
    }

    public void setWordReplce(String wordReplce) {
        this.wordReplce = wordReplce;
    }

    public String getNewWord() {
        return newWord;
    }

    public void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    public String text;
    public String wordReplce;

    public String newWord;

    public void result() {


        List<String> wordlist= new ArrayList<>(List.of(text.split(" ")));

        NewInput newInput = new NewInput(text);

        if(wordlist.contains(wordReplce)){

            wordlist.set(wordlist.indexOf(wordReplce),newWord);



            for (int i = 0; i < wordlist.size(); i++) {
                System.out.print(wordlist.get(i)+" ");
            }

        }
        else{

            System.out.println("The word" + wordReplce +" is not found");

            newInput.wordNew();


        }
    }
}
