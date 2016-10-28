package klang.entities;

public interface Entity {
	// Print to console
	public void print(String msg);

	default public void print(Boolean msg) {
		print("" + msg);
	}

	default public void print(Double msg) {
		print("" + msg);
	}

	default public void print(Integer msg) {
		print("" + msg);
	}
	
	// mouse position
	public Double mouseX();
	public Double mouseY();

}
