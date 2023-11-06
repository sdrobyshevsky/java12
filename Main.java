public class Main {
public static void main(String[] args) {
String idString = "1,2,3";
String nameString = "Toy1,Toy2,Toy3";
String frequencyString = "0.5,0.3,0.2";

ToyCollection collection = new ToyCollection(idString, nameString, frequencyString);
collection.writeResultsToFile("output.txt");
}
} 