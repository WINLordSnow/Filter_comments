package com.company;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private static final String[] smile = new String[]{":(", "=(", ":|"};

    @Override
    protected String[] getKeywords() {
        return smile;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
