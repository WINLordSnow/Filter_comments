package com.company;

class Main {
    public static void main(String[] args) {
        String text = "dfgslo:(";
        TextAnalyzer[] textAnalyzers = new TextAnalyzer[]{
                new SpamAnalyzer(new String[]{"loh"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(10)};
        System.out.println(checkLabels(textAnalyzers, text));
    }

    static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer textAnalyzer : analyzers) {
            Label label = textAnalyzer.processText(text);
            if (label != Label.OK) {
                return label;
            }
        }
        return Label.OK;
    }
}