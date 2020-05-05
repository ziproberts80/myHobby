package buggyclass;

import java.util.ArrayList;
import java.util.List;

public class BuggyClass {

    private List<String> musicalNotes;

    public static void main(String[] args) {
        BuggyClass bc = new BuggyClass();
        bc.initializeList();
        bc.printListValues();

    }//m

    private void initializeList() {

        if (musicalNotes == null) {
            musicalNotes = new ArrayList<>();
        }

        musicalNotes.add("do");
        musicalNotes.add("re");
        musicalNotes.add("mi");
        musicalNotes.add("fa");
        musicalNotes.add("so");
        musicalNotes.add("la");
        musicalNotes.add("ti");

    }//iL

    private void printListValues() {

        for (int i = 0; i < musicalNotes.size(); i++) {
            System.out.println(musicalNotes.get(i));
        }
    }
}//c
