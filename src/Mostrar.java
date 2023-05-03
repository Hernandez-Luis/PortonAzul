public class Mostrar implements MostrarDatos {
    @Override
    public void datos(Adeudos[] deudores) {
        CalcularPago calcularPago = new CalcularPago();
        System.out.println("\n");
        System.out.println("- - D A T O S  D E  D E U D O R E S - -");
        for (Adeudos deudas:deudores) {
            System.out.println("Id cliente: " + deudas.getCliente().getIdCliente());
            System.out.println("______________________________________________________________________________");
            System.out.println("Nombre completo del cliente: " + deudas.getCliente().getNombre() + " " + deudas.getCliente().getApellido());
            System.out.println("Direccion: " + deudas.getCliente().getDireccion());
            System.out.println("Telefono: " + deudas.getCliente().getTelefono());
            System.out.println("Correo: " + deudas.getCliente().getCorreo());
            System.out.println("______________________________________________________________________________");
            System.out.println("Id Adeudos: " + deudas.getIdAdeudos());
            System.out.println("Monto: " + deudas.getMonto());
            System.out.println("Fecha de adeudo: " + deudas.getFechaAdeudo());
            System.out.println("Estado de adeudo: " + deudas.getEstadoAdeudo());
            System.out.println("Tipo de adeudo: " + deudas.getTipoAdeudo());
            System.out.println("Cantidad de adeudos: " + deudas.getCantCosasDebe());
            System.out.println("Numero de dias sin pagar: " + deudas.getNumDiasSinPagar());
            System.out.println("Costo total a pagar: " + calcularPago.pagar(deudas.getNumDiasSinPagar(),deudas.getMonto(),deudas.getTipoAdeudo(),deudas.getCantCosasDebe()));
            System.out.println("______________________________________________________________________________");
        }
    }
}
