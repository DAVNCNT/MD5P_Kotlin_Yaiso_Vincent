fun main(){
    // List of Grocery Items
    // SODA
    // MILK
    // LIQUORS
    // WATER
    // WINE
    // chicken
    // Seafoods
    // Meat
    // White rice
    // Brown rice
    // Pasta
    // Chocolate
    // Crackers
    // nuts
    // Banana
    // Apples
    // Carrot
    // Spinach
    // Tomato

    println("\nItem:")
    var item= readln()

    println("\nIs the Item Liquid?")
    var isItemLiquid: String = readln()

    println("\nIs the Item Solid?")
    var isItemSolid: String = readln()

    println("\nIs the Item Frozen?")
    var isItemFrozen = readln()

//Grocery Category
    var frozen: String = "Chicken, Seafoods, Meat"
    var drinks: String = "Soda, Mil, Liquors, Water, Wine"
    var pastaAndRice: String = "White Rice, Brown Rice, Pasta"
    var snacks: String =  "Chocolate, Crackers, Nuts"
    var fruitsAndVegetables: String = "Banana, Apples, Carrot, Spinach, Tomato"

    println("$frozen \n$drinks \n$pastaAndRice \n$snacks \n$fruitsAndVegetables")
}