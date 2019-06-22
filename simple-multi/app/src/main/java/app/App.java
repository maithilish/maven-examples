package app;

import util.Util;

public class App {

    public static void main(String[] args) {
        System.out.println(new App().greet("World!"));
    }

    public String greet(String name) {
        return Util.join("Hello ", name);
    }
}
