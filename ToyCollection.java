import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyCollection {
private int[] ids;
private String[] names;
private double[] frequencies;
private PriorityQueue toys;

public PriorityQueue getToys() {
    return toys;
}

public void setToys(PriorityQueue toys) {
    this.toys = toys;
}

public ToyCollection(String idString, String nameString, String frequencyString) {
String[] idArr = idString.split(",");
String[] nameArr = nameString.split(",");
String[] frequencyArr = frequencyString.split(",");

if (idArr.length < 3 || nameArr.length < 3 || frequencyArr.length < 3) {
throw new IllegalArgumentException("All input strings must contain at least 3 elements");
}

this.ids = new int[idArr.length];
this.names = new String[nameArr.length];
this.frequencies = new double[frequencyArr.length];

for (int i = 0; i < idArr.length; i++) {
this.ids[i] = Integer.parseInt(idArr[i]);
this.names[i] = nameArr[i];
this.frequencies[i] = Double.parseDouble(frequencyArr[i]);
}

this.toys = new PriorityQueue();
for (int i = 0; i < ids.length; i++) {
Toy toy = new Toy(ids[i], names[i], frequencies[i]);
toys.add(toy);
}
}

public ToyCollection(String idString, String nameString, String frequencyString, Object toys2) {
}

public void writeResultsToFile(String filename) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
for (int i = 0; i < 10; i++) {
Toy toy = (Toy) toys.poll();
writer.write(toy.toString());
writer.newLine();
}
} catch (IOException e) {
e.printStackTrace();
}
}
}


