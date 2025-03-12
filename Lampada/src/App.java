public class App {
    public static void main(String[] args) throws Exception {
        Lampada lampada = new Lampada();

        lampada.Ligar();
        System.out.printf("Está ligada? %s\n", lampada.IsLigada());
    }
}
