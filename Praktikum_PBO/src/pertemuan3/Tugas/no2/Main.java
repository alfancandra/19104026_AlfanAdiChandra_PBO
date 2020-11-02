package pertemuan3.Tugas.no2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Deklarasi
        List<Planet> planet = new ArrayList<>();
        Planet planet1 = new Planet(10,1,"Merkurius");
        Planet planet2 = new Planet(20,2,"Venus");
        Planet planet3 = new Planet(30,3,"Bumi");
        Planet planet4 = new Planet(40,4,"Mars");
        Planet planet5 = new Planet(50,5,"Jupiter");
        Planet planet6 = new Planet(60,6,"Saturnus");
        Planet planet7 = new Planet(70,7,"Uranus");
        Planet planet8 = new Planet(80,8,"Neptunus");
        SolarSystem solSys = new SolarSystem("1", "Solar System");

        // Tambah Planet
        planet.add(planet1);
        planet.add(planet2);
        planet.add(planet3);
        planet.add(planet4);
        planet.add(planet5);
        planet.add(planet6);
        planet.add(planet7);
        planet.add(planet8);

        // Set Planet
        solSys.setPlanets(planet);
        // Cetak
        solSys.getData();
    }
}
