/**
 * See https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
 */
object SortedListToBinaryTree {

    fun convert(sortedListNode: SortedListNode): BinaryTreeNode? {

        val sortedList = convertSortedListNode(sortedListNode)

        return convertInternal(sortedList)
    }

    private fun convertInternal(sortedList: List<Int>): BinaryTreeNode? {
        if (sortedList.isEmpty()) {
            return null
        }

        val medianIndex = sortedList.lastIndex / 2

        val leftList = sortedList.subList(0, medianIndex)
        val rightList = sortedList.subList(medianIndex + 1, sortedList.size)

        return BinaryTreeNode(sortedList[medianIndex], convertInternal(leftList), convertInternal(rightList))
    }

    private fun convertSortedListNode(sortedListNode: SortedListNode): List<Int> {
        val sortedList = ArrayList<Int>()

        var nextNode: SortedListNode? = sortedListNode
        while (nextNode != null) {
            sortedList.add(nextNode.value)
            nextNode = nextNode.next
        }

        return sortedList
    }
}

data class SortedListNode @JvmOverloads constructor(val value: Int, var next: SortedListNode? = null)

data class BinaryTreeNode @JvmOverloads constructor(
    val value: Int,
    val left: BinaryTreeNode? = null,
    val right: BinaryTreeNode? = null
)