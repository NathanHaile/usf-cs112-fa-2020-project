public class DummyModel extends Model{
    double differences = 0.0;
    double differences2 = 0.0;

    public void train(ArrayList<DataPoint> data){
        for (int i = 0; i < data.size(); i++){
            differences += data[i].f1 - data[i].f2;
        }
        double avgdif = differences / data.size();
        System.print.ln(avgdif);
    }
    public String test(ArrayList<DataPoint> data){
        for (int i = 0; i < data.size(); i++){
            differences2 += data[i].f1 - data[i].f2;
        }
        double avgdif2 = differences2 / data.size();
        System.print.ln(avgdif2);

    }
    public Double getAccuracy(ArrayList<DataPoint> data){
        
    }
    public Double getPrecision(ArrayList<DataPoint> data){

    }


}
