package homework5;



public class CalcModel {

    public double Addition (double num1, double num2){
        double sum;
        return sum = num1+num2;
    }


    public double Subtraction (double num1, double num2){
        double sum;
        return sum = num1-num2;
    }


    public double Multiplication (double num1, double num2){
        double sum;
        return sum = num1*num2;
    }


    public double Division (double num1, double num2) throws Exception {
        double sum;
        if(num2 == 0){
            throw new Exception("Can't divide by 0");
        }
        return sum = num1/num2;
    }


    public double Power (double num1, double num2){
        double sum;
        return sum = Math.pow(num1, num2);
    }


    public int intValue(double dub)
    {
        return (int)dub;
    }
    public int ResultToInt (double sum){
        int result;
        return result = intValue(sum);
    }
}
