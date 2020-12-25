package app;

import java.io.IOException;
import java.util.StringTokenizer;

public class Chapter3String {
    public static void main(String[] args) {
        Chapter3String chapter3String = new Chapter3String();
        chapter3String.splitToken("getting started java");
        chapter3String.getCharFromString();
    }

    public void splitToken(String text) {
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }

    public void getCharFromString() {
        String hello = "hello world";
        System.out.println(hello.charAt(2));
        System.out.println(hello.toCharArray()[2]);
        System.out.println((char)hello.codePointAt(2));
    }
}
