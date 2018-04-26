package practice13.common;

public class SuperHero extends Hero{

	private Item equipment;

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	public int attack(){
		return  super.attack() + this.equipment.getAdditionalDamage();
	}

}
