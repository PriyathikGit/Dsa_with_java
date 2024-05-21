package String_Ques_Recurison;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("",6);
        System.out.println(diceRet("",4));
    }

    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }
    static ArrayList<String> diceRet(String p, int target){
        if(target==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }
}
