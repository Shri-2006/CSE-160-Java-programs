package HW6;
//Shriyans Singh 114807762
public class CookingRecipe {
	private String name;
	private java.util.ArrayList<RecipeIngredient> ingredients;
	public CookingRecipe(String name) {
		this.name=name;
		this.ingredients= new java.util.ArrayList<RecipeIngredient>();//gotta default it
	}
	
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		for(RecipeIngredient exist: ingredients) {//learning how to use the : in java :D
			if(exist.getName().equals(ingredient.getName())) {
				exist.setQuantity((exist.getQuantity()+quantity));
				return;																																		//it isn't stopping without this return
			}
		}//"else" doesn't work here? I think its just IDE acting up tho
		 
		ingredients.add(new RecipeIngredient(ingredient.getName(),ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),quantity));
		
	}
	
	public String getName() {
		return name;
	}
	
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (RecipeIngredient exist : ingredients) {
			if(exist.getName().equals(ingredient.getName())) {
				return exist;
			}
		}
		return null;
	}
	
	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for(RecipeIngredient exist : ingredients) {
			if(exist.getName().equals(ingredientName)) {
				return exist;
			}
		}
		return null;																																					//Stop forgetting the null
	}
	
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		for(RecipeIngredient exist: ingredients) {
			if(exist.getName().equals(ingredient.getName())) {//I did a == for this at one point, I forgot that == checks reference for String, and I am supposed to use .equals
				ingredients.remove(exist);
				return exist;
			}
		}
		return null;																																															//YOU FORGOT THE NULL AGAIN
	}
	public float calculateCalories() {																			//make AllCalories to reduce it						//go back and make something to reduce workload here
		float total=0;
		for(RecipeIngredient exist: ingredients) {
			total+=exist.getAllCalories();
		}
		return total;
	}
	
	public int getNumberOfIngredients() {
		int total=ingredients.size();
		return total;
	}
	
	public String toString() {
		/*String res="Recipe";
		res+=("name of recipe is "+name);
		for(RecipeIngredient exist :ingredients) {
			res+=exist.toString();
		}
		return res;*/
		
		String res = "CookingRecipe\n"+"name="+name+"\n"+"Ingredients:\n";
		for(RecipeIngredient i:ingredients) {
			res+=i.toString()+"\n";
		}
		return res;
	}
	
	public boolean equals(Object o) {
		if (o instanceof CookingRecipe) {
			return (name.equals(((CookingRecipe) o).name) && ingredients.equals(((CookingRecipe) o).ingredients));
		}
		return false;
	}
	
}
