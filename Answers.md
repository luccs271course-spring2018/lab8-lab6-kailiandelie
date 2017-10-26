### Why does `FixedArrayQueue` require an explicit constructor?

`FixedArrayQueue` requires an explicit contructor because its specific elements like the size needs to be defined.

### What happens when you offer an item to a full `FixedArrayQueue`?

It would return false because there is no room for the new item.

### What happens when you poll an empty `FixedArrayQueue`?

The method would return null because there is nothing inside of the queue to be removed.

### What is the time and (extra) space complexity of each of the `FixedArrayQueue` methods?Why does FixedArrayQueue require an explicit constructor?

offer, peek, poll, and isEmpty are all O(1); asList is O(n)

