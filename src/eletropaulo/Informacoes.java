package eletropaulo;

import javax.swing.JOptionPane;

public class Informacoes {
    
    private double primLeitura;
    private double segLeitura;
    private double diferenca;
    private double tusd;
    private double te;
    private double ttSemBandeira;
    private double ttComBandeira;
    private double aumento;
    private double icms;
    private String bandeira;

    public double getPrimLeitura() {
        return primLeitura;
    }

    public void setPrimLeitura(double primLeitura) {
        this.primLeitura = primLeitura;
    }

    public double getSegLeitura() {
        return segLeitura;
    }

    public void setSegLeitura(double segLeitura) {
        this.segLeitura = segLeitura;
    }

    public double getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(double diferenca) {
        this.diferenca = diferenca;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getTtSemBandeira() {
        return ttSemBandeira;
    }

    public void setTtSemBandeira(double ttSemBandeira) {
        this.ttSemBandeira = ttSemBandeira;
    }

    public double getTtBandeira() {
        return ttComBandeira;
    }

    public void setTtBandeira(double ttComBandeira) {
        this.ttComBandeira = ttComBandeira;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
   

    
    public double gasto(double primLeitura, double segLeitura){    
        this.diferenca = this.segLeitura - this.primLeitura;
        return this.diferenca;        
    }
    public double taxate(double diferenca){
        this.te = this.diferenca * 0.29;
        return this.te;
    }    
    public double taxatusd(double diferenca){
        this.tusd = this.diferenca * 0.30;
        return this.tusd;
    }
    public double somataxas(double tusd, double te){
        this.ttSemBandeira = this.tusd + this.te;
        return this.ttSemBandeira;
    }
    public double icms(double ttSemBandeira){
        this.icms = this.ttSemBandeira *0.25;
        this.icms = this.icms + this.ttSemBandeira;
        return icms;
    }
    public String bandeira(double diferenca){
        if (this.diferenca <100) {
            this.bandeira = "verde";
        }else if (this.diferenca >101 && this.diferenca <150) {
            this.bandeira = "amarela";
        }else if (this.diferenca>150 && this.diferenca<200) {
            this.bandeira = "vermelha 1° patamar";
        }else{
            this.bandeira = "vermelha 2° patamar";
        }
        return this.bandeira;
    }
    public double acrecimo(String bandeira, double icms){
        if ("verde".equals(this.bandeira)) {
            this.aumento = 1;
        }
        if ("amarelo".equals(this.bandeira)) {
            this.aumento = 0.04169;
        }
        if ("vermelho patamar 1".equals(this.bandeira)) {
            this.aumento = 0.04169;
        }
        if ("vermelho patamar 2".equals(this.bandeira)) {
            this.aumento = 0.06243;
        }
        return this.aumento;
    }
    public double taxaPagar(double icms){
        this.ttComBandeira = this.icms * this.aumento;
        this.ttComBandeira = this.ttComBandeira+this.icms;
        return this.ttComBandeira;
    }

    void recibo(double primLeitura, double segLeitura, double diferenca, double ttSemBandeira, String bandeira, double totalBandeira) {
        JOptionPane.showMessageDialog(null," Sua leitura passada é: "
                + this.primLeitura
                + "\n Sua leitura atual é: "
                + this.segLeitura
                + "\n Total gasto: "
                + this.diferenca
                + "\n Total sem bandeira: "
                + this.ttSemBandeira
                + "\n Bandeira: "
                + this.bandeira
                + "\n Total com bandeira "
                + this.ttComBandeira);
    }
    
    
    
    
    
    
}
