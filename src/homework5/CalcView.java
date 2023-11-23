package homework5;

import java.util.Scanner;

public class CalcView {
    private Scanner scanner;
    public CalcView(){
        scanner = new Scanner(System.in);
    }

    public void showResult(int result){
        System.out.println("RESULT = " + result);
    }
    public void showResult(double result){
        System.out.println("RESULT = " + result);
    }
    public double getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
