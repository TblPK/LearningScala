import scala.annotation.tailrec

object BinarySearch:

    def binarySearchIterative(arr: Array[Int], tar: Int): Int =
        var (left, right) = (0, arr.length - 1)
        while (left <= right)
            val mid = left + (right - left) / 2
            mid match
                case _ if arr(mid) == tar => return mid
                case _ if arr(mid) < tar => left = mid + 1
                case _ if arr(mid) > tar => right = mid - 1
        -1 // return -1

    @tailrec
    def binarySearchRecursive(arr: Array[Int], tar: Int)(left: Int = 0, right: Int = arr.length - 1): Int =
        val mid = left + (right - left) / 2
        mid match
            case _ if left > right => -1
            case _ if arr(mid) == tar => mid
            case _ if arr(mid) < tar => binarySearchRecursive(arr, tar)(mid + 1, right)
            case _ if arr(mid) > tar => binarySearchRecursive(arr, tar)(left, mid - 1)
