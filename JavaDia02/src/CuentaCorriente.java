public class CuentaCorriente
{

    public CuentaCorriente() { }

    public CuentaCorriente(String titular, double saldo) {
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.setTitular(cc.getTitular());
        this.setSaldo(cc.getSaldo());
    }

    private String titular;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    private double saldo;

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void egreso()
    {
        System.out.println("Egreso exitoso");
    }
    public void reintegro()
    {
        System.out.println("Reintegro exitoso");
    }
    public void transferencia()
    {
        System.out.println("Transferencia  exitoso");
    }
}
