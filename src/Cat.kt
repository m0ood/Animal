class Cat(food: String, location: String) : Animal(food, location) {
    val legsLength = 30
    override fun makeNoise() {
        println("A cat with paws $legsLength centimeters long is meows")
    }
    override fun eat() {
        println("The cat eats $food")
    }
    override fun sleep() {
        println("The cat sleeps on $location")
    }
}