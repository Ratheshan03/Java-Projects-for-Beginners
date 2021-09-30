import java.lang.Math;
public class Calculator {
    private int sumValue;
    private int subtractValue;
    private int divideValue;
    private int multipleValue;
    private double squareRootValue;
    private double squareValue;
    private double cubeValue;
    private double sinValue;
    private double cosValue;
    private double tanValue;

    public int addition(int A, int B) {
        sumValue = A + B;
        return sumValue;
    }

    public int subtration(int C, int D) {
        subtractValue = C - D;
        return subtractValue;
    }

    public int division(int E, int F) {
        while (E != 0 && F != 0) {
            divideValue = E / F;
        }
        return divideValue;
    }

    public int multiplication(int G, int H) {
        multipleValue = G * H;
        return multipleValue;
    }

    public double squareRoot(int I) {
        squareRootValue = Math.sqrt(I);
        return squareRootValue;
    }

    public double square(int J) {
        squareValue = J * J;
        return squareValue;
    }

    public double cube(int J) {
        cubeValue = J * J;
        return cubeValue;
    }

    public double CalculateSin(int y) {
        sinValue = Math.sin(y);
        return sinValue;
    }

    public double CalculateCos(int y) {
        cosValue = Math.cos(y);
        return cosValue;
    }
        
    public double CalculateTan(int y) {
        tanValue = Math.tan(y);
        return tanValue;
    }
}