    public class Adeudos {
        int idAdeudos;
        double monto;
        String  fechaAdeudo;
        String estadoAdeudo;
        Persona cliente;
        String tipoAdeudo;
        int cantCosasDebe;
        int numDiasSinPagar;


        public Adeudos(int idAdeudos, double monto, String  fechaAdeudo, String estadoAdeudo, Persona cliente, String tipoAdeudo, int cantCosasDebe,int numDiasSinPagar) {
            this.idAdeudos = idAdeudos;
            this.monto = monto;
            this.fechaAdeudo = fechaAdeudo;
            this.estadoAdeudo = estadoAdeudo;
            this.cliente = cliente;
            this.tipoAdeudo = tipoAdeudo;
            this.cantCosasDebe = cantCosasDebe;
            this.numDiasSinPagar = numDiasSinPagar;

        }

        public int getIdAdeudos() {
            return idAdeudos;
        }

        public double getMonto() {
            return monto;
        }

        public String getFechaAdeudo() {
            return fechaAdeudo;
        }

        public String getEstadoAdeudo() {
            return estadoAdeudo;
        }

        public Persona getCliente() {
            return cliente;
        }

        public String getTipoAdeudo() {
            return tipoAdeudo;
        }

        public int getNumDiasSinPagar() {
            return numDiasSinPagar;
        }

        public int getCantCosasDebe() {
            return cantCosasDebe;
        }

        public static class Persona {
            int idCliente;
            String nombre;
            String apellido;
            String direccion;
            int telefono = 0;
            String correo = "";

            public Persona(int idCliente, String nombre, String apellido, String direccion, int telefono, String correo) {
                this.idCliente = idCliente;
                this.nombre = nombre;
                this.apellido = apellido;
                this.direccion = direccion;
                this.telefono = telefono;
                this.correo = correo;
            }

            public int getIdCliente() {
                return idCliente;
            }

            public String getNombre() {
                return nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public String getDireccion() {
                return direccion;
            }

            public int getTelefono() {
                return telefono;
            }

            public String getCorreo() {
                return correo;
            }
        }
    }

