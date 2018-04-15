package com.netlenskiy;

public class TopLinePageDecorator implements Page {

    private Page page;

    TopLinePageDecorator(Page page) {
        this.page = page;
    }

    @Override
    public String generate() {
        String text = "============\n";
        text += page.generate();
        return text;
    }
}
