package StringBuilderandStrings;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;  /* this will created new object every iterable.... so waste of space...
                                    so for this stringBuilder .... */
        }
        System.out.println(series);
    }
}
