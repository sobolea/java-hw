package hw3;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        List<String> planets = planetsCounters(11);
        delRepeats(planets);
        
    }

    static List<String> planetsCounters(int n){
        List<String> listPlanets = List.of("Марс", "Сатурн", "Земля", "Юптер", "Меркурий", "Плутон", "Уран", "Нептун", "Венера");
        List<String> randPlanets = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanets.get(i) + " ");
            //counts[listPlanets.indexOf(randPlanets.get(i))]++;
        }
        System.out.println();

        //for (int i = 0; i < counts.length; i++) System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
        return randPlanets;
    }

    static void delRepeats(List<String> list){
        List<String> uniqPlanets = new ArrayList<String>();
        for (String planet : list) {
            Boolean flg = false;
            for (String uniqPlanet : uniqPlanets) {
                if (planet == uniqPlanet) flg = true;            
            }
            if (flg == false) uniqPlanets.add(planet);
        }
        for (String planet : uniqPlanets) {
            System.out.printf("%s ", planet);
        }
    }
}

