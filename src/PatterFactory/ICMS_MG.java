package PatterFactory;

import modelo.Orcamento;

import java.math.BigDecimal;

public class ICMS_MG implements CalculoPorRegiao {
    @Override
    public BigDecimal calculoPorRegiao(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.10"));
    }
}
