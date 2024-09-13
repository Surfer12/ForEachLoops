### Linked List in Java

#### Overview
A linked list is a linear data structure where each element is a separate object, called a node. Each node contains two items: data and a reference (or link) to the next node in the sequence. This structure allows for efficient insertion and deletion of elements.

#### Types of Linked Lists
1. **Singly Linked List**: Each node points to the next node and the last node points to null.
2. **Doubly Linked List**: Each node has two references, one to the next node and one to the previous node.
3. **Circular Linked List**: The last node points back to the first node, forming a circle.

##### Definition
A linked list is a linear data structure where each element is a separate object, called a node. Each node contains two items: data and a reference (or link) to the next node in the sequence. This structure allows for efficient insertion and deletion of elements.

#### Key points
- Linked lists are dynamic and can grow or shrink in size.
- Non-contiguous memory allocation. (Nodes can be scattered throughout memory)
- Efficient insertion and deletion operations.
- Do not allow direct access to elements by index, unlike arrays.
- Use more memory due to the storage of references.


#### Basic Operations
1. **Insertion**: Adding a new node to the list.
2. **Deletion**: Removing a node from the list.
3. **Traversal**: Accessing each node of the list.
4. **Search**: Finding a node with a specific value.

#### Singly Linked List Implementation

```java
public class SinglyLinkedList {
    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete by value
    public void deleteByValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Traverse the list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Search for a value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
```

#### Example Usage

```java
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.traverse(); // Output: 1 -> 2 -> 3 -> null

        list.deleteByValue(2);
        list.traverse(); // Output: 1 -> 3 -> null

        System.out.println(list.search(3)); // Output: true
        System.out.println(list.search(2)); // Output: false
    }
}
```

#### Key Points
- Linked lists are dynamic and can grow or shrink in size.
- They provide efficient insertion and deletion operations.
- They do not allow direct access to elements by index, unlike arrays.
- They use more memory due to the storage of references.

The time complexity of various operations in a linked list can be summarized as follows:

1. **Insertion**:
   - At the beginning: O(1)
   - At the end: O(n) for singly linked list (O(1) if tail reference is maintained), O(1) for doubly linked list
   - At a specific position: O(n)

2. **Deletion**:
   - At the beginning: O(1)
   - At the end: O(n) for singly linked list (O(1) if tail reference is maintained), O(1) for doubly linked list
   - At a specific position: O(n)

3. **Traversal**: O(n)

4. **Search**: O(n)

These complexities assume that the linked list does not maintain additional pointers (like a tail pointer) that could optimize certain operations.

A tail reference in a linked list is a pointer or reference to the last node in the list. Maintaining a tail reference can optimize certain operations, such as insertion at the end of the list, by reducing the time complexity from O(n) to O(1).

### Example with Tail Reference

Here's an example of a singly linked list implementation in Java that maintains a tail reference:

```java
public class SinglyLinkedListWithTail {
    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Delete by value
    public void deleteByValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
    }

    // Traverse the list
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Search for a value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
```

### Key Points
- **Insertion at the end**: With a tail reference, inserting at the end of the list is O(1) because you can directly access the last node.
- **Deletion**: Deleting the last node still requires traversal to update the tail reference, so it remains O(n) unless additional pointers are maintained.
- **Memory Overhead**: Maintaining a tail reference requires additional memory for the tail pointer.

To create a UML diagram for the different types of linked lists (Singly Linked List, Doubly Linked List, and Circular Linked List), we can outline the classes and their relationships. Below is a textual representation of the UML diagram:

### UML Diagram with Comments

