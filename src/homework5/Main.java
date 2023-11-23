package homework5;

public class Main {
    public static void main(String[] args) throws Exception {
        CalcView calcView = new CalcView();
        CalcModel calcModel = new CalcModel();
        CalcController calcController = new CalcController(calcView,calcModel);

        calcController.runCalc();
    }
}
