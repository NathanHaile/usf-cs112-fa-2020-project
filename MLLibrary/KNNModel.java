package com.company;
package collections;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class KNNModel {
    //ArrayList<DataPoint> dataPoints = new ArrayList<DataPoint>();

    private ArrayList<DataPoint> trainSet;
    private ArrayList<DataPoint> testSet;
    private int K;
    private int survived = 0;
    private int notsurvived = 0;

    public KNNModel(int K) {
        this.K = K;
        this.trainSet = new ArrayList<DataPoint>();
        this.testSet = new ArrayList<DataPoint>();
    }

    private double getDistance(DataPoint p1, DataPoint p2){
        double result = Math.sqrt(Math.pow((p1.getAge()-p2.getAge()), 2)+ Math.pow((p1.getFare()-p2.getAge()),2));
        return result;
    }

    public void train(ArrayList<DataPoint> data) {
        for (DataPoint dp : data) {
            if (dp.getType() == "train") {
                trainSet.add(dataPoints);
            }
            if (dp.getLabel() == "0") {
                this.survived += 1;
            } else {
                this.notsurvived += 1;
            }
            this.trainSet = data;
        }

    }


    public String test(ArrayList<DataPoint> data) {
        DataPoint dp = data.get(0);

        if (dp.getType() == "test") {
            int size = trainSet.size();
            Double[][] array = new Double[data.size()][2];
        }

        for (int i = 0; i < data.size(); i++) {
            for(int j = 0; j < trainsSet.size(); j++){
                double distance = getDistance(data.get(i), trainSet.get(j));
                array[i][0] = distance;
                array[i][1] = Double.parseDouble(trainSet.get(i).getLabel());

            }
        }

        Java.utils.Arrays.sort(array, new Comparator<Doulbe[]>() {
            public int compare(Double[] a, Dobule[] b) {
                return a[0].compareTo(b[0]);
            }
        });
        int Zeros = 0;
        int Ones = 0;

        for (int i = 0; i < k; i++) {
            if (array[i][1]) {
                Zeros++;
            }
            else {
                Ones++;
            }
        }

        if (Zeros > Ones) {
            return "0";
        }
        else {
            return "1";
        }

    }

    public Double getAccuracy(ArrayList<DataPoint> data) {
        double truePositive = 0;
        double trueNegative = 0;
        double falsePositive = 0;
        double falseNegative = 0;



        test(data);
        for(DataPoint dataPoint1 : data) {
            ArrayList<DataPoint> currentTestdata = new ArrayList<DataPoint>();
            currentTestdata.add(dataPoint1);
            String testLabel = test(currentTestdata);

            if (dataPoint1.getLabel() == "1" && testLabel == "1") {
                truePositive++;
            }
            else if (dataPoint1.getLabel() == "1" && testLabel == "0") {
                falsePositive++;
            }
            else if (dataPoint1.getLabel() == "0" && testLabel == "1") {
                falseNegative++;
            }
            else {
                trueNegative++;
            }
        }
        return (truePositive + trueNegative) / truePositive + trueNegative + falsePositive + falseNegative);
    }

    double getPrecision(Array.List<DataPoint> data) {
        double truePositive = 0;
        double trueNegative = 0;
        double falsePositive = 0;
        double falseNegative = 0;

        test(data);
        for(DataPoint dataPoint1 : data) {
            ArrayList<DataPoint> currentTestdata = new ArrayList<DataPoint>();
            currentTestdata.add(dataPoint1);
            String testLabel = test(currentTestdata);

            if (dataPoint1.getLabel() == "1" && testLabel == "1") {
                truePositive++;
            }
            else if (dataPoint1.getLabel() == "1" && testLabel == "0") {
                falsePositive++;
            }
            else if (dataPoint1.getLabel() == "0" && testLabel == "1") {
                falseNegative++;
            }
            else {
                trueNegative;
            }


        return (truePositive) / (truePositive + falseNegative);
}

}

