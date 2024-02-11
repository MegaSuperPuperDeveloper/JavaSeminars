// 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
// Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
// для валидного перевода величин. Метод для конвертации назовите "convertValue".

public class Task4 {
    public static void main(String[] args) {
        Converter converter1 = new Far();
        Converter converter2 = new Kelv();
        Converter converter3 = new Cels();
        System.out.println("converter1.convertValue(0) = " + converter1.convertValue(0));
        System.out.println("converter2.convertValue(0) = " + converter2.convertValue(0));
        System.out.println("converter3.convertValue(0) = " + converter3.convertValue(0));
    }
}

public class Cels implements Converter {
    public double convertValue(double celsVal) {
        return celsVal;
    }
}

public class Kelv implements Converter {
    public double convertValue(double celsVal) {
        return celsVal + 273.15;
    }
}

public class Far implements Converter {
    public double convertValue(double celsVal) {
        return 1.8 * celsVal + 32;
    }
}

public interface Converter {
    double convertValue(double celsVal);
}