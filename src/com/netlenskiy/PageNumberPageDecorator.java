package com.netlenskiy;

public class PageNumberPageDecorator implements Page {

    private Page page;

    private int pageNumber;

    PageNumberPageDecorator(Page page, int pageNumber) {
        this.page = page;
        this.pageNumber = pageNumber;
    }

    @Override
    public String generate() {
        String text = page.generate();
        text += "    " + pageNumber + "\n";
        return text;
    }
}
