import java.util.Scanner;

public class OpMain {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Registrar registrar = new Registrar();
        Mostrar mostrar = new Mostrar();

        mostrar.datos(registrar.llenar(scanner));
    }
}
