package com.company;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer{
    private String[] keyWords;

    SpamAnalyzer(String[] keyWords) {
        this.keyWords = keyWords.clone();
    }

    @Override
    protected String[] getKeywords() {
        return keyWords;
    }

    @Override
    protected Label getLabel() {
        return null;
    }

    @Override
    public Label processText(String text) {
        return null;
    }
}
