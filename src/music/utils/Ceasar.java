package music.utils;

/**
 * Created by Yaremenko Ihor on 30.01.2016.
 */
public class Ceasar {

    private static String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()[]/?<>\'\"=-+*:;.,\t ";

    public static String encode(String text, int key) {
        StringBuilder encodedContent = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int index = symbols.indexOf(symbol);
            encodedContent.append(symbols.charAt((index + key) % symbols.length()));
        }
        return encodedContent.toString();
    }

    public static String decode(String text, int key) {
        StringBuilder decodedContent = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int index = symbols.indexOf(symbol);
            decodedContent.append(symbols.charAt((((index - key) % symbols.length()) + symbols.length()) % symbols.length()));
        }
        return decodedContent.toString();
    }
}

