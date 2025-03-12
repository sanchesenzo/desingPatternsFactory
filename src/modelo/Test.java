package modelo;
import PatterFactory.ICMS_Factory;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new
                BigDecimal("1000.0"), "ICMS_RJ");
        ICMS_Factory icmsFactory = new ICMS_Factory();
        BigDecimal resultado = icmsFactory.getIcmsPorEstado(
                "ICMS_RJ").calculoPorRegiao(orcamento);
        System.out.println(resultado);
    }
}