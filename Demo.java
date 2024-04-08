
public class Demo {

	public static void main(String[] args) {
		String str = "A2B3C2D4";
        int count = 0;
        char current = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                current = ch;
            } else {
                count = ch - '0';
                for (int j = 1; j <= count; j++) {
                    System.out.print(current);
                }
            }
        }
	}

}

/*print string AABBBCCDDDD
input
 A2B3C2D4*/