public  class Main {
    public static void main(String[] args) {
        String name = "";
        for(int i=0;i<26;i++){
            char ch = (char) ('a'+i);
//            System.out.println(ch);
            name += ch;
        }
        System.out.println(name);
    }


}