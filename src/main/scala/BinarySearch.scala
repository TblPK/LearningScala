import scala.annotation.tailrec

def binarySearchIterative(arr: Array[Int], tar: Int): Int =
    var (left, right) = (0, arr.length - 1)
    while (left <= right)
        val mid = left + (right - left) / 2
        arr(mid) match
            case v if v == tar => return mid
            case v if v < tar => left = mid + 1
            case v if v > tar => right = mid - 1
    -1 // return -1

@tailrec
def binarySearchRecursive(arr: Array[Int], tar: Int)(left: Int = 0, right: Int = arr.length - 1): Int =
    val mid = left + (right - left) / 2
    arr(mid) match
        case v if left > right => -1
        case v if v == tar => mid
        case v if v < tar => binarySearchRecursive(arr, tar)(mid + 1, right)
        case v if v > tar => binarySearchRecursive(arr, tar)(left, mid - 1)

object BinarySearch // Time complexity: O(log(n)) Space complexity: O(1)

