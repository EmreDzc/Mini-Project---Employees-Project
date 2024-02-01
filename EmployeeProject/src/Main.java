import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to employees program...");
        String operations = "Operations: \n"
                + "1. Programmer operations.. \n"
                + "2. Manager operations \n"
                +"For Exit press q";
        System.out.println("**********************************************");
        System.out.println(operations);
        System.out.println("**********************************************");

while(true){
System.out.println("Select the operation:");
String op = scanner.nextLine();
if(op.equals("q")){
    System.out.println("Exiting....");
    return;
} else if (op.equals("1")) {
    String progOperations = "1. formatting \n"
            +"2. showInfo \n"
            +"For Exit press q";
    System.out.println(progOperations);
    Programmer programmer = new Programmer("Emre", "Kartal", 29, "Java,C,SQL");
    while (true){
        System.out.println("Select the operation:");
        String progOp = scanner.nextLine();
        if(progOp.equals("q")){
            System.out.println("Exiting....");
            break;
        } else if (progOp.equals("1")) {
            System.out.println("Operating System: ");
            String opSystem = scanner.nextLine();
            programmer.formatting(opSystem);
        } else if (progOp.equals("2")) {
            programmer.showInfo();
        }
        else {
            System.out.println("Invalid programmer operations...");
        }
    }
} else if (op.equals("2")) {
    String managerOps = "1. showInfo\n"
            + "2. getRaise\n"
            + "For Exit press q";
    System.out.println(managerOps);
    Manager manager = new Manager("Mustafa", "Çal", 23,10);
    while(true){
        System.out.println("Select the operation:");
        String manOp = scanner.nextLine();
        if(manOp.equals("q")){
            System.out.println("Exiting....");
            break;
        } else if (manOp.equals("1")) {
            manager.showInfo();
        } else if (manOp.equals("2")) {
            System.out.println("Select the number of raise: ");
            int raiseNum = scanner.nextInt();
            manager.getRaise(raiseNum);
            scanner.nextLine();
        }
        else{
            System.out.println("Invalid manager operations...");
        }
    }
}
else{
    System.out.println("Invalid operation please try again...");
}


}


    }
}