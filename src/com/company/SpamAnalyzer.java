package com.company;

class SpamAnalyzer extends KeywordAnalyzer{
    private final String[] keyWords;

    SpamAnalyzer(String[] keyWords) {
        this.keyWords = keyWords.clone();
    }

    @Override
    protected String[] getKeywords() {
        return keyWords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

}

