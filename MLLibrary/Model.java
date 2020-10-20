public abstract class Model {
    public abstract void train(ArrayList<DataPoint> data);
    public abstract String test(ArrayList<DataPoint> data);
    public abstract Double getAccuracy(ArrayList<DataPoint> data);
    public abstract Double getPrecision(ArrayList<DataPoint> data);
}
