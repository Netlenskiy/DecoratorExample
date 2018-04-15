package com.netlenskiy;

public class BottomLinePageDecorator implements Page {

    private Page page;

    BottomLinePageDecorator(Page page) {
        this.page = page;
    }

    @Override
    public String generate() {
        String text = page.generate();
        text += "============\n";
        return text;
    }
}
