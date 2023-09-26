package MathFunc;

import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double base, int degree) {
        double result = 1;
        if (degree < 0) {
            for (int i = 0; i < -degree; i++) {
                result /= base;
            }
        }
        else {
            for (int i = 0; i < degree; i++) {
                result *= base;
            }
        }
        return result;
    }

    @Override
    public double absZ(double real, int image) {
        return sqrt(pow(real, 2) + pow(image, 2));
    }

    public double CircleLength(double radius) {
        return 2 * MathCalculable.PI * radius;
    }

    public double CircleSquare(double radius) {
        return MathCalculable.PI * pow(radius, 2);
    }

    public static void main(String[] args) {
        MathFunc mf = new MathFunc();
        System.out.println(mf.pow(2, 10));
        System.out.println(mf.absZ(3, 4));
        System.out.println(mf.CircleLength(10));
        System.out.println(mf.CircleSquare(10));
    }
}
