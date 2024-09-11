# Java Collections Framework

The Java Collections Framework provides a set of interfaces and classes to handle collections of objects. Below are the primary collection types, their fields, methods, and Java code examples.

## 1. Collection Interface

### Description
The `Collection` interface is the root of the collection hierarchy. It represents a group of objects known as elements.

### Fields
- None (as it is an interface)

### Methods
- `boolean add(E e)`: Adds an element to the collection.
- `boolean remove(Object o)`: Removes a single instance of the specified element from the collection.
- `boolean contains(Object o)`: Returns `true` if the collection contains the specified element.
- `int size()`: Returns the number of elements in the collection.
- `void clear()`: Removes all elements from the collection.
- `Iterator<E> iterator()`: Returns an iterator over the elements in the collection.

### Java Code Example
```java
Collection<String> collection = new ArrayList<>();
collection.add("Element1");
collection.add("Element2");
System.out.println("Size: " + collection.size());
System.out.println("Contains 'Element1': " + collection.contains("Element1"));
collection.remove("Element1");
collection.clear();
```

## 2. List Interface

### Description
The `List` interface extends `Collection` and represents an ordered collection (also known as a sequence).

### Fields
- None (as it is an interface)

### Methods
- `E get(int index)`: Returns the element at the specified position in the list.
- `E set(int index, E element)`: Replaces the element at the specified position in the list with the specified element.
- `void add(int index, E element)`: Inserts the specified element at the specified position in the list.
- `E remove(int index)`: Removes the element at the specified position in the list.
- `int indexOf(Object o)`: Returns the index of the first occurrence of the specified element in the list.
- `int lastIndexOf(Object o)`: Returns the index of the last occurrence of the specified element in the list.
- `ListIterator<E> listIterator()`: Returns a list iterator over the elements in the list.

### Java Code Example
```java
List<String> list = new ArrayList<>();
list.add("Element1");
list.add("Element2");
list.add(1, "Element3");
System.out.println("Element at index 1: " + list.get(1));
list.set(1, "Element4");
list.remove(0);
System.out.println("Index of 'Element4': " + list.indexOf("Element4"));
```

## 3. Set Interface

### Description
The `Set` interface extends `Collection` and represents a collection that does not allow duplicate elements.

### Fields
- None (as it is an interface)

### Methods
- Inherits all methods from `Collection`.

### Java Code Example
```java
Set<String> set = new HashSet<>();
set.add("Element1");
set.add("Element2");
set.add("Element1"); // Duplicate, will not be added
System.out.println("Size: " + set.size());
System.out.println("Contains 'Element1': " + set.contains("Element1"));
set.remove("Element1");
set.clear();
```

## 4. Queue Interface

### Description
The `Queue` interface extends `Collection` and represents a collection designed for holding elements prior to processing.

### Fields
- None (as it is an interface)

### Methods
- `boolean offer(E e)`: Inserts the specified element into the queue.
- `E poll()`: Retrieves and removes the head of the queue, or returns `null` if the queue is empty.
- `E peek()`: Retrieves, but does not remove, the head of the queue, or returns `null` if the queue is empty.
- Inherits all methods from `Collection`.

### Java Code Example
```java
Queue<String> queue = new LinkedList<>();
queue.offer("Element1");
queue.offer("Element2");
System.out.println("Head of queue: " + queue.peek());
System.out.println("Removed from queue: " + queue.poll());
System.out.println("Head of queue: " + queue.peek());
```

## 5. Deque Interface

### Description
The `Deque` interface extends `Queue` and represents a double-ended queue that allows elements to be added or removed from both ends.

### Fields
- None (as it is an interface)

### Methods
- `void addFirst(E e)`: Inserts the specified element at the front of the deque.
- `void addLast(E e)`: Inserts the specified element at the end of the deque.
- `E removeFirst()`: Retrieves and removes the first element of the deque.
- `E removeLast()`: Retrieves and removes the last element of the deque.
- `E getFirst()`: Retrieves, but does not remove, the first element of the deque.
- `E getLast()`: Retrieves, but does not remove, the last element of the deque.
- `boolean offerFirst(E e)`: Inserts the specified element at the front of the deque.
- `boolean offerLast(E e)`: Inserts the specified element at the end of the deque.
- `E pollFirst()`: Retrieves and removes the first element of the deque, or returns `null` if the deque is empty.
- `E pollLast()`: Retrieves and removes the last element of the deque, or returns `null` if the deque is empty.
- `E peekFirst()`: Retrieves, but does not remove, the first element of the deque, or returns `null` if the deque is empty.
- `E peekLast()`: Retrieves, but does not remove, the last element of the deque, or returns `null` if the deque is empty.
- Inherits all methods from `Queue`.

### Java Code Example
```java
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("Element1");
deque.addLast("Element2");
System.out.println("First element: " + deque.getFirst());
System.out.println("Last element: " + deque.getLast());
deque.removeFirst();
deque.removeLast();
```

