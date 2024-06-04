import org.scalatest.funsuite.AnyFunSuiteLike

class MergeSortTest extends AnyFunSuiteLike:

    test("Empty list") {
        val arr = List.empty[Int]
        val res = List.empty[Int]
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Single element list") {
        val arr = List(1)
        val res = List(1)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Two element sorted list") {
        val arr = List(1, 2)
        val res = List(1, 2)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Two element unsorted list") {
        val arr = List(2, 1)
        val res = List(1, 2)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Already sorted list") {
        val arr = List(1, 2, 3, 4, 5)
        val res = List(1, 2, 3, 4, 5)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Reverse sorted list") {
        val arr = List(5, 4, 3, 2, 1)
        val res = List(1, 2, 3, 4, 5)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Unsorted list with duplicates") {
        val arr = List(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
        val res = List(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Unsorted list") {
        val arr = List(4, 2, 7, 1, 3, 6, 5)
        val res = List(1, 2, 3, 4, 5, 6, 7)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("List with negative numbers") {
        val arr = List(-3, -1, -4, -1, -5, -9, -2, -6, -5, -3, -5)
        val res = List(-9, -6, -5, -5, -5, -4, -3, -3, -2, -1, -1)
        assert(MergeSort.mergeSort(arr) == res)
    }

    test("Mixed positive and negative numbers") {
        val arr = List(3, -1, 4, -1, 5, -9, 2, -6, 5, -3, 5)
        val res = List(-9, -6, -3, -1, -1, 2, 3, 4, 5, 5, 5)
        assert(MergeSort.mergeSort(arr) == res)
    }

