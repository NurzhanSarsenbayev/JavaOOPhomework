package homework7;

public class CalcApp implements ICalc {
    private double realPart;
    private double imaginaryPart;
    CalcApp(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }


    @Override
    public ICalc Add(ICalc other) {
        return new CalcApp(
                this.realPart + other.getRealPart(),
                this.imaginaryPart + other.getImaginaryPart()
        );
    }

    @Override
    public ICalc Multiply(ICalc other) {
        double newReal = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
        double newImaginary = this.realPart * other.getImaginaryPart() + this.imaginaryPart * other.getRealPart();
        return new CalcApp(newReal, newImaginary);
    }

    @Override
    public ICalc Divide(ICalc other) {
        double denominator = other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart();
        double newReal = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
        double newImaginary = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
        return new CalcApp(newReal, newImaginary);
    }

    @Override
    public ICalc Subtract(ICalc other) {
        return new CalcApp(
                this.realPart - other.getRealPart(),
                this.imaginaryPart - other.getImaginaryPart()
        );
    }
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", getRealPart(), getImaginaryPart());
    }

}
