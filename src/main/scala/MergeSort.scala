object MergeSort:

    def mergeSort(list: List[Int]): List[Int] = list match
        case Nil => Nil
        case x :: Nil => List(x)
        case _ =>
            val (left, right) = list.splitAt(list.length / 2)
            merge(mergeSort(left), mergeSort(right))

    private def merge(list1: List[Int], list2: List[Int]): List[Int] = (list1, list2) match
        case (_, Nil) => list1
        case (Nil, _) => list2
        case (x :: xt, y :: yt) =>
            if (x < y) x :: merge(xt, list2)
            else y :: merge(yt, list1)
