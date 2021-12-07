package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words){
        List<String> modifiedList = new ArrayList<>();
        int minimum = 1000;
        for(String s: words){
            if(s.length() < minimum){
                modifiedList.removeAll(modifiedList);
                modifiedList.add(s);
                minimum = s.length();
            }else if(s.length() == minimum) {
                modifiedList.add(s);
            }
        }
        return modifiedList;
    }
}
