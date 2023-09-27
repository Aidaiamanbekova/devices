import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class MainProgram {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<String> deviceTypes = new HashSet<>();

        int numDevices = rand.nextInt(20) + 1;
        Device[] devices = new Device[numDevices];

        double totalCost = 200.0;
        double totalWeight = 55.8;

        for (int i = 0; i < numDevices; i++) {
            String[] possibleDeviceTypes = {"Smartphone", "Laptop"};
            String randomType = possibleDeviceTypes[rand.nextInt(possibleDeviceTypes.length)];
            deviceTypes.add(randomType);

            if (randomType.equals("Smartphone")) {
                double screenSize = rand.nextDouble() * 6 + 4;
                double cameraResolution = rand.nextDouble() * 20 + 5;
                devices[i] = new Smartphone(screenSize, cameraResolution);
            } else if (randomType.equals("Laptop")) {
                double displayScreen = rand.nextDouble() * 10 + 11;
                String[] colors = {"Black", "Silver", "White", "Blue", "Red"};
                String randomColor = colors[rand.nextInt(colors.length)];
                devices[i] = new Laptop(displayScreen, randomColor);
            }

            totalCost += devices[i].getPrice();
            totalWeight += devices[i].getWeight();
        }


        System.out.println("Количество различных типов устройств: " + deviceTypes.size());
        System.out.println("Общая стоимость всех устройств: $" + totalCost);
        System.out.println("Общий вес всех устройств: " + totalWeight + " грамм");
    }
}