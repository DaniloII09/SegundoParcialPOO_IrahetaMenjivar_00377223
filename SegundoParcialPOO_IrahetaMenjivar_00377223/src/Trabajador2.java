public class Trabajador2 implements Builder{

    private Resultado resultado2;

    @Override
    public void reset() {
        resultado2 = new Resultado();
    }

    @Override
    public void trabajar() {
        System.out.println("Trabaja mas :v");
        resultado2.setDesarrollo("buenisimo desarrollo");
        resultado2.setPrecio(1000);
    }

    public Resultado getResultado2() {
        return this.resultado2;
    }
}
