public class lengthoflastword {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(length(s));

    }

    private static int length(String s) {
        int n = s.length() - 1;
        int count = 0;
        for (int i = n; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
        }
        return count;
    }
}
