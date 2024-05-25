public class CEO {
    private Builder builder;

    public CEO(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        System.out.println("Cambio de trabajador");
    }

}
