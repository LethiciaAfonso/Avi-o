package Classes;

public class Avião {
    String Modelo;
    private int NumerodeVoo;
    private int Altura;
    private Piloto piloto;
    private int AdCruzeiro;

    public Piloto getPiloto(){
        return this.piloto;
    }
    public int getAlturadeCruzeiro() {
        return AdCruzeiro;
    }
    public void setAdCruzeiro(int AdCruzeiro) {
        this.AdCruzeiro = AdCruzeiro;
    }
    public int getNumerodeVoo() {
        return NumerodeVoo;
    }
    public void setNumerodeVoo(int numerodeVoo) {
        this.NumerodeVoo = numerodeVoo;
    }
    public int getAltura() {
        return Altura;
    }
    public void setAltura(int altura) {
        this.Altura = altura;
    }
    public void setPiloto(Piloto piloto){
        this.piloto= piloto;
    }
    public void Altura(int limite); {
        piloto.Altura(AdCruzeiro);
    }
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    public Avião (String Modelo,int NumerodeVoo,Piloto piloto){
        setModelo(Modelo);
        setNumerodeVoo(NumerodeVoo);
        setPiloto(piloto);
        getPiloto().setModelo(this);
    }
    void Altura(){
        Altura++;
    }
    void Altura(int AdCruzeiro){
        this.AdCruzeiro = AdCruzeiro;
        for (int i=0; i < AdCruzeiro ; i++){
            this.Altura() ;
        }
    }
    
}
