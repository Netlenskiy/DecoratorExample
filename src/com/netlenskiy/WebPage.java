package com.netlenskiy;

public class WebPage implements Page {

    @Override
    public String generate() {
        return "Lorem ipsum dolor \n" +
                "sit amet, consectetur \n" +
                "adipiscing elit.  \n" +
                "Suspendisse pulvinar  \n" +
                "ultrices consequat. \n";
    }
}
