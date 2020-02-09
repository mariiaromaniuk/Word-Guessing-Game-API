package hangman;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;


/**
 * @author Mariia Romaniuk
 */


public class Dictionary {

    public static final int EASY = 1;
    public static final int MED = 2;
    public static final int HARD = 4;

    private final int difficulty;

    private ArrayList<Word> words;

    //A difficulty constant or a union representing multiple difficulties
    public Dictionary(int difficulty) {
        this.difficulty = difficulty;
        words = new ArrayList<>();
        reset();
    }


    public final void reset(){

        try {
            String urlPath = "http://www.wordgenerator.net";
            URL url = new URL(urlPath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            Word word;
            String buffer;
            while ((buffer = reader.readLine()) != null) {
                buffer = buffer.trim();
                word = new Word(buffer);
                if ((((difficulty & EASY) == EASY) && word.isEasy())
                        || (((difficulty & MED) == MED) && word.isMed())
                        || (((difficulty & HARD) == HARD) && word.isHard()))
                    words.add(word);
            }
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error loading data.\n" + ex.getMessage(), "URL Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Word nextWord() {
        if (isOutOfWords()) {
            reset();
            return null;
        }
        int index = (int) (Math.random() * words.size());
        return words.remove(index);
    }

    public boolean isOutOfWords() {
        return words.isEmpty();
    }

    public void doMethod(int param) {
        System.out.println(param);
        switch (param) {
            case 1:
                System.out.println("one");
                break;
        }
    }

}
