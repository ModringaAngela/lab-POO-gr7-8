package lab10;

import java.util.*;

public class MapEx {

    static void exempleCuMap() {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());
        Collection<String> l = new ArrayList<>();
        Collection<Object> c = new ArrayList<>();
        c.add("1");
        c.add(1);

        Collection<List<String>> a = new ArrayList<>();
        a.add(List.of("A", "A"));

        Collection<Integer> l2 = new ArrayList<>();
        l2.add(2);
        Map<String, String> map2 = new HashMap<>(7);
        Map<String, String> map3 = new HashMap<>(7, 1);

        Map<String, String> map4 = new HashMap<>(map3);
        Map<String , String> map5 = map3;

        System.out.println("Initial size " + map.size());
        /*
            by default capacitatea e 16 si load factorul e 0.75
            load factor = cat poate sa se umple pana se face resize
            daca e 0.75 => pana la inclusiv 12 elemente e ok
            cand il pune pe al 13-lea, se face resize

            size si capacity nu sunt acelasi lucru
               - size se face cu metoda .size()
               - ca sa vezi capacitatea mergi cu debug ((HashMap) map).capacity() asta se foloseste, dar nu e public deci putem doar cu debug sa o accesam)
         */
        for (int i = 1; i <= 12; i++) {
            map.put("Key" + i, "Value" + i);
        }
        System.out.println("Added 12 elements");
        map.put("Key13", "Value13");

        System.out.println("Final size " + map.size());

        System.out.println("Elementele din map sunt");
        System.out.println(map.entrySet()); // asa se afiseaza toate elementele din map
        System.out.println();

        String keyToModify = "Key12";
        String newValue = "a";
        System.out.printf("La %s vreau valoarea noua: %s\n", keyToModify, newValue);
        map.put(keyToModify, newValue);
        System.out.println("Dupa modificare, elementele din map sunt");
        System.out.println(map.entrySet());
        System.out.println();

        System.out.println(map.values());
        System.out.println(map.keySet());
        map.remove("Key12");

        //daca dam valoare la constructor, aceea e capacitatea initiala
        //si aici, max size != capacitate (capacitatea initiala setata nu inseamna ca doar atatea elemente putem pune)

        System.out.println("Cream un map cu capacitate initiala");
        Map<String, String> mapCuCapacitate = new HashMap<>(20);
        for (int i = 0; i < 100; i++) {
            mapCuCapacitate.put("Key"+ i, "Value" + i);
        }
        System.out.println("Size-ul lui mapCuCapacitate e " + mapCuCapacitate.size());

    }

    static void orderedVsUnorderedMaps(){
        //HashMap e unordered
        Map<String, String> hashMap = new HashMap<>(20);
        //TreeMap e ordered
        TreeMap<String, String> treeMap = new TreeMap<>();

//        hashMap.put("C", "C");
//        treeMap.put("C", "C");
//
//        hashMap.put("A", "A");
//        treeMap.put("A", "A");
//
//        hashMap.put("B", "B");
//        treeMap.put("B", "B");

        hashMap.put("Cx", "C");
        treeMap.put("Cx", "C");

        hashMap.put("Ax", "A");
        treeMap.put("Ax", "A");

        hashMap.put("Bx", "B");
        treeMap.put("Bx", "B");

        System.out.println("In hashmap: " + hashMap.entrySet());
        System.out.println("In treeMap" + treeMap.entrySet());


        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.get("Ax"));


        /*
            un lucru interesant: daca in HashMap punem caractere drept key, atunci si hashmapul o sa fie ordonat

            ex:
            hashMap.put("A", "val");
            hashMap.put("B", "val2");

            explicatie: raspunsul verificat din https://stackoverflow.com/questions/33965702/why-does-hashmap-auto-sort-character-type-keys-though-being-an-unordered-collec
         */
    }

    static void listExample(){
        List<String> s = new ArrayList<>();
    }
    public static void main(String[] args) {
        //exempleCuMap();

        //orderedVsUnorderedMaps();

        exempleCuMap();
    }

}
