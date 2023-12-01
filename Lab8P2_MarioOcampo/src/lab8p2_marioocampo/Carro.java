package lab8p2_marioocampo;
public class Carro {
     private String marca;
    private String modelo;
    private String color;
    private int precio;
    
    private boolean reconstruido;
    
    public Carro(String marca, String modelo, String color, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.reconstruido = reconstruido;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isReconstruido() {
        return reconstruido;
    }

    public void setReconstruido(boolean reconstruido) {
        this.reconstruido = reconstruido;
    }

    @Override
    public String toString() {
        return "Carro\n"
                + ""+"Marca=" + marca + "\n"
                + "Modelo = " + modelo + "\n"
                + "Color = " + color + "\n"
                + "Precio = " + precio + "\n"
                + "Reconstruido = " + reconstruido;
    }
    
    
}
