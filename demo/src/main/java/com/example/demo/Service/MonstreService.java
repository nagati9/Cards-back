package com.example.demo.Service;

import com.example.demo.Controllers.MonstreController;
import com.example.demo.Models.Monstre;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonstreService {
    ArrayList<Monstre> monstres = new ArrayList<>(Arrays.asList(
            new Monstre(1, "Leonardo DiCaprio", "Figure of Waves", 100, "Fort", "Un monstre puissant avec une affinité pour la mer", "Dicaprio.jpg", 1),
            new Monstre(2, "Beyoncé", "Queen of Sound", 120, "Écrasant", "Un monstre musical avec un impact écrasant", "Beyonce.jpg", 2),
            new Monstre(3, "Dwayne Johnson", "The Rock", 200, "Très Fort", "Fort et imposant, tel une montagne", "Rock.jpg", 3),
            new Monstre(4, "Ariana Grande", "Wind Whisperer", 80, "Rapide", "Rapide et agile comme une brise légère", "Grande.jpg", 1),
            new Monstre(5, "Elon Musk", "Electric Mind", 150, "Imprévisible", "Énergétique et imprévisible comme la foudre", "Musk.jpg", 4),
            new Monstre(6, "Tom Hanks", "Calm Storm", 90, "Équilibré", "Paisible mais puissant quand il le faut", "Hanks.jpg", 2),
            new Monstre(7, "Scarlett Johansson", "Shadow Assassin", 110, "Agile", "Discrète et létale dans l'ombre", "Johansson.jpg", 3),
            new Monstre(8, "Chris Hemsworth", "Thunder God", 180, "Puissant", "Comme un dieu du tonnerre, imposant", "Hemsworth.jpg", 4),
            new Monstre(9, "Will Smith", "Fireball", 130, "Explosif", "Capable de déclencher des explosions rapides", "Smith.jpg", 2),
            new Monstre(10, "Emma Watson", "Mystic Mage", 95, "Intelligent", "Maîtresse de la magie et de l'esprit", "Watson.jpg", 1),
            new Monstre(11, "Robert Downey Jr.", "Iron Will", 140, "Résilient", "Un monstre avec une détermination de fer", "Downey.jpg", 4),
            new Monstre(12, "Jennifer Lawrence", "Phoenix Fire", 120, "Énergique", "Elle renaît de ses cendres, plus puissante à chaque fois", "Lawrence.jpg", 3),
            new Monstre(13, "Brad Pitt", "Golden Warrior", 160, "Imposant", "Brillant et fort comme un guerrier doré", "Pitt.jpg", 2),
            new Monstre(14, "Gal Gadot", "Amazon Queen", 150, "Puissant", "Reine des Amazones, inébranlable et majestueuse", "Gadot.jpg", 1),
            new Monstre(15, "Keanu Reeves", "Shadow Striker", 140, "Silencieux", "Frappe dans l'ombre avec précision", "Reeves.jpg", 4),
            new Monstre(16, "Tom Cruise", "Sky Diver", 130, "Audacieux", "Toujours prêt à prendre des risques et à sauter d'une hauteur incroyable", "Cruise.jpg", 2),
            new Monstre(17, "Zendaya", "Light Dancer", 85, "Rapide", "Se déplace avec la grâce et la vitesse d'une danseuse de lumière", "Zendaya.jpg", 1),
            new Monstre(18, "Chris Evans", "Shield Bearer", 175, "Solide", "Protégé par un bouclier incassable", "Evans.jpg", 3),
            new Monstre(19, "Ryan Reynolds", "Jester King", 125, "Imprévisible", "Un roi malin, toujours prêt à surprendre", "Reynolds.jpg", 4),
            new Monstre(20, "Natalie Portman", "Mind Bender", 105, "Intelligent", "Capable de manipuler les esprits avec aisance", "Portman.jpg", 1)
    ));

    public List<Monstre> getMonstre() {
        return monstres;
    }
    public Monstre chercher(int id){
        return monstres.stream().filter( monstre -> monstre.getId()==id).findFirst().orElse(null);
    }

    public void delete(int id) {
        if(chercher(id)==null){
            System.out.println("fail");
    }
        else {
            monstres.removeIf(monstre -> monstre.getId()==id);
        }
}

    public void add(Monstre monstre) {
        monstres.add(monstre);
    }

    public void update(Monstre monstre, int id) {

        monstres.forEach(monstre1 -> {
            if(monstre1.getId()==id) {
                monstres.set(monstres.indexOf(monstre1),monstre);
            }
        });
    }
}
