package HW6;
//Shriyans Singh 114807762
public class RecipeIngredient extends Ingredient{
	private float quantity;//why are we using float i don't know, but that is what is says for public RecipeIngredient
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name,measuringUnit,caloriesPerUnit);
		this.quantity=quantity;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity=quantity;//I forgot that set has to be void for a bit, that was annoying to figure out
	}
	public float getAllCalories() {
		float res= (getCaloriesPerUnit()*quantity);
		return res;
	}
	
	public String toString() {
		return "RecipeIngredient\n"+super.toString()+"\nquantity="+quantity;
		//return "quanitity is "+quantity+super.toString();
	}
	
	public boolean equals(Object o) {
		if (o instanceof RecipeIngredient) {
			return (quantity == ((RecipeIngredient)o).quantity)&&super.equals(o);
		}
		return false;
	}

}
