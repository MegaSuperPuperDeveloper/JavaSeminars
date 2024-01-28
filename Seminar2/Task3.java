// Задача на ООП (пригодится для дз и итогового проекта):
// 1) Проектирование и создание класса, описывающего вектор Задача:
// Создайте класс, который описывает вектор (в трёхмерном пространстве).

// Задача:
//У него должны быть:
// • конструктор с параметрами в виде списка координат x, y, z
// • метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
// • метод, вычисляющий скалярное произведение:
// • метод, вычисляющий векторное произведение с другим вектором:
// • метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному
// произведению векторов, деленному на произведение модулей (длин) векторов:
// • методы для суммы и разности:

public class Task3 {
    public static void main(String[] args) {
        Vector vectorOne = new Vector(1.0, 2.0, 1.0);
        Vector vectorTwo = new Vector(1.0, 1.0, 1.0);
        System.out.println("vectorOne.length() = " + vectorOne.length());
        System.out.println("vectorOne.scalar(vectorTwo) = " + vectorOne.scalar(vectorTwo));
        System.out.println("vectorOne.productVector(vectorTwo) = " + vectorOne.productVector(vectorTwo));
        System.out.println("vectorOne.cos(vectorTwo) = " + vectorOne.cos(vectorTwo));
        System.out.println("vectorOne.Sum(vectorTwo) = " + vectorOne.Sum(vectorTwo));
        System.out.println("vectorOne.Diff(vectorTwo) = " + vectorOne.Diff(vectorTwo));
    }
}

public class Vector {
    private double x, y, z;

    public Vector Sum(Vector vectorTwo) {
        return new Vector(x + vectorTwo.x, y + vectorTwo.y, z + vectorTwo.z);
    }

    public  Vector Diff(Vector vectorTwo) {
        return new Vector(x - vectorTwo.x, y - vectorTwo.y, z - vectorTwo.z);
    }

    public double cos(Vector vectorTwo) {
        return scalar(vectorTwo) / (vectorTwo.length() * length());
    }

    public Vector productVector(Vector vectorTwo) {
        return new Vector(y * vectorTwo.z - z * vectorTwo.y,
                z * vectorTwo.x - x * vectorTwo.z,
                x * vectorTwo.y - y * vectorTwo.x);
    }

    public double scalar(Vector vectorTwo) {
        return x * vectorTwo.x + y * vectorTwo.y + z + vectorTwo.z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}