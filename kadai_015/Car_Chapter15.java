package kadai_015;

public class Car_Chapter15 {
    // フィールド
	private int gear = 1;  // 現在のギア
	private int speed = 10;  // 現在の速度

    // ギアチェンジによる速度変更メソッド
    public void gearChange(int afterGear) {
        System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
        this.gear = afterGear;

        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10; // 無効なギアの場合、速度を時速10kmに設定
        }
    }

    // ギアチェンジ後の速度を表示するメソッド
    public void displaySpeed() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}
