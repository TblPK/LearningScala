import org.scalatest.funsuite.AnyFunSuiteLike

class BinarySearchTest extends AnyFunSuiteLike {

  test("Empty array") {
    val arr = Array.emptyIntArray
    val (tar, res) = (1, -1)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }

  test("Array with one element - target exists") {
    val arr = Array(7)
    val (tar, res) = (7, 0)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }

  test("Array with one element - target does not exist") {
    val arr = Array(7)
    val (tar, res) = (10, -1)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }

  test("Array with duplicate elements - target exists") {
    val arr = Array(1, 2, 2, 2, 3, 4)
    val (tar, res) = (2, 1) // Could be 1, 2, or 3 depending on the implementation
    assert(Set(1, 2, 3).contains(BinarySearch.binarySearchIterative(arr, tar)))
    assert(Set(1, 2, 3).contains(BinarySearch.binarySearchRecursive(arr, tar)()))
  }

  test("Target is the first element") {
    val arr = Array(-5, -1, 4, 6, 8)
    val (tar, res) = (-5, 0)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }

  test("Target is the last element") {
    val arr = Array(-5, -1, 4, 6, 8)
    val (tar, res) = (8, 4)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }

  test("Large array for performance") {
    val arr = (1 to 100_000).toArray
    val (tar, res) = (9_999, 9_998)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }

  test("Array with negative numbers - target exists") {
    val arr = Array(-10, -5, -2, 0, 3, 7, 9)
    val (tar, res) = (-5, 1)
    assert(BinarySearch.binarySearchIterative(arr, tar) == res)
    assert(BinarySearch.binarySearchRecursive(arr, tar)() == res)
  }
}
