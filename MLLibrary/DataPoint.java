public class DataPoint {
    double f1;
    double f2;
    String label;
    String type;
    DataPoint(){
        f1 = new Random();
        f2 = new Random();
        
    }
    DataPoint2(String label, String type){
        this.label = label;
        this.type = type;
        f1 = new Random();
        f2 = new Random();
    }
	public double getF1() {
		return f1;
	}
	public void setF1(double f1) {
		this.f1 = f1;
	}
	public double getF2() {
		return f2;
	}
	public void setF2(double f2) {
		this.f2 = f2;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}