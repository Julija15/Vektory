import java.lang.constant.Constable;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Длинна вектора
    public double dlinna() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Склярное произведение
    public double scalarProizvedenie(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    //векторное произведение
    public Vector vectoryProizvedenie(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.y - x * vector.z,
                x * vector.y - y * vector.x);
    }
    // косинус угла между векторами равен
    public double cos(Vector vector) {
        return scalarProizvedenie(vector) / (dlinna() * vector.dlinna());
    }
    // метод для суммы
    public Vector add(Vector vectory) {
        return new Vector(
                x + vectory.x,
                y + vectory.y,
                z + vectory.z);
    }
    // метод для вычитания - subtraction
    public Vector subtraction(Vector vectory) {
        return new Vector(
                x - vectory.x,
                y - vectory.y,
                z - vectory.z);
    }
    //статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

