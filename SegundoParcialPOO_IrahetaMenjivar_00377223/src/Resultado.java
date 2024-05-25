public class Resultado {
    private String desarrollo;
    private float precio;

    public Resultado(String desarrollo, float precio) {
        this.desarrollo = desarrollo;
        this.precio = precio;
    }

    public Resultado(){}

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
