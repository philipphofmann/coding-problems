import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class SortedListToBinaryTreeTest {

    private lateinit var sortedListNode: SortedListNode
    private lateinit var actual: BinaryTreeNode

    @BeforeTest
    fun before() {
        sortedListNode = SortedListNode(0)
    }

    @Test
    fun `one list node`() {
        sortedListNode = SortedListNode(1)

        whenConvert()

        thenShouldBe(BinaryTreeNode(1))
    }

    @Test
    fun `three list nodes`() {
        givenListNode(listOf(2, 4, 7))

        whenConvert()

        thenShouldBe(BinaryTreeNode(4, BinaryTreeNode(2), BinaryTreeNode(7)))
    }

    @Test
    fun `five list nodes`() {
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
    fun `seven list nodes`() {
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