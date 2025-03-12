package PatterFactory;

public class ICMS_Factory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
        if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new ICMS_MG();
        }else if (nomeEstado.equalsIgnoreCase("ICMS_RJ")){
            return new ICMS_RJ();
        }else if(nomeEstado.equalsIgnoreCase("ICMS_ES")){
            return new ICMS_ES();
        }else{
            return null;
        }
    }
}
