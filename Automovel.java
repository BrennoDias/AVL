package pckavlautomoveis;

public class Automovel implements Comparable<Automovel> {

    private String placa;
    private String marca;
    private int ano;
    private float preco;
    private String modelo;
    private int Km;

    public Automovel(String placa, String marca, int ano, float preco, String modelo, int Km) {
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.modelo = modelo;
        this.Km = Km;
    }

    public Automovel() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int Km) {
        this.Km = Km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int compareTo(Automovel outro) {
        if (placa.compareTo(outro.getPlaca()) < 0) {
            return -1;
        } else if (placa.compareTo(outro.getPlaca()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

  

    @Override
    public String toString() {
        return "Automovel{" + "placa: " + placa + ", marca: " + marca + ", ano: " + ano + ", preco: " + preco + 
                ", modelo: " + modelo + ", Km: " + Km + '}';
    }
    
}
