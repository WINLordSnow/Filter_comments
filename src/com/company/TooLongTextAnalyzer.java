package com.company;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return text.length() < maxLength ? Label.OK : Label.TOO_LONG;
    }
}