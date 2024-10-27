public class Auto {
    private String marca = "MErcedes";
    private String modelo;
    private String color = "Negro";
    private double cilindraje;
    private float consumo = 40;
    static  String Tipo = "suv";

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

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public Auto (){
    }

    public Auto (String marca){
        this.marca = marca;
    }

    public Auto (String marca, String modelo){
        this(marca);
        this.modelo = modelo;
    }

    public Auto (String marca, String modelo, String color){
        this(marca, modelo);
        this.color = color;
    }

    public Auto (String marca, String modelo, String color, int cilindraje){
        this(marca, modelo, color);
        this.cilindraje = cilindraje;
    }

    public Auto (String marca, String modelo, String color, int cilindraje, float consumo){
        this(marca, modelo, color, cilindraje);
        this.consumo = consumo;
    }



    public String verDetalle(){
        String dv = "la marca es =" + this.getMarca() + "\n" +
                "el modelo es = " + this.getModelo() + "\n" +
                "El color es = " + this.getColor()+ "\n" +
                "El tipo de auto es: = " + Auto.Tipo + "\n" +
                "El cilindraje es " + this.getCilindraje();
        return dv;
    }

    public String acelerar(){
        return "el auto marca = " + this.marca + "\tEsta acelerando";
    }

    public String frenar(int kmph){
        return "El auto modelo = " + this.modelo + "\tEsta frenando a " + kmph;
    }

    public float capacidadTanque(int cap, float porConsumo){
        float cm = consumo /(cap * consumo);
        return cm;


    }

    public float capacidadTanque(int cap, int porConsumo) {
        float cm = (cap * (porConsumo / 100));
        return cm;
    }
}
