package HW6;
//Shriyans Singh 114807762
public class RecipeBook {
	private String bookName;
	private java.util.ArrayList<CookingRecipe> recipe_list;
	public RecipeBook(String bookName) {
		this.bookName=bookName;
		this.recipe_list=new java.util.ArrayList<>();
	}
	
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for(CookingRecipe recipe: recipe_list) {
			if(recipe.toString().contains("name of recipe is "+name)) {
				return null;
			}
		}
		CookingRecipe recipe= new CookingRecipe(name);
		for(RecipeIngredient exist:ingredients) {
			recipe.addOrUpdateRecipeIngredient(exist,exist.getQuantity());																																			//i kept mispelling this until I gave up and copy/pasted it.... 
		}
		recipe_list.add(recipe);
		//return recipe_list;
		return recipe;																																																		//this works...I lost track of what I was doing so it took a while to figure out what I was thinking haha...
	}
	
	/*public CookingRecipe removeRecipe(String name) {
		for (CookingRecipe recipe :recipe_list) {																														//if in list, it will delete. Come back tmr
			if(recipe.toString().contains("name of recipe is "+name)) {
				recipe_list.remove(recipe);
				return recipe;
			}
		}
		return null;
	}*/																																													//NOT DELETING SALAD, I DON'T THINK THIS WORKS SO I M GOING TO REWRITE BASED ON THAT LAB WE DID
	
	public CookingRecipe removeRecipe(String name) {
		for (CookingRecipe recipe :recipe_list) {
			if(recipe.getName().equals(name)) {
				recipe_list.remove(recipe);
				return recipe;
			}
		}
		return null;
	}
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		java.util.ArrayList<CookingRecipe> res = new java.util.ArrayList<>();
		for(CookingRecipe recipe:recipe_list) {
			boolean checker= true;																//private doesn't work here? apparently it is illegal and has to be a default? Figure this out befroe final exam
			for(RecipeIngredient i : ingredients) {
				if(recipe.getRecipeIngredient(i.getName())==null) {
					checker=false;
					break;//needs either break or return here
				}
			}
			if(checker==true) {
				res.add(recipe);
			}
		}
		if(res.isEmpty()) {																															//geeksfor website explained this
			return null;
		}
		return (res.toArray(new CookingRecipe[res.size()]));																																			//https://www.geeksforgeeks.org/arraylist-toarray-method-in-java-with-examples/
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		java.util.ArrayList<CookingRecipe> res = new java.util.ArrayList<>();
		int n = numberOfIngredients;
		for(CookingRecipe recipe:recipe_list) {
			if(recipe.getNumberOfIngredients()<= n) {
				res.add(recipe);
			}
		}
		if(res.isEmpty()) {
			return null;
		}
		return (res.toArray(new CookingRecipe[res.size()]));
	}
	
	public CookingRecipe[] findRecipesLowCalories() {
		float mincal=recipe_list.get(0).calculateCalories();
		java.util.ArrayList<CookingRecipe>res=new java.util.ArrayList<>();																													//inheritence and polymorphism slideshow explains hwo to do this
		if(recipe_list.isEmpty()) {
			return null;			//order matters I think
		}
		for(CookingRecipe recipe:recipe_list) {
			float cal = recipe.calculateCalories();
			if(cal<mincal) {
				mincal=cal;
			}
		}
		for(CookingRecipe recipe:recipe_list) {
			if(recipe.calculateCalories()==mincal) {
				res.add(recipe);
			}
		}
		if(res.isEmpty()) {
			return null;																//if placed first it messes up response
		}
		return(res.toArray(new CookingRecipe[res.size()]));
		
	}
	
	public String toString() {
		/*String res = "Name of Book: "+bookName;
		for(CookingRecipe recipe: recipe_list) {
			res+="\n"+recipe.toString();//separate by line each recipe
		}
		return res;*/
		
		String res="RecipeBook\n"+"bookName="+bookName+"\n";
		for(CookingRecipe recipe:recipe_list) {
			res+=recipe.toString()+"\n";
		}
		return res;
	}
	
	public boolean equals(Object o) {
		if(o instanceof RecipeBook) {
			return (bookName.equals(((RecipeBook)o).bookName) && recipe_list.equals(((RecipeBook)o).recipe_list));
		}
		return false;
	}
	
	
	
	
	
	
	
}
