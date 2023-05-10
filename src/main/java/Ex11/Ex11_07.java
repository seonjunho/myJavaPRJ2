package Ex11;

class Car2 {
    private String Color;
    private int Speed;

    Car2(String Color, int Speed) {
        this.Color = Color;
        this.Speed = Speed;
    }
        public String getColor () {
            return this.Color;
        }
        public int getSpeed () {
            return this.Speed;
        }
}

public class Ex11_07 {
    public static void main(String[] args) {

        Car2 myCar1 = new Car2("빨강", 0);
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 "
                + myCar2.getSpeed() + "km 입니다.");
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 "
                + myCar2.getSpeed() + "km 입니다.");

    }
}
