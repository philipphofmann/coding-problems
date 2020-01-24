import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class SortedListToBinaryTreeTest {

    private lateinit var sortedListNode: SortedListNode
    private lateinit var actual: BinaryTreeNode

    @Before
    fun before() {
        sortedListNode = SortedListNode(0)
    }

    @Test
    fun convertWithOneListNode() {
        sortedListNode = SortedListNode(1)

        whenConvert()

        thenShouldBe(BinaryTreeNode(1))
    }

    @Test
    fun convertWithThreeListNodes() {
        givenListNode(listOf(2, 4, 7))

        whenConvert()

        thenShouldBe(BinaryTreeNode(4, BinaryTreeNode(2), BinaryTreeNode(7)))
    }

    @Test
    fun convertWithFiveListNodes() {
        givenListNode(listOf(2, 4, 7, 9, 10))

        whenConvert()

        thenShouldBe(
            BinaryTreeNode(
                7,
                BinaryTreeNode(2, null, BinaryTreeNode(4)),
                BinaryTreeNode(9, null, BinaryTreeNode(10))
            )
        )
    }

    @Test
    fun convertWithSevenListNodes() {
        givenListNode(listOf(1, 2, 4, 7, 8, 9, 10))

        whenConvert()

        thenShouldBe(
            BinaryTreeNode(
                7, BinaryTreeNode(2, BinaryTreeNode(1), BinaryTreeNode(4)),
                BinaryTreeNode(9, BinaryTreeNode(8), BinaryTreeNode(10))
            )
        )
    }

    private fun givenListNode(listOf: List<Int>) {
        sortedListNode = SortedListNode(listOf.first())

        var tempListNode = sortedListNode
        listOf.subList(1, listOf.size).forEach {
            tempListNode.next = SortedListNode(it)
            tempListNode = tempListNode.next!!
        }
    }

    private fun whenConvert() {
        actual = SortedListToBinaryTree.convert(sortedListNode)!!
    }

    private fun thenShouldBe(binaryTreeNode: BinaryTreeNode) {
        assertEquals(binaryTreeNode, actual)
    }

}