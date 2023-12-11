public class Main {
    public static void main(String[] args) {
        // 条件1: String型変数 str を宣言し、初期値として null を代入する
        String str = null;

        // 条件2と条件3: NullPointerException を catch して処理する
        try {
            // NullPointerExceptionが発生するコード
            int length = str.length();
            System.out.println("Stringの長さ: " + length);
        } catch (NullPointerException e) {
            // 例外が発生したことを標準出力
            System.out.println("NullPointerExceptionが発生しました");

            // 例外インスタンスを用いて、getMessage()を出力
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}
