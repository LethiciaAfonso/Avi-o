package Classes;

public class Piloto {
   private String Nome;
   private int CodCanac;
   private Avião avião;
   private int Horario;

public Piloto(String string, int i) {
}
public int getHorario() {
    return Horario;
}
public void setHorario(int horario) {
    this.Horario = horario;
}
public Avião getAviãoAtual() {
    return avião;
}
public void setAviãoAtual(Avião aviãoAtual) {
    this.avião = aviãoAtual;
}
public int getCodCanac() {
    return CodCanac;
}
public void setCodCanac(int codCanac) {
    this.CodCanac = codCanac;
}
public String getNome() {
    return Nome;
}
public void setNome(String nome) {
    this.Nome = nome;
}
public String getModelo(Avião avião){
    return avião.Modelo;
}
public void setModelo(Avião avião2) {
}
public void Altura(int alturadeCruzeiro) {
}
    
} 