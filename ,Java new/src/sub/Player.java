package sub;

import java.util.Random;

public class Player extends Character {

    // コンストラクタ
    public Player(String name) {
        super(
            name,
            getRandomStatus(),
            getRandomStatus(),
            getRandomStatus(),
            getRandomStatus(),
            getRandomStatus()
        );
    }

    // ランダムなステータスを返すメソッド
    private static int getRandomStatus() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;  // 1〜1000の数値
    }
}
