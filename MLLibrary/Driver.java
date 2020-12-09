import javax.swing.*;
import java.awt.*;       
import java.io.*;
import javax.swing.Icon;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


public class Driver {
    public static void main(String[] args) {
        ArrayList<DataPoint>train = new ArrayList<DataPoint>();
        ArrayList<DataPoint>test = new ArrayList<DataPoint>();
        for (i = 0; i < 10; i++){
            train.add(new DataPoint());
            test.add(new DataPoint());
        }      
        DummyModel obj = new DummyModel();
        obj.train(ArrayList<DataPoint> train);
        obj.test(ArrayList<DataPoint> test);
        obj.getAccuracy(ArrayList<DataPoint> test);
        obj.getPrecision(ArrayList<DataPoint> test);
        
    }
    private static void initAndShowGUI(){
        JFrame myFrame = new JFrame("Precision and Accuracy");
        Container contentPane = myFrame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setLayout(new GridLayout(2,2));
        contentPane.add(new JButton("Precision"));
        contentPane.add(new JButton(obj.getPrecision(ArrayList<DataPoint> data)));
        contentPane.add(new JButton("Accuracy"));
        contentPane.add(new JButton(obj.getAccuracy(ArrayList<DataPoint> data));

    }

    // Helper function to split the line by commas and
    // return the values as a List of String
    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }


    ArrayList<DataPoint> dataPoints = new ArrayList<DataPoint>();

    try (Scanner scanner = new Scanner(new File("titanic.csv"));) {
        while (scanner.hasNextLine()) {
            List<String> records = getRecordFromLine(scanner.nextLine());
            for (int i = 4, int j = 5; i < records.size(); i = i + 6, j = j + 6) {
                DataPoint dp = new DataPoint(records[i]);
                dataPoints.add(dp)
                dp = new DataPoint(records[j]);
                dataPoints.add(dp)
            }
        }
    }

    ArrayList<DataPoint> trainData = new ArrayList<DataPoint>;
    ArrayList<DataPoint> testData = new ArrayList<DataPoint>;

    public createLists(dataPoints) {
        // Put the below code in a method
        for (DataPoint dp : dataPoints) {

            Random rand = new Random();
            double randNum = rand.nextDouble();
            // 90% of the data is reserved for training
            if (randNum < 0.9) {
                dp.setLabel("train");
                trainData.add(dp);
            } else {
                dp.setLabel("test");
                testData.add(dp);
            }
        }
    }

    createLists(dataPointList);


}
