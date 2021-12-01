class Dog(food: String, location: String) : Animal(food, location) {
    val noseColor= "white"
    override fun makeNoise() {
        println("A dog with a $noseColor nose is barking")
    }
    override fun eat() {
        println("The dog eats $food")
    }
    override fun sleep() {
        println("The dog sleeps on $location")
    }
}