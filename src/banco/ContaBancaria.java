package banco;

public class ContaBancaria {
    // atribuidores
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos especiasi
    public ContaBancaria() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    //metodos comum
    public void statosDaConta() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String tip) {
        this.setTipo(tip);
        int nc = (int) (5 + Math.random() * (100 - 5)) + 100 + (int) (5 + Math.random() * (100 - 5));
        this.setNumConta(nc);
        this.setStatus(true);
        if (tip.equals("cc")) {
            this.setSaldo(50f);
        }
        if (tip.equals("cp")) {
            this.setSaldo(150f);
        }
        System.out.println("conta aberta com sucesso");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Essa conta ainda tem dinhairo");
        }
        if (this.getSaldo() < 0) {
            System.out.println("Você ainda ta devendo");
        }
        this.setStatus(false);
        System.out.println("conta fechada com sucesso");
    }
    public void depositar(float dep) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + dep);
            System.out.println("deposito realisado na conta de " + this.getDono());
        }
        else {
            System.out.println("Não pode depositar con a conta fachada");
        }
    }
    public void sacar(float sac) {
        if (this.getStatus()) {
            if (this.getSaldo() >= sac) {
                this.setSaldo(this.getSaldo() - sac);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Não pode sacar pois a conta esta fechada");
        }
    }
    public void pagarMensal() {
        float mens = 0;
        if (this.getTipo().equals("cc")) {
            mens = 12;
        } else if (this.getTipo().equals("cp")) {
            mens = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > mens) {
                this.setSaldo(this.getSaldo() - mens);
                System.out.println("Pagamento feito com sucesso");
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Ipossivel pagar com a conta fachada");
        }
    }
    //metodos geter e seters
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String don) {
        this.dono = don;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tip) {
        this.tipo = tip;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numC) {
        this.numConta = numC;
    }
}
