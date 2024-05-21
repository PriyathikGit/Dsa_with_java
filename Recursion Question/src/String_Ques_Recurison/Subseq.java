package String_Ques_Recurison;

import java.util.ArrayList;
public class Subseq {
    public static void main(String[] args) {
        // subSeq("", "abc");
    //    System.out.println( subSeqList("", "abc"));;
    String str = "abc";
    ArrayList<String> list = new ArrayList<>();
        System.out.println(subSeqRet("", "abc",list));
    }

    // returning ans of every recursion call which is subset
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    // returning arraylist
    static ArrayList<String> subSeqRet(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            return list;
        }
        char ch = up.charAt(0);
        list.add(p+ch);
        subSeqRet(p+ch, up.substring(1),list);
         subSeqRet(p, up.substring(1),list);

        return list;
    }
}
