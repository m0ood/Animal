class Horse(food: String, location: String) : Animal(food, location) {
    val speed = 60.86
    override fun makeNoise() {
        println("A horse with a speed of $speed km/h is snorting")
    }
    override fun eat() {
        println("The horse is eating $food")
    }
    override fun sleep() {
        println("The horse sleeps on $location")
    }
}