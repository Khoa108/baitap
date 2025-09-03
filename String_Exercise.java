
package Lec7_String;
import java.util.Scanner;
import java.util.*;
public class String_Exercise {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static String capitalizeName(String name) {
        name = name.trim();
        String[] parts = name.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part.substring(0, 1).toUpperCase())
              .append(part.substring(1).toLowerCase())
              .append(" ");
        }
        return sb.toString().trim();
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void parseURL(String url) {
        int protocolEnd = url.indexOf("://");
        String protocol = url.substring(0, protocolEnd);
        int domainEnd = url.indexOf("/", protocolEnd + 3);
        String domain = url.substring(protocolEnd + 3, domainEnd);
        String path = url.substring(domainEnd);
        System.out.println("Protocol: " + protocol);
        System.out.println("Domain: " + domain);
        System.out.println("Path: " + path);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static String createAcronym(String phrase) {
        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) sb.append(Character.toUpperCase(word.charAt(0)));
        }
        return sb.toString();
    }

    public static int countWords(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;
        return str.split("\\s+").length;
    }

    public static String formatNumber(String digits) {
        StringBuilder sb = new StringBuilder(digits);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        return sb.toString();
    }

    public static String longestCommonSubstring(String s1, String s2) {
        String longest = "";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) {
                String sub = s1.substring(i, j);
                if (s2.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println("1. Reverse Words: " + reverseWords("Java is fun"));
        System.out.println("2. Capitalized Name: " + capitalizeName(" ngUYen vAn a "));
        System.out.println("3. Compressed String: " + compressString("AAABBCDDDD"));
        System.out.println("4. Anagrams (listen, silent): " + areAnagrams("listen", "silent"));
        System.out.println("4. Anagrams (hello, world): " + areAnagrams("hello", "world"));
        System.out.println("5. URL Parsing:");
        parseURL("https://dtu.edu.vn/portals/0/home.aspx");
        System.out.println("6. Longest Word: " + findLongestWord("The quick brown fox jumps over the lazy dog"));
        System.out.println("7. Acronym: " + createAcronym("Object Oriented Programming"));
        System.out.println("8. Word Count: " + countWords(" Java is a powerful language "));
        System.out.println("9. Formatted Number: " + formatNumber("1234567890"));
        System.out.println("10. Longest Common Substring: " + longestCommonSubstring("ABCDEF", "XBCYDEFZ"));
    }
}
