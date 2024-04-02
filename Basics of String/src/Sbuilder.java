public class Sbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);  // type casting because we are performing arthimetic operation
            builder.append(ch); // not creating any new objects only appending in the builder object
        }
        System.out.println(builder);
    }
}
