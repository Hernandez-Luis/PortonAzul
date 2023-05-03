public class CalcularPago {
    public double pagar(int numeroDiasSinPaGAR,double monto,String tipoAdeudo,int cantCosasDebe){
        if(tipoAdeudo.equals("Comida") || tipoAdeudo.equals("comida")){
            if (numeroDiasSinPaGAR>15){
                return monto + (monto * 0.20);
            } else if (numeroDiasSinPaGAR == 15) {
                return monto + (monto * 0.10);
            } else if (numeroDiasSinPaGAR < 15) {
                return monto;
            }
        } else if (tipoAdeudo.equals("Renta") || tipoAdeudo.equals("renta")) {
            if(cantCosasDebe > 3){
                return monto + (monto * 0.40);
            } else if (cantCosasDebe == 3) {
                return monto + (monto * 0.20);
            } else if (cantCosasDebe == 1 && numeroDiasSinPaGAR <= 15) {
                return monto + (monto * 0.05);
            }
        }
        return 0;
    }
}
