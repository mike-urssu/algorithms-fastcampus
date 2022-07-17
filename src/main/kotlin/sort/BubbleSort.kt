package sort

class BubbleSort(override val numbers: MutableList<Int>) : Sort {
    override fun sort() {
        repeat(numbers.size - 1) { i ->
            for (j in 0 until numbers.size - i - 1) {
                if (numbers[j] > numbers[j + 1])
                    swap(j, j + 1)
            }
        }
    }
}
