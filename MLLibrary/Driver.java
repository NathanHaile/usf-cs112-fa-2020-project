import javax.swing.*;
import java.awt.*;       
import java.io.*;
import javax.swing.Icon;


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
        obj.getAccuracy(ArrayList<DataPoint> data);
        obj.getPrecision(ArrayList<DataPoint> data);
        
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

}
