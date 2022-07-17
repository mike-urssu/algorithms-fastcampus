package sort

interface Sort {
    val numbers: MutableList<Int>

    fun sort()

    fun swap(prevIndex: Int, nextIndex: Int) {
        val temp = numbers[prevIndex]
        numbers[prevIndex] = numbers[nextIndex]
        numbers[nextIndex] = temp
    }
}
