package sort

import utils.RandomNumberGenerator

fun main() {
    val sizeOfList = 10

    run {
        println("Bubble Sort")
        val numbers = RandomNumberGenerator.generateNumbers(sizeOfList)
        println("Unsorted List: $numbers")
        BubbleSort(numbers).sort()
        println("  Sorted List: $numbers")
        println()
    }

    run {
        println("Selection Sort")
        val numbers = RandomNumberGenerator.generateNumbers(sizeOfList)
        println("Unsorted List: $numbers")
        SelectionSort(numbers).sort()
        println("  Sorted List: $numbers")
        println()
    }
}
