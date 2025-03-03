public class Pessoa {
    private Integer numeroDaConta;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean nomeValido(String nome){
        return nome != null && nome.matches("[a-zA-Z]+( [a-zA-Z]+)*");
    }

    public String formatarNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            return nome;
        }
        String[] partes = nome.split(" ");
        StringBuilder nomeFormatado = new StringBuilder();
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                nomeFormatado.append(parte.substring(0, 1).toUpperCase())
                        .append(parte.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return nomeFormatado.toString().trim();
    }

    public boolean contaValida(int conta){
        return conta >= 100000 && conta <= 999999;
    }

    public boolean agenciaValida(String agencia){
        int agenciaInteiro = Integer.parseInt(agencia);
        if (agenciaInteiro >= 111 && agenciaInteiro <= 999){
            return true;
        }else {
            return false;
        }
    }


}
