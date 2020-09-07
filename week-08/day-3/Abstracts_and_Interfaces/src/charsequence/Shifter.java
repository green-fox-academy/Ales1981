package charsequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence{
    private String word;
    private int toShift;

    public Shifter(String word) {
        this.word = word;
    }

    public Shifter(String word, int toShift) {
        this.word = word;
        this.toShift = toShift;
    }

    @Override
    public int length() {
        return this.word.length();
    }

    @Override
    public char charAt(int index) {
        return this.word.charAt(index+toShift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.word.subSequence(start+toShift,end);
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
