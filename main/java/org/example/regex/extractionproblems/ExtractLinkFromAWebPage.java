package org.example.regex.extractionproblems;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinkFromAWebPage {
    public static void main(String[] args) {
        String s = "Visit https://www.google.com and http://example.org for more info.";

        String regex = "\\bhttps?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

       StringBuilder st = new StringBuilder();
       while(m.find()){
           st.append(m.group()).append(",");
       }

        System.out.println(st);
    }
}
