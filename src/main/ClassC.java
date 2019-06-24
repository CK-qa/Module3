package main;

import java.util.function.Consumer;

public class ClassC {

    public static void main(String[] args) {
        System.out.println("Mod 3 ClassC");
    }

    void test(Consumer<String> foo) {

    }

    public void testHint() {
        test(tst -> {
            System.out.println(tst);
        });
    }

    //test3
}
