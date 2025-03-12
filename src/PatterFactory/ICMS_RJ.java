package PatterFactory;
import modelo.Orcamento;

import java.math.BigDecimal;

public class ICMS_RJ implements CalculoPorRegiao{
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.05"));
    }
}
