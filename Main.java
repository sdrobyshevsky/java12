public class Main {
private static final Object toys = null;

public static void main(String[] args) {
String idString = "1,2,3";
String nameString = "Конструктор, Робот, Кукла"; 
String frequencyString = "0.2,0.2,0.6";

ToyCollection collection = new ToyCollection(idString, nameString, frequencyString, toys);
collection.writeResultsToFile("output.txt");
}
}
