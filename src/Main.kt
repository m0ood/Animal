fun main() {
    val animals = arrayOf(
        Cat("fish", "cushion"),
        Dog("meat", "doghouse"),
        Horse("hay", "corral")
    )
    val veterinarian = Veterinarian()
    animals.forEach {
        it.makeNoise()
        veterinarian.treatAnimal(it)
    }
}