```plaintext
+---------------------+
|      LinkedList     |
+---------------------+
| - head: Node        |  // Reference to the first node in the list
| - tail: Node        |  // Reference to the last node in the list (optional)
+---------------------+
| + insertAtBeginning(data: int): void |  // Inserts a node at the beginning
| + insertAtEnd(data: int): void       |  // Inserts a node at the end
| + deleteByValue(data: int): void     |  // Deletes a node by value
| + traverse(): void                   |  // Traverses the list
| + search(data: int): boolean         |  // Searches for a node by value
+---------------------+

        ^
        |
        |
+---------------------+
|  SinglyLinkedList   |
+---------------------+
| - head: Node        |  // Reference to the first node in the list
| - tail: Node        |  // Reference to the last node in the list (optional)
+---------------------+
| + insertAtBeginning(data: int): void |  // Inserts a node at the beginning
| + insertAtEnd(data: int): void       |  // Inserts a node at the end
| + deleteByValue(data: int): void     |  // Deletes a node by value
| + traverse(): void                   |  // Traverses the list
| + search(data: int): boolean         |  // Searches for a node by value
+---------------------+

        ^
        |
        |
+---------------------+
|  DoublyLinkedList   |
+---------------------+
| - head: Node        |  // Reference to the first node in the list
| - tail: Node        |  // Reference to the last node in the list
+---------------------+
| + insertAtBeginning(data: int): void |  // Inserts a node at the beginning
| + insertAtEnd(data: int): void       |  // Inserts a node at the end
| + deleteByValue(data: int): void     |  // Deletes a node by value
| + traverse(): void                   |  // Traverses the list
| + search(data: int): boolean         |  // Searches for a node by value
+---------------------+

        ^
        |
        |
+---------------------+
| CircularLinkedList  |
+---------------------+
| - head: Node        |  // Reference to the first node in the list
| - tail: Node        |  // Reference to the last node in the list
+---------------------+
| + insertAtBeginning(data: int): void |  // Inserts a node at the beginning
| + insertAtEnd(data: int): void       |  // Inserts a node at the end
| + deleteByValue(data: int): void     |  // Deletes a node by value
| + traverse(): void                   |  // Traverses the list
| + search(data: int): boolean         |  // Searches for a node by value
+---------------------+

+---------------------+
|        Node         |
+---------------------+
| - data: int         |  // Data stored in the node
| - next: Node        |  // Reference to the next node
| - prev: Node        |  // Reference to the previous node (only for DoublyLinkedList)
+---------------------+
```

### Explanation
- **LinkedList**: An abstract class or interface that defines common operations for all types of linked lists.
  - [`head`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A177%2C%22character%22%3A12%7D%7D%5D%2C%22b66f9332-0157-4b21-9c44-99a4094a0014%22%5D "Go to definition"): Reference to the first node in the list.
  - [`tail`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A179%2C%22character%22%3A12%7D%7D%5D%2C%22b66f9332-0157-4b21-9c44-99a4094a0014%22%5D "Go to definition"): Reference to the last node in the list (optional, used for optimization).
  - `insertAtBeginning(data: int)`: Inserts a node at the beginning of the list.
  - `insertAtEnd(data: int)`: Inserts a node at the end of the list.
  - `deleteByValue(data: int)`: Deletes a node by its value.
  - `traverse()`: Traverses the list and prints the elements.
  - `search(data: int)`: Searches for a node by its value.

- **SinglyLinkedList**: Extends `LinkedList` and implements a singly linked list.
  - Inherits all properties and methods from `LinkedList`.

- **DoublyLinkedList**: Extends `LinkedList` and implements a doubly linked list with an additional `prev` pointer in the [`Node`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A176%2C%22character%22%3A8%7D%7D%5D%2C%22b66f9332-0157-4b21-9c44-99a4094a0014%22%5D "Go to definition") class.
  - Inherits all properties and methods from `LinkedList`.
  - `prev`: Reference to the previous node (only for DoublyLinkedList).

- **CircularLinkedList**: Extends `LinkedList` and implements a circular linked list where the last node points back to the first node.
  - Inherits all properties and methods from `LinkedList`.

- **Node**: Represents a node in the linked list.
  - [`data`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A175%2C%22character%22%3A38%7D%7D%5D%2C%22b66f9332-0157-4b21-9c44-99a4094a0014%22%5D "Go to definition"): Data stored in the node.
  - [`next`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A181%2C%22character%22%3A20%7D%7D%5D%2C%22b66f9332-0157-4b21-9c44-99a4094a0014%22%5D "Go to definition"): Reference to the next node.
  - `prev`: Reference to the previous node (only for DoublyLinkedList).

### Explanation
- **LinkedList**: An abstract class or interface that defines common operations for all types of linked lists.
- **SinglyLinkedList**: Extends `LinkedList` and implements a singly linked list.
- **DoublyLinkedList**: Extends `LinkedList` and implements a doubly linked list with an additional `prev` pointer in the `Node` class.
- **CircularLinkedList**: Extends `LinkedList` and implements a circular linked list where the last node points back to the first node.
- **Node**: Represents a node in the linked list, containing [`data`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A226%2C%22character%22%3A24%7D%7D%5D%2C%22793c8e31-d64f-4dd1-9929-d1b8e16a64ad%22%5D "Go to definition"), [`next`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FLinked%20List%20in%20Java.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A229%2C%22character%22%3A30%7D%7D%5D%2C%22793c8e31-d64f-4dd1-9929-d1b8e16a64ad%22%5D "Go to definition"), and optionally `prev` for doubly linked lists.

This UML diagram provides a high-level overview of the different types of linked lists and their relationships.