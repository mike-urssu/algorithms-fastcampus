package utils

object RandomNumberGenerator {
    fun generateNumbers(size: Int): MutableList<Int> {
        val numbers = mutableListOf<Int>()
        for (i in 0 until size)
            numbers.add(generateRandomNumber())
        return numbers
    }

    private fun generateRandomNumber() = (Math.random() * 100).toInt()
}
