package com.collections;

public class test {

    public static String reverseWord(String s, int i){
        String[] split = s.split("\\s+");
        String r = doReverse(split[i]);
        StringBuffer sb = new StringBuffer();
        for(int k = 0; k < split.length; k++) {
            if(k == i)
                sb.append(" "+r+" ");
            else sb.append(" "+split[k]+" ");
        }
        return sb.toString();
    }

    private static String doReverse(String s){
        if(s.length() <= 0)
            return s;
        else return doReverse(s.substring(1)) + s.charAt(0);
    }

    public static void main (String[] args){
        String input = "Emandleni is the second child";
        System.out.println(reverseWord(input, 3));
    }
}
