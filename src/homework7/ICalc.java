package homework7;

public interface ICalc {
   double getRealPart();
   double getImaginaryPart();


   ICalc Add(ICalc other);
   ICalc Multiply(ICalc other);
   ICalc Divide(ICalc other);
   ICalc Subtract(ICalc other);

   String toString();
}
