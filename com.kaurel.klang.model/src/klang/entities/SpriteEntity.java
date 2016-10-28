package klang.entities;

public interface SpriteEntity extends Entity {
	//Position
	public Double getX();
	public Double getY();

	default public void setPosition(Double x, Double y) {
		setX(x);
		setY(y);
	};
	
	public void setX(Double x);
	public void setY(Double y);

	//Rotation
	public void turnLeft(Double degrees);
	public void turnRight(Double degrees);
	
	
	// Print message to speech bubble on sprite
	public void say(String msg);

	default public void say(Boolean msg) {
		say("" + msg);
	}

	default public void say(Double msg) {
		say("" + msg);
	}

	default public void say(Integer msg) {
		say("" + msg);
	}
}
