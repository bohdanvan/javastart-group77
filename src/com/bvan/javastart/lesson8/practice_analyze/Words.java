package com.bvan.javastart.lesson8.practice_analyze;

/**
 * @author bvanchuhov
 */
public class Words {

    public static void main(String[] args) {
        String[] words = {"Java", "Kotlin"};
        System.out.println(totalLength(words)); // 10

        System.out.println(containsEmptyWord(words)); // true
    }

    public static boolean containsEmptyWord(String[] words) {
        for (String word : words) {
            if (word.isEmpty()) {
                return true;
            }
        }

        return false;
    }

    public static int totalLength(String[] words) {
        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

//        for (int i = 0; i < words.length; i++) {
//            totalLength += words[i].length();
//        }

        return totalLength;
    }
}
