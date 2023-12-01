package homework7;

public class CalcAppFactory implements CalcFactory{
    @Override
    public ICalc createCalc(double realPart, double imaginaryPart) {
        return new CalcApp(realPart, imaginaryPart);
    }
}
