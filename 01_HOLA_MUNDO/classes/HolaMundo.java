public class HolaMundo {
    private String nombre = "John Doe";

    public HolaMundo(){
        saludar();
    }

    public void saludar(){
        System.out.println("Hola mundo, "+this.nombre+"!");
    }

    public void saludar(String nombre){
        this.nombre = nombre;
        saludar();
    }

    public static void despedirse(){
        System.out.println("Adiós mundo!");
        System.exit(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
