package Nobemver;

import java.util.Arrays;

public class SortStringDescending {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars)).reverse();

        return sb.toString();
    }
}