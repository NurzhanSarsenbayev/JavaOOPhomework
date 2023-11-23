package homework5;

public class CalcController {
    CalcView view;
    CalcModel model;

    public CalcController(CalcView view, CalcModel model) {
        this.view = view;
        this.model = model;
    }

    public void runCalc() throws Exception {
        System.out.println("Welcome to my Calculator(*basic)");
        double choice;
        do {
            double num1 = view.getUserInput("Input your first number");

            System.out.println("LIST OF OPERATIONS");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("0. Exit");
            choice = view.getUserInput("Choose your operation");

            double num2 = view.getUserInput("Input your second number");

            switch ((int) choice) {
                case 1: double result = model.Addition(num1,num2);
                    choice = view.getUserInput("Do you want your result be 1.DOUBLE or 2.INT");
                    if (choice == 2){
                        int intResult = model.intValue(result);
                        view.showResult(intResult);
                    } else if (choice == 1) {
                        view.showResult(result);
                    }
                    else throw new Exception("Wrong input");
                    break;
                case 2: result = model.Subtraction(num1,num2);
                    choice = view.getUserInput("Do you want your result be 1.DOUBLE or 2.INT");
                    if (choice == 2){
                        int intResult = model.intValue(result);
                        view.showResult(intResult);
                    } else if (choice == 1) {
                        view.showResult(result);
                    }
                    else throw new Exception("Wrong input");
                    break;
                case 3: result = model.Multiplication(num1,num2);
                    choice = view.getUserInput("Do you want your result be 1.DOUBLE or 2.INT");
                    if (choice == 2){
                        int intResult = model.intValue(result);
                        view.showResult(intResult);
                    } else if (choice == 1) {
                        view.showResult(result);
                    }
                    else throw new Exception("Wrong input");
                    break;
                case 4:result = model.Division(num1,num2);
                    choice = view.getUserInput("Do you want your result be 1.DOUBLE or 2.INT");
                    if (choice == 2){
                        int intResult = model.intValue(result);
                        view.showResult(intResult);
                    } else if (choice == 1) {
                        view.showResult(result);
                    }
                    else throw new Exception("Wrong input");
                    break;
                case 5:result = model.Power(num1,num2);
                    choice = view.getUserInput("Do you want your result be 1.DOUBLE or 2.INT");
                    if (choice == 2){
                        int intResult = model.intValue(result);
                        view.showResult(intResult);
                    } else if (choice == 1) {
                        view.showResult(result);
                    }
                    else throw new Exception("Wrong input");
                    break;
                case 0: System.out.println("Exiting Calculator");
                    break;
                default:System.out.println("Invalid Input");
                    break;
            }
        } while (choice!=0);
    }
}