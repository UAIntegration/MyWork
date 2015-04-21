package parsers;

import java.util.ArrayList;

public class StartPoint {
    public static void main(String[] args) {
        BashQuotes quotes = new BashQuotes();
        ArrayList<String> list = quotes.getQuotes();

        int ln = list.size();
        for(int i=0; i<ln; i++) {
            System.out.println("######## " + (i+1) + " ########\n" + list.get(i) + "\n###################\n");
        }

        System.out.println("-----------------------------");
        quotes.setPage(2);
        list = quotes.getQuotes();
        ln = list.size();
        for(int i=0; i<ln; i++) {
            System.out.println("######## " + (i+1) + " ########\n" + list.get(i) + "\n###################\n");
        }
    }
}