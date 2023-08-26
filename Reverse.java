import java.util.Scanner;

class ReUse {
    static String word;

    public void tri() {
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("ENTER WORD!");
            try {
                   word = s.nextLine().trim();
                if (word.isEmpty()) {
                    throw new Exception();
                }
            } 
            catch (Exception e) {
                System.out.println("NOT VALID INPUT");
            }
        } while (word.isEmpty());
                 s.close();
                }
}

class Rev {
    private String word;
    String rev = "";

    public void use() {
        this.word = ReUse.word;
        for (int i = 0; i < word.length(); i++) {
            rev = rev + word.charAt(word.length() - 1 - i);
        }
    }

    public void Show() {
        System.out.println(rev);
    }
}

public class Reverse {
    public static void main(String[] arg) {
        ReUse obj = new ReUse();
        Rev obj1 = new Rev();
        obj.tri();
        obj1.use();
        obj1.Show();

    }
}
