package fundamentos;
import java.util.HashMap;
public class dicionarioHash {
public static void main(String[] args) {
    HashMap<String, String> apelidos = new HashMap<>();
    apelidos.put("Lucas","Catunda");
    apelidos.put("Daniel", "Geralwat");
    apelidos.put("Kayo","Maroca");

    System.out.println(apelidos.get("Lucas"));
    System.out.println(apelidos.get("Daniel"));
}
}
