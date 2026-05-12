
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variable pour stocker le total des mots
        int totalMots = 0;

        try {
            // Utilisez le lecteur de fichiers (File Scanner) pour lire le contenu de n'importe quel fichier volumineux
            File fichier = new File("test.txt");
            Scanner lecteurFichier = new Scanner(fichier);

            // Créez une boucle qui lit chaque ligne dans une chaîne de caractères (String)
            while (lecteurFichier.hasNextLine()) {
                String ligne = lecteurFichier.nextLine();

                // Séparez la chaîne en utilisant le caractère espace comme délimiteur
                String[] mots = ligne.split(" ");

                // Comptez le nombre de mots dans cette ligne en utilisant la longueur du tableau
                int nombreMotsLigne = mots.length;

                // Additionnez tous les mots de chaque ligne lue dans le fichier
                totalMots = totalMots + nombreMotsLigne;
            }

            // Fermeture du lecteur
            lecteurFichier.close();

            // Affichez le nombre total de mots
            System.out.println("Nombre total de mots dans le fichier : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé !");
        }
    }
}
