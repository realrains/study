package net.realrain;

public class WordCounter {
    public int countWords(String sentence) {
        return sentence.split(" ").length;
    }
}
