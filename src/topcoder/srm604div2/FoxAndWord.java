package topcoder.srm604div2;

/**
 * Created by Jan on 18-1-14.
 */
public class FoxAndWord {
    public int howManyPairs(String[] words) {
        int a=0;
        int b=1;
        int result=0;

        for(;a<words.length-1 && b<words.length;) {
            if(words[a].length()==words[b].length()) {
                for(int i=1; i<words[a].length(); i++) {
                    String first=words[a].substring(0,i);
                    String second=words[a].substring(i,words[a].length());

                    if(words[b].equals(second.concat(first))) {result++;break;}
                }
            }

            if(b<words.length-1) b++;
            else {a++; b=a+1;}
        }

        return result;
    }
}
