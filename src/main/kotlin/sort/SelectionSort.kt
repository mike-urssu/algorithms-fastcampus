package sort

class SelectionSort(override val numbers: MutableList<Int>) : Sort {
    override fun sort() {
        repeat(numbers.size - 1) { i ->
            var min = numbers[i]
            var index = i

            for (j in i + 1 until numbers.size) {
                if (min > numbers[j]) {
                    min = numbers[j]
                    index = j
                }
            }

            swap(i, index)
        }
    }
}
