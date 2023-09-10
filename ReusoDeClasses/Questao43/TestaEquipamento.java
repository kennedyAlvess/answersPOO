package ReusoDeClasses.Questao43;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento equip = new Equipamento("Redragon Kumara","Logitech G203");
        Computador comp = new Computador("Razer Huntsman V2 Tenkeyless","Razer Viper","Lenovo","ideapadS145");

        System.out.println("=== Atribudos do obj Equipamento ===");
        System.out.println(equip);
        System.out.println("\n=== Atribudos do obj Computador ===");
        System.out.println(comp);

    }
}
