
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola, Mundo!");
        HolaMundo hm = new HolaMundo();
        hm.setNombre("Pedro");
        hm.saludar();
        hm.saludar("Juan");
        HolaMundo.despedirse();
    }
}