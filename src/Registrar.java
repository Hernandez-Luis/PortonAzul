import java.sql.SQLOutput;
import java.util.Scanner;

public class Registrar {
    public Adeudos[] llenar(Scanner scanner){
        System.out.println("Ingresa el numero de clientes a registrar: ");
        int canClientes = scanner.nextInt();

        Adeudos [] deudores = new Adeudos[canClientes];

        for (int i = 0; i < deudores.length; i++) {
            int idCliente = (i+1);
            int idAdeudos = (i+1);
            System.out.println("Ingresa el nombre del cliente: ");
            String nombre = scanner.next();
            System.out.println("Ingresa el apellido: ");
            String apellido = scanner.next();
            System.out.println("Ingresa la direccion: ");
            String direccion = scanner.next();
            System.out.println("Ingresa el numero de telefono: ");
            int telefono = scanner.nextInt();
            System.out.println("Ingresa el correo electronico: ");
            String correo = scanner.next();
            System.out.println("Ingresa el monto: ");
            double monto = scanner.nextDouble();
            System.out.println("Ingresa la fecha de adeudo: ");
            String fechaAdeudo = scanner.next();
            System.out.println("Ingresa el estado de adeudo (Pagado/Pendiente): ");
            String estadoDeAdeudo = scanner.next();
            System.out.println("Ingresa el tipo de adeudo (Renta/Comida): ");
            String tipoAdeudo = scanner.next();
            System.out.println("Ingresa el numero de adeudos: ");
            int cantCosasDebe = scanner.nextInt();
            System.out.println("Ingresa el numero de dias sin pagar: ");
            int numDiasSinPagar = scanner.nextInt();

            deudores[i] = new Adeudos(idAdeudos,monto,fechaAdeudo,estadoDeAdeudo,new Adeudos.Persona(idCliente,nombre,apellido,
                    direccion,telefono,correo),tipoAdeudo,cantCosasDebe,numDiasSinPagar);
        }

        return deudores;
    }
}
