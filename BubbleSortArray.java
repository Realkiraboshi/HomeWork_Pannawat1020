package th.ac.utcc.cpe.B1;

public class BubbleSortArray {
	private double [] element;
	private double eSize;
	
	public BubbleSortArray(double size) {
		if(size > 0)
			this.element = new double[(int) size];
		else
			
			this.element = new double[10];
		eSize = 0;	
			
	}
	
	public void insert(double e) {
		this.element[(int) eSize] = e;
		eSize++;
	}
	
	public void show() {
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i]+ "   ");
			
		}
			System.out.println("");
		
	}
	
	public void bubbleSort() {
		double out;
		int in;
		for(out = eSize -1; out > 0; out--) {
			for(in = 0; in < out; in++){
			if(this.element[in] < this.element[in + 1]) {
				this.swap(in,  in + 1);
			 }
		  }
	   }
	}
	
private void swap(double left, double right) {
	double temp = this.element[(int) left];
	this.element[(int) left] = this.element[(int) right];
	this.element[(int) right] = temp;
	
 }
	
public static void main(String [] args){
	
	double max = 20;
	BubbleSortArray bubble = new BubbleSortArray(max);
	
	bubble.insert(1);
	bubble.insert(3);
	bubble.insert(5);
	bubble.insert(7);
	bubble.insert(6);
	bubble.insert(2);
	bubble.insert(4);
	bubble.insert(8);
	
	
	System.out.println("Original Order: ");
	bubble.show();
	
	bubble.bubbleSort();
	System.out.println("  Sorted Order: ");
	bubble.show();
    }	
  }
