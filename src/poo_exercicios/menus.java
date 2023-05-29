package poo_exercicios;
import classes.Menu;
public class menus {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.adicionarItem("Tofu ratatouille");
        menu.adicionarItem("Chilli coconut chicken");
        menu.adicionarItem("Chilli coconut chicken");
        menu.adicionarItem("Meatballs with mustard sauce");
        
        System.out.println();
        menu.printMenu();
        menu.resetarMenu();
    
        System.out.println();
        menu.adicionarItem("Tomato and mozzarella salad");
        menu.printMenu();
    }
}
