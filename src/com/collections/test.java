package com.collections;

public class test {

    public static String reverseWord(String s, int i){
        String[] split = s.split("\\s+");
        String r = doReverse(split[i]);

        split[i] = r;

        String m = "";
        for (String var : split) {
            m = var+" ";
        }

        return m;
    }

    private static String doReverse(String s){
        if(s.length() <= 0)
            return s;
        else return doReverse(s.substring(1)) + s.charAt(0);
    }

    public static void main (String[] args){
        String input = "Emandleni is the second child";
        System.out.println(reverseWord(input,0));
    }
}
