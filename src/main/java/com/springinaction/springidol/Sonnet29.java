package com.springinaction.springidol;

public class Sonnet29 implements Poem{

    private static String[] LINES = {
      "POEM",
      "POEM1",
      "POEM2",
      "POEM3"
    };


    public  Sonnet29() {

    }

    @Override
    public void recite() {
        for (int i = 0; i < LINES.length;i++) {
            System.out.println(LINES[i]);
        }
    }
}
