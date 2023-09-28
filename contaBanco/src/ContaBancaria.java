public class ContaBancaria {

    private String nome;
    private String numeroConta;
    private double saldo;

    public ContaBancaria() {}

    public ContaBancaria(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String depositar(double valor) {
        saldo += valor;
        return "Deposito no valor de: "+valor+" novo saldo: "+saldo;
    }

    public String sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
            return "Valor sacado: "+valor+", novo saldo: "+saldo;
        }
        return "Saque não realizado no valor: "+valor+" , saldo: "+saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
