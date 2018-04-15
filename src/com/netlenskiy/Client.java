package com.netlenskiy;

public class Client {

    public static void main(String[] args) {
        Page page = new WebPage();
        System.out.println("PAGE WITHOUT DECORATION\n");
        System.out.println(page.generate());
        System.out.println("\nPAGE WITH NUMBER\n");
        System.out.println(new PageNumberPageDecorator(page, 1).generate());
        System.out.println("\nPAGE WITH TOP LINE\n");
        System.out.println(new TopLinePageDecorator(page).generate());
        System.out.println("\nPAGE WITH BOTTOM LINE\n");
        System.out.println(new BottomLinePageDecorator(page).generate());
        System.out.println("\nPAGE WITH TOP AND BOTTOM LINE\n");
        System.out.println(new TopLinePageDecorator(new BottomLinePageDecorator(page)).generate());
        System.out.println("\nPAGE WITH BOTTOM LINE AND NUMBER\n");
        System.out.println(new PageNumberPageDecorator(new BottomLinePageDecorator(page), 2).generate());
        System.out.println("\nPAGE WITH TOP LINE AND NUMBER\n");
        System.out.println(new TopLinePageDecorator(new PageNumberPageDecorator(page, 3)).generate());
        System.out.println("\nPAGE WITH TOP AND BOTTOM LINES AND NUMBER\n");
        System.out.println(new TopLinePageDecorator(new PageNumberPageDecorator(new BottomLinePageDecorator(page), 4)).generate());
    }
}
