package com.example.project;

public class NestedLoops {

    /*
    return the string below for given height=5
    *
    **
    ***
    ****
    *****  
    */
    public static String starStaircase(int height){
        StringBuilder sb = new StringBuilder();        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            if (i < height) sb.append("\n");
        }
        return sb.toString();
    }

    /*
    return the string below for given height=5
    *****
    ****
    ***
    **
    *
    */
    public static String starStaircaseReverse(int height){
        StringBuilder sb = new StringBuilder();
        for (int i = height; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            if (i > 1) sb.append("\n");
        }
        return sb.toString();
    }

    /*
    width=5 height=5
    *****
    *   *
    *   *
    *   *
    *****
    */
    public static String emptyBox(int width, int height) {
        // Required by tests:
        if (width < 2 || height < 2) return "";

        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= width; col++) {
                if (row == 1 || row == height || col == 1 || col == width) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            if (row < height) sb.append("\n");
        }

        return sb.toString();
    }

    /*
    return the string below for word="HELLO" rows=5                    
    HELLO
    ELLOH
    LLOHE
    LOHEL
    OHELL
    */
    public static String repeatRectangle(String word, int rows){
        StringBuilder sb = new StringBuilder();
        int len = word.length();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < len; j++) {
                sb.append(word.charAt((i + j) % len));
            }
            if (i < rows - 1) sb.append("\n");
        }

        return sb.toString();
    }
}
