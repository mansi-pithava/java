import java.util.HashMap;

public class hmap {
    public static void main(String[] args) {
        HashMap< String,Integer> ageMap = new HashMap<>();
    ageMap.put("iop",89);
    ageMap.put("ioj",78);
    System.out.println("age"+ageMap.get("iop"));
    for (String name : ageMap.keySet()) {
        System.out.println(name + "'s age: " + ageMap.get(name));
    }    
}

}
