public class ContaTerminal {
    private int Numero;
    private String Agencia;
    private String NomeCliente;
    private double Saldo;

    public ContaTerminal(int numero, String agencia, String NomeCliente, double saldo){
        this.Numero = numero;
        this.Agencia = agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = saldo;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n", Numero, Agencia, Numero, Saldo );
    }

    public int getNumero(){
        return Numero;
    }

    public String getAgencia(){
        return Agencia;
    }

    public String getNomeCliente(){
        return NomeCliente;
    }

    public double getSaldo(){
        return Saldo;
    }



}


