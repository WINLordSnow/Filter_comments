package com.company;

class Main {
    public static void main(String[] args) {
        String text = "dfgsdg df gdf :(";
        TextAnalyzer[] textAnalyzers = new TextAnalyzer[]{
                new SpamAnalyzer(new String[]{"loh"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(10)};
        System.out.println(checkLabels(textAnalyzers, text));
    }

    static Label checkLabels(TextAnalyzer[] analyzers, String text) {

        return Label.OK;
    }
}