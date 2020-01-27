/**
 * Returns true if the passed list contains a value at least twice and it returns false if all the elements are
 * distinct.
 */
fun containsDuplicate(values: List<Int>): Boolean {
    val hashSet = HashSet<Int>()

    values.forEach { value ->
        if (hashSet.contains(value)) {
            return true
        }

        hashSet.add(value)
    }

    return false
}