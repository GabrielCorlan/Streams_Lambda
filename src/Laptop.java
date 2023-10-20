public class Laptop {

    private int id;
    private String marca;
    private int ram;
    private int diagonala;
    private double pret;

    public Laptop(int id, String marca, int ram, int diagonala, double pret) {
        this.id = id;
        this.marca = marca;
        this.ram = ram;
        this.diagonala = diagonala;
        this.pret = pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiagonala() {
        return diagonala;
    }

    public void setDiagonala(int diagonala) {
        this.diagonala = diagonala;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", ram=" + ram +
                ", diagonala=" + diagonala +
                ", pret=" + pret +
                '}';
    }
}
