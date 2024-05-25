public class Trabajador1 implements Builder{

    private Resultado resultado1;

    @Override
    public void reset() {
        resultado1 = new Resultado();
    }

    @Override
    public void trabajar() {
        System.out.println("Trabaja menos xd");
        resultado1.setDesarrollo("buen desarrollo");
        resultado1.setPrecio(100);
    }

    public Resultado getResultado2() {
        return this.resultado1;
    }
}
