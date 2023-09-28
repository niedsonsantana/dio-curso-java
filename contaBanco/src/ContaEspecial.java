public class ContaEspecial extends ContaBancaria{

    private double chequeEspecial;

    public ContaEspecial(){}

    public ContaEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaEspecial(String nome, String numeroConta, double saldo, double chequeEspecial) {
        super(nome, numeroConta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String sacar(double valor){
        if (this.getSaldo()+chequeEspecial >= valor ){
            if(this.getSaldo()>= valor){
                this.setSaldo(this.getSaldo()-valor);
            }else {
                double valorSaldo = this.getSaldo();
                this.setSaldo(0);
                valor -= valorSaldo;
                chequeEspecial -= valor;
            }
            return "saque efetuado saldo: "+this.getSaldo()+" cheque especial: "+chequeEspecial;
        }
        return "Saldo Insuficiente";
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "chequeEspecial=" + chequeEspecial +
                super.toString()+
                '}';
    }
}
