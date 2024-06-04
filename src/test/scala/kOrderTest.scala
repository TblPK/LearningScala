import org.scalatest.funsuite.AnyFunSuiteLike

class kOrderTest extends AnyFunSuiteLike:

    test("kOrder function should return k-th smallest element in the list") {
        val list = List(4, 2, 7, 1, 3, 9)
        val sortList = list.sorted
        assert(kOrder.kOrder(list, 1) == sortList(1 - 1))
        assert(kOrder.kOrder(list, 5) == sortList(5 - 1))
        assert(kOrder.kOrder(list, 6) == sortList(6 - 1))
    }

    test("kOrder function should handle duplicate elements correctly") {
        val list = List(4, 2, 7, 1, 3, 1)
        val sortList = list.sorted
        assert(kOrder.kOrder(list, 1) == sortList(1 - 1))
        assert(kOrder.kOrder(list, 2) == sortList(2 - 1))
        assert(kOrder.kOrder(list, 5) == sortList(5 - 1))
    }

    test("kOrder function should handle edge cases") {
        assertThrows[IllegalArgumentException] {
            kOrder.kOrder(List.empty[Int], 0)
        }
        assert(kOrder.kOrder(List(4), 1) == 4)
        assert(kOrder.kOrder(List(4, 2), 1) == 2)
        assert(kOrder.kOrder(List(4, 2), 2) == 4)
    }

    test("kOrder function should handle negative numbers") {
        val list = List(-4, 2, -7, 0, -3, 1)
        val sortList = list.sorted
        assert(kOrder.kOrder(list, 1) == sortList(1 - 1))
        assert(kOrder.kOrder(list, 4) == sortList(4 - 1))
        assert(kOrder.kOrder(list, 6) == sortList(6 - 1))
    }

    test("kOrder function should handle large lists") {
        val list = (1 to 10000).toList
        assert(kOrder.kOrder(list, 5000) == list(5000 - 1))
        val nList = (10000 to 1 by -1).toList
        val nSortList = nList.sorted
        assert(kOrder.kOrder(nList, 5000) == nSortList(5000 - 1))
    }