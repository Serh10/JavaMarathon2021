package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Lada");
        car1.setColor("Yellow");
        car1.setYoM(2017);
        System.out.println("Марка первой машины: " + car1.getModel() + "\nЦвет первой машины: " + car1.getColor() + "\nГод выпуска первой машины: " + car1.getYoM());
    }
}

class Car {
    private String Model;
    private String Color;
    private int YoM;

    public void setColor(String Color) {
        if (Color.isEmpty()) {
            System.out.println("Вы не ввели цвет автомобиля");
        } else {
            this.Color = Color;
        }
    }

    public String getColor() {
        return Color;
    }

    public void setModel(String Model) {
        if (Model.isEmpty()) {
            System.out.println("Вы не ввели марку автомобиля");
        } else {
            this.Model = Model;
        }
    }

    public String getModel() {
        return Model;
    }

    public void setYoM(int YoM) {
        if (YoM < 0) {
            System.out.println("Вы ввели некорректный год выпуска автомобиля");
        } else {
            this.YoM = YoM;
        }
    }

    public int getYoM() {
        return YoM;
    }
}
