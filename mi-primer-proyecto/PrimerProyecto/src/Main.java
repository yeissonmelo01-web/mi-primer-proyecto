import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
            System.out.println("Hello, World!");
            
        System.out.println(" CALCULADORA BASICA ");
        System.out.println("Ingrese la operacion a realizar (+, -, *, /): ");
        System.out.println("1. suma (+)");
        System.out.println("2. resta (-)");
        System.out.println("3. multiplicacion (*)");	
        System.out.println("4. division (/)");
        System.out.println(" opcion 1, 2, 3 o 4: ");
            
        int opcion = scanner.nextInt();
        
		if (opcion < 1 || opcion > 4) {
			System.out.println("Opcion invalida. Por favor, ingrese un numero entre 1 y 4.");
			return;
		}
        
        
        
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        
     

        
        double resultado = 0;
        boolean operacionValida = true;
        
        switch(opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if(num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opcion invalida.");
                operacionValida = false;
                break;
            
        }
        
        if(operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }
        
      scanner.close();  
        
	}
}
