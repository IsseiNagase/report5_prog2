public class Main {
    public static void main(String[] args) {
        // 条件1: String型変数 str を宣言し、初期値として null を代入する
        String str = null;

        // 条件2: str.length() の内容を表示しようとする
        try {
            // 条件2を満たすコード（NullPointerExceptionが発生する）
            int length = str.length();
            System.out.println("Stringの長さ: " + length);
        } catch (NullPointerException e) {
            // 例外が発生した場合の処理
            System.out.println("例外が発生しました: " + e.getMessage());
        }
    }
}
