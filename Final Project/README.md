# Random Menu Maker

## Synopsis
This program allow a user to make a list of recipes and select random ones to create a menu. 

## Motivation
This program helps users who do not want to figure out what to cook for dinner during the week.

## How to Run
In order to select a random recipe, the program needs to either have recipes added to the menu, or have a list of recipes uploaded. 
The test.txt file in this folder is a sample of recipes.
Below are some pictures of the program running and how it works.

[This the start page of the program. Type a number 1-6 to select an option.](Main Menu.jpg)

[1. Upload a recipe. Make sure the file is in the same folder as the code!](Option 1.jpg)

Any text files with typed recipes must be typed in this format:
1st Recipe Name
Ethnicity
Cook Time (Number only!)
true/false (Is the food served hot?)
"Ingredients"  (Type the word without the quotations)
Ingredient Name
Ingredient Type
true/false (Is the food meat?)
(Continue typing ingredients in that form until finished)
"Ingredients"
2nd Recipe Name
...

*Note it is easier to use the program to add recipes and then save the recipe list.

[2. Add a new recipe. This will add a recipe to the current running program. To add a recipe to your text list, select option 3 and save the recipe list. ](Option 2.jpg)

[3. Save a recipe list. Type the same file name as the upload file to write over the uploaded file. Type a new name to save a different recipe list.](Option 3.jpg)

[4. Select a random recipe (no filter) This will select a random recipe with the option to add it to the weekly menu.](Option 4 Main.jpg)

[4. Select a random recipe (filters) There are 6 filter options. Multiple filters may be used at once, but be careful to not remove all of the recipes.](Option 4 Filters.jpg)

[5. Print a menu This will display a menu for the week based on the choices made in the "Select a random recipe" menu item.](Option 5.jpg)

## Code Example
This code reads in the information about the recipe and then the individual ingredients from a file.
```
Scanner fileIn1 = new Scanner(f1);

		while(fileIn1.hasNext()) {
			fileIn1.useDelimiter("\\p{javaWhitespace}+");

			String rName = fileIn1.nextLine();
			String ethnicity = fileIn1.nextLine();
			int cookTime = fileIn1.nextInt();
			boolean hot = fileIn1.nextBoolean();

			fileIn1.useDelimiter("\\s*Ingredients\\s*");
			String ingredients = fileIn1.next();

			Scanner string1 = new Scanner(ingredients);
			ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();

			while(string1.hasNext()) {
				String iName = string1.nextLine();
				String type = string1.next();
				boolean meat = string1.nextBoolean();

				try{
					string1.nextLine();
				}
				catch(Exception ex) {
				}

				Ingredient i1 = new Ingredient(iName, type, meat);
				ingredientList.add(i1);
			}

			Recipe r = new Recipe(rName, cookTime, ingredientList, ethnicity, hot);
			menu.add(r);
			string1.close();

			try{
				String s1 = fileIn1.nextLine();
				String s2 = fileIn1.nextLine();
			}
			catch(Exception ex) {
			}
		}
		fileIn1.close();
```
