package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike Motorbike1 = new Motorbike();
        Motorbike1.setModel("Honda");
        Motorbike1.setColor("Green");
        Motorbike1.setYoM(2020);
        System.out.println("Марка первого мотоцикла: " + Motorbike1.getModel() + "\nЦвет первого моточикла: " + Motorbike1.getColor() + "\nГод выпуска первого мотоцикла: " + Motorbike1.getYoM());
    }
}

class Motorbike {
    private String Model;
    private String Color;
    private int YoM;

    public void setColor(String Color) {
        if (Color.isEmpty()) {
            System.out.println("Вы не ввели цвет мотоцикла");
        } else {
            this.Color = Color;
        }
    }

    public String getColor() {
        return Color;
    }

    public void setModel(String Model) {
        if (Model.isEmpty()) {
            System.out.println("Вы не ввели марку мотоцикла");
        } else {
            this.Model = Model;
        }
    }

    public String getModel() {
        return Model;
    }

    public void setYoM(int YoM) {
        if (YoM < 0) {
            System.out.println("Вы ввели некорректный год выпуска мотоцикла");
        } else {
            this.YoM = YoM;
        }
    }

    public int getYoM() {
        return YoM;
    }
}

