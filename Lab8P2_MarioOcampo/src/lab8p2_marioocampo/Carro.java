package lab8p2_marioocampo;

public class Carro {

    private String tipo;
    private String marca;
    private int precio;

    public Carro(String tipo, String marca, int precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro" + " \n"
                + " Tipo = " + tipo + " \n"
                + " Marca = " + marca + "\n "
                + " Precio = " + precio;
    }
    
    
    
}
