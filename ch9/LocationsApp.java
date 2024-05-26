package gr.aueb.cf.ch9;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LocationsApp {
    public static void main(String[] args) {
                String inputFile = "C:\\Work\\CodingFactoryTestbed\\src\\gr\\aueb\\cf\\locations.txt.txt";
                String outputFile = "C:\\Work\\CodingFactoryTestbed\\src\\gr\\aueb\\cf\\metatropi.txt.txt";

                try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
                     BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

                    String header = br.readLine(); // Διαβάζουμε την πρώτη γραμμή με τις επικεφαλίδες
                    String line;

                    while ((line = br.readLine()) != null) {
                        String[] parts = line.split(",");
                        String location = parts[0].trim();
                        String latitude = parts[1].trim();
                        String longitude = parts[2].trim();

                        String formattedLine = String.format("{ location: '%s', latitude: %s, longitude: %s },",
                                location, latitude, longitude);
                        bw.write(formattedLine);
                        bw.newLine();
                    }

                    System.out.println("Η μετατροπή ολοκληρώθηκε επιτυχώς!");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