## 6. Map Interface

### Description
The [`Map`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUML%20Diagrams.txt%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A565%2C%22character%22%3A8%7D%7D%5D%2C%22ac448260-e1eb-41dd-b6b5-dd7c67e48ab5%22%5D "Go to definition") interface represents a collection of key-value pairs, where each key is unique.

### Fields
- None (as it is an interface)

### Methods
- `V put(K key, V value)`: Associates the specified value with the specified key in the map.
- `V get(Object key)`: Returns the value to which the specified key is mapped, or `null` if the map contains no mapping for the key.
- `V remove(Object key)`: Removes the mapping for a key from the map if it is present.
- `boolean containsKey(Object key)`: Returns `true` if the map contains a mapping for the specified key.
- `boolean containsValue(Object value)`: Returns `true` if the map maps one or more keys to the specified value.
- `int size()`: Returns the number of key-value mappings in the map.
- `void clear()`: Removes all mappings from the map.
- `Set<K> keySet()`: Returns a set view of the keys contained in the map.
- `Collection<V> values()`: Returns a collection view of the values contained in the map.
- `Set<Map.Entry<K, V>> entrySet()`: Returns a set view of the mappings contained in the map.

### Java Code Example
```java
Map<String, Integer> map = new HashMap<>();
map.put("Key1", 1);
map.put("Key2", 2);
System.out.println("Value for 'Key1': " + map.get("Key1"));
System.out.println("Contains 'Key2': " + map.containsKey("Key2"));
map.remove("Key1");
map.clear();
```

## 7. HashMap Class

### Description
The `HashMap` class implements the [`Map`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUML%20Diagrams.txt%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A565%2C%22character%22%3A8%7D%7D%5D%2C%22ac448260-e1eb-41dd-b6b5-dd7c67e48ab5%22%5D "Go to definition") interface and uses a hash table to store key-value pairs.

### Fields
- `transient Node<K,V>[] table`: The table array where the hash table is stored.
- `transient int size`: The number of key-value mappings in the map.

### Methods
- Inherits all methods from [`Map`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUML%20Diagrams.txt%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A565%2C%22character%22%3A8%7D%7D%5D%2C%22ac448260-e1eb-41dd-b6b5-dd7c67e48ab5%22%5D "Go to definition").

### Java Code Example
```java
HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("Key1", 1);
hashMap.put("Key2", 2);
System.out.println("Value for 'Key1': " + hashMap.get("Key1"));
System.out.println("Contains 'Key2': " + hashMap.containsKey("Key2"));
hashMap.remove("Key1");
hashMap.clear();


``

`

## 8. LinkedHashMap Class

### Description
The `LinkedHashMap` class extends `HashMap` and maintains a doubly-linked list running through all of its entries to preserve the insertion order.

### Fields
- `transient LinkedHashMap.Entry<K,V> header`: The head of the doubly-linked list.
- `transient LinkedHashMap.Entry<K,V> tail`: The tail of the doubly-linked list.
- `transient int size`: The number of key-value mappings in the map.

### Methods
- Inherits all methods from `HashMap`.

### Java Code Example
```java
LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("Key1", 1);
linkedHashMap.put("Key2", 2);
System.out.println("Value for 'Key1': " + linkedHashMap.get("Key1"));
System.out.println("Contains 'Key2': " + linkedHashMap.containsKey("Key2"));
linkedHashMap.remove("Key1");
linkedHashMap.clear();
```

## 9. TreeMap Class

### Description
The [`TreeMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUML%20Diagrams.txt%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A546%2C%22character%22%3A6%7D%7D%5D%2C%22ac448260-e1eb-41dd-b6b5-dd7c67e48ab5%22%5D "Go to definition") class implements the [`Map`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUML%20Diagrams.txt%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A565%2C%22character%22%3A8%7D%7D%5D%2C%22ac448260-e1eb-41dd-b6b5-dd7c67e48ab5%22%5D "Go to definition") interface and uses a red-black tree to store key-value pairs in sorted order.

### Fields
- `transient Entry<K,V> root`: The root of the red-black tree.
- `transient int size`: The number of key-value mappings in the map.

### Methods
- Inherits all methods from [`Map`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FC%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUML%20Diagrams.txt%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A565%2C%22character%22%3A8%7D%7D%5D%2C%22ac448260-e1eb-41dd-b6b5-dd7c67e48ab5%22%5D "Go to definition").

### Java Code Example
```java
TreeMap<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Key1", 1);
treeMap.put("Key2", 2);
System.out.println("Value for 'Key1': " + treeMap.get("Key1"));
System.out.println("Contains 'Key2': " + treeMap.containsKey("Key2"));
treeMap.remove("Key1");
treeMap.clear();
```

These descriptions and examples provide a comprehensive overview of the primary collections in the Java Collections Framework. Each collection type has specific implementations optimized for different use cases.