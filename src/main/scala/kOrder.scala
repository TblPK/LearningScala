import scala.annotation.tailrec

object kOrder:

    @tailrec
    def kOrder(list: List[Int], k: Int): Int =
        if (list.isEmpty) throw new IllegalArgumentException("List is empty")
        val pivot = list.head
        val (left, right) = list.tail.partition(_ < pivot)
        val pivotIndex = left.length + 1
        pivotIndex match
            case p if k < p => kOrder(left, k)
            case p if p < k => kOrder(right, k - pivotIndex)
            case _ => pivot
            