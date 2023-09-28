import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(){}

    public ContaPoupanca(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(String nome, String numeroConta, double saldo, int diaRendimento) {
        super(nome, numeroConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public String calcularNovoSaldo(double taxaRendimento){
        if(diaRendimento == LocalDate.now().getDayOfMonth()){
            this.setSaldo(this.getSaldo()+this.getSaldo()* taxaRendimento);
            return"Rendimento, novo saldo: "+this.getSaldo();
        }
        return "Rendimento não aplicado, saldo: "+this.getSaldo();
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                super.toString()+
                '}';
    }
}
