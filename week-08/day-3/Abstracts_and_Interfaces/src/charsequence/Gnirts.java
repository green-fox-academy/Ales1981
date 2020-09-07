package charsequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence{
    private String word;

    public Gnirts(String word) {
        this.word = word;
    }

    @Override
    public int length() {
        return this.word.length();
    }

    @Override
    public char charAt(int index) {
        //word as if it was backwards
        return this.word.charAt(this.word.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.word.subSequence(start, end);
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
