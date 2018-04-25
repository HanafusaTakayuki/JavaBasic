package practice18.entity;

public class Player {

	private String position;
	private String name;
	private String countly;
	private String team;


	public String getPosition() {
		return this.position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountly() {
		return countly;
	}

	public void setCountly(String countly) {
		this.countly = countly;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String toString() {
		return getPosition() + "," + getName() + "," + getCountly() + "," + getTeam();
	}

}
