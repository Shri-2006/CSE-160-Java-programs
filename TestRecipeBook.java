package HW6;
//Shriyans Singh 114807762
public class TestRecipeBook {
	public static void main(String[] args) {
		// make a book and ingredients and craete recipe ,then remove recipe,then state which ingredients are on hand then find recipe with one ingredient, then one with few ingredients, then low claorie, then print book original and final. THat should be all methods that have to be tested 
		//book
		RecipeBook firstbook = new RecipeBook("SimpleFood");
		
		RecipeIngredient s_recipe= new RecipeIngredient("sugar","g",1,10);
		RecipeIngredient e_recipe= new RecipeIngredient("egg","g",2,4);
		RecipeIngredient f_recipe= new RecipeIngredient("flour","g",4,5);
		RecipeIngredient g_recipe= new RecipeIngredient("grass","g",1,1);//I don't like salad :D
		CookingRecipe bread = firstbook.addRecipe("bread", new RecipeIngredient[] {f_recipe,e_recipe,s_recipe});
		CookingRecipe eggs= firstbook.addRecipe("Scrambled Eggs", new RecipeIngredient[] {e_recipe});
		CookingRecipe salad= firstbook.addRecipe("salad", new RecipeIngredient[] {g_recipe});
		System.out.println("All Recipes\n"+firstbook); //works
		
		CookingRecipe remover=firstbook.removeRecipe("salad");
		
		if(remover==null) {
			System.out.println("No recipes deleted");
		}
		else {
			System.out.println("deleted recipes\n");
			System.out.println(remover);
		}
		
		Ingredient s = new Ingredient("sugar", "g", 11);
		Ingredient e=new Ingredient("egg","g",5);
		Ingredient f= new Ingredient("flour","g",6);
		
		CookingRecipe[]finder=firstbook.findRecipes(new RecipeIngredient[] {e_recipe});
		if(finder==null) {
			System.out.println("no recipes have egggs in them");
		}
		else {
			System.out.println("Recipes with eggs:");
			for(CookingRecipe haseggs: finder) {
				System.out.println(haseggs);//works
			}
		}
		
		
		CookingRecipe[] fewIng=firstbook.findRecipesWithFewIngredients(1);
		
		if(fewIng==null) {
			System.out.println("No recipes with one ingredient");
			
		}
		else {
			System.out.println("One ingredient recipe");
			for(CookingRecipe recipe:fewIng) {
				System.out.println(recipe);//works
			}
		}
		
		
		CookingRecipe[] lowcal=firstbook.findRecipesLowCalories();
	//	if(lowcal==null) {//not needed actually
		//}
		if(lowcal!=null) {
			System.out.println("Recipes with lowest calories is/are: ");
			for(CookingRecipe recipe: lowcal) {
				System.out.println(recipe);																					//was giving object name when i put lowacal instead of recipe
			}
		}
		
		System.out.println("Final list of Recipes in Recipebook: \n"+firstbook);
		
		
		
		
		
		
	}

}
