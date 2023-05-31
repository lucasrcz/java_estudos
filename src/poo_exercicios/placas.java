package poo_exercicios;
import classes.LicensePlate;
import classes.RegistroDePlacas;

import java.util.ArrayList;
import java.util.HashMap;
public class placas {
    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
    
            LicensePlate li1 = new LicensePlate("FI", "ABC-123");
            LicensePlate li2 = new LicensePlate("FI", "UXE-465");
            LicensePlate li3 = new LicensePlate("D", "BWQ-431");
            LicensePlate li4 = new LicensePlate("D", "BWQ-431");
    
            ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
            finnishPlates.add(li1);
            finnishPlates.add(li2);
    
            LicensePlate newLi = new LicensePlate("FI", "ABC-123");
            if (!finnishPlates.contains(newLi)) {
                finnishPlates.add(newLi);
            }
            System.out.println("finnish: " + finnishPlates);
            // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
    
            HashMap<LicensePlate, String> owners = new HashMap<>();
            owners.put(li1, "Arto");
            owners.put(li3, "Jürgen");
    
            System.out.println("omistajat:");
            System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
            System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
            System.out.println("Já existe:" + owners.get(li3));
            // if the hasCode-method hasn't been overwritten, the owners won't be found

           RegistroDePlacas registros = new RegistroDePlacas();
           System.out.println("Teste dos métodos:");
           registros.addProprietario("Lucas", li1);
           registros.addProprietario("Lucas", li1);
           System.out.println(registros.get(li1));
           System.out.println(registros.remove(li1));
           System.out.println(registros.remove(li1));
           registros.addProprietario("Lucas", li1);
           registros.addProprietario("Daniel", li2);
           registros.addProprietario("Akemi", li3);
           registros.addProprietario("Akemi", li4);
           registros.printaPlacas();
           registros.printaProprietarios();
    }
}
