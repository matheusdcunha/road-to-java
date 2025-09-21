package dev.matheusdcunha.javacore.enums.dominio;

public enum TipoPagamento {
    DEBIT {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDIT {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };


    public double calcularDesconto(double valor){
        return 0;
    }
}
