### UML Diagram for [`Collection`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A424%2C%22character%22%3A4%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A2%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|   <<interface>>   |
|    Collection     |
+-------------------+
| Methods:          |
| + boolean add(E e)                // Adds an element to the collection. |
| + boolean remove(Object o)        // Removes a single instance of the specified element. |
| + boolean contains(Object o)      // Returns true if the collection contains the specified element. |
| + int size()                      // Returns the number of elements in the collection. |
| + void clear()                    // Removes all elements from the collection. |
| + Iterator<E> iterator()          // Returns an iterator over the elements in the collection. |
+-------------------+
```

### UML Diagram for [`List`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A18%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|   <<interface>>   |
|       List        |
+-------------------+
| Methods:          |
| + E get(int index)                // Returns the element at the specified position in the list. |
| + E set(int index, E element)     // Replaces the element at the specified position in the list. |
| + void add(int index, E element)  // Inserts the specified element at the specified position in the list. |
| + E remove(int index)             // Removes the element at the specified position in the list. |
| + int indexOf(Object o)           // Returns the index of the first occurrence of the specified element. |
| + int lastIndexOf(Object o)       // Returns the index of the last occurrence of the specified element. |
| + ListIterator<E> listIterator()  // Returns a list iterator over the elements in the list. |
+-------------------+
          ^
          |
+-------------------+
|   <<interface>>   |
|    Collection     |
+-------------------+
```

### UML Diagram for [`Set`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A423%2C%22character%22%3A4%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A41%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|   <<interface>>   |
|       Set         |
+-------------------+
| Methods:          |
| + boolean add(E e)                // Adds an element to the set. |
| + boolean remove(Object o)        // Removes a single instance of the specified element. |
| + boolean contains(Object o)      // Returns true if the set contains the specified element. |
| + int size()                      // Returns the number of elements in the set. |
| + void clear()                    // Removes all elements from the set. |
| + Iterator<E> iterator()          // Returns an iterator over the elements in the set. |
+-------------------+
          ^
          |
+-------------------+
|   <<interface>>   |
|    Collection     |
+-------------------+
```

### UML Diagram for [`Queue`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A63%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|   <<interface>>   |
|      Queue        |
+-------------------+
| Methods:          |
| + boolean offer(E e)              // Inserts the specified element into the queue. |
| + E poll()                        // Retrieves and removes the head of the queue. |
| + E peek()                        // Retrieves, but does not remove, the head of the queue. |
| + boolean add(E e)                // Inserts the specified element into the queue. |
| + E remove()                      // Retrieves and removes the head of the queue. |
| + E element()                     // Retrieves, but does not remove, the head of the queue. |
+-------------------+
          ^
          |
+-------------------+
|   <<interface>>   |
|    Collection     |
+-------------------+
```

### UML Diagram for [`Deque`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A85%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|   <<interface>>   |
|      Deque        |
+-------------------+
| Methods:          |
| + void addFirst(E e)              // Inserts the specified element at the front of the deque. |
| + void addLast(E e)               // Inserts the specified element at the end of the deque. |
| + E removeFirst()                 // Retrieves and removes the first element of the deque. |
| + E removeLast()                  // Retrieves and removes the last element of the deque. |
| + E getFirst()                    // Retrieves, but does not remove, the first element of the deque. |
| + E getLast()                     // Retrieves, but does not remove, the last element of the deque. |
| + boolean offerFirst(E e)         // Inserts the specified element at the front of the deque. |
| + boolean offerLast(E e)          // Inserts the specified element at the end of the deque. |
| + E pollFirst()                   // Retrieves and removes the first element of the deque. |
| + E pollLast()                    // Retrieves and removes the last element of the deque. |
| + E peekFirst()                   // Retrieves, but does not remove, the first element of the deque. |
| + E peekLast()                    // Retrieves, but does not remove, the last element of the deque. |
+-------------------+
          ^
          |
+-------------------+
|      Queue        |
+-------------------+
          ^
          |
+-------------------+
|   <<interface>>   |
|    Collection     |
+-------------------+
```

### UML Diagram for [`Map`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A425%2C%22character%22%3A8%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A118%2C%22character%22%3A22%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|   <<interface>>   |
|       Map         |
+-------------------+
| Methods:          |
| + V put(K key, V value)           // Associates the specified value with the specified key in the map. |
| + V get(Object key)               // Returns the value to which the specified key is mapped. |
| + V remove(Object key)            // Removes the mapping for a key from the map. |
| + boolean containsKey(Object key) // Returns true if the map contains a mapping for the specified key. |
| + boolean containsValue(Object value) // Returns true if the map maps one or more keys to the specified value. |
| + int size()                      // Returns the number of key-value mappings in the map. |
| + void clear()                    // Removes all mappings from the map. |
| + Set<K> keySet()                 // Returns a set view of the keys contained in the map. |
| + Collection<V> values()          // Returns a collection view of the values contained in the map. |
| + Set<Map.Entry<K, V>> entrySet() // Returns a set view of the mappings contained in the map. |
+-------------------+
```

### UML Diagram for [`HashMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A138%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|     HashMap       |
+-------------------+
| Fields:           |
| - transient Node<K,V>[] table     // The table array where the hash table is stored. |
| - transient int size              // The number of key-value mappings in the map. |
+-------------------+
| Methods:          |
| + V put(K key, V value)           // Associates the specified value with the specified key in the map. |
| + V get(Object key)               // Returns the value to which the specified key is mapped. |
| + V remove(Object key)            // Removes the mapping for a key from the map. |
| + boolean containsKey(Object key) // Returns true if the map contains a mapping for the specified key. |
| + boolean containsValue(Object value) // Returns true if the map maps one or more keys to the specified value. |
| + int size()                      // Returns the number of key-value mappings in the map. |
| + void clear()                    // Removes all mappings from the map. |
| + Set<K> keySet()                 // Returns a set view of the keys contained in the map. |
| + Collection<V> values()          // Returns a collection view of the values contained in the map. |
| + Set<Map.Entry<K, V>> entrySet() // Returns a set view of the mappings contained in the map. |
+-------------------+
          ^
          |
+-------------------+
|       Map         |
+-------------------+
```

### UML Diagram for [`LinkedHashMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A166%2C%22character%22%3A21%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|  LinkedHashMap    |
+-------------------+
| Fields:           |
| - transient LinkedHashMap.Entry<K,V> header // The head of the doubly-linked list. |
| - transient LinkedHashMap.Entry<K,V> tail   // The tail of the doubly-linked list. |
| - transient int size                        // The number of key-value mappings in the map. |
+-------------------+
| Methods:          |
| + V put(K key, V value)           // Associates the specified value with the specified key in the map. |
| + V get(Object key)               // Returns the value to which the specified key is mapped. |
| + V remove(Object key)            // Removes the mapping for a key from the map. |
| + boolean containsKey(Object key) // Returns true if the map contains a mapping for the specified key. |
| + boolean containsValue(Object value) // Returns true if the map maps one or more keys to the specified value. |
| + int size()                      // Returns the number of key-value mappings in the map. |
| + void clear()                    // Removes all mappings from the map. |
| + Set<K> keySet()                 // Returns a set view of the keys contained in the map. |
| + Collection<V> values()          // Returns a collection view of the values contained in the map. |
| + Set<Map.Entry<K, V>> entrySet() // Returns a set view of the mappings contained in the map. |
+-------------------+
          ^
          |
+-------------------+
|     HashMap       |
+-------------------+
          ^
          |
+-------------------+
|       Map         |
+-------------------+
```

### UML Diagram for [`TreeMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FOneDriveDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FDocs%2FUMLwithDescrip.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A200%2C%22character%22%3A22%7D%7D%5D%2C%22e4d44679-3204-4b3f-8f90-bd39599869de%22%5D "Go to definition")
```plaintext
+-------------------+
|     TreeMap       |
+-------------------+
| Fields:           |
| - transient Entry<K,V> root       // The root of the red-black tree. |
| - transient int size              // The number of key-value mappings in the map. |
+-------------------+
| Methods:          |
| + V put(K key, V value)           // Associates the specified value with the specified key in the map. |
| + V get(Object key)               // Returns the value to which the specified key is mapped. |
| + V remove(Object key)            // Removes the mapping for a key from the map. |
| + boolean containsKey(Object key) // Returns true if the map contains a mapping for the specified key. |
| + boolean containsValue(Object value) // Returns true if the map maps one or more keys to the specified value. |
| + int size()                      // Returns the number of key-value mappings in the map. |
| + void clear()                    // Removes all mappings from the map. |
| + Set<K> keySet()                 // Returns a set view of the keys contained in the map. |
| + Collection<V> values()          // Returns a collection view of the values contained in the map. |
| + Set<Map.Entry<K, V>> entrySet() // Returns a set view of the mappings contained in the map. |
+-------------------+
          ^
          |
+-------------------+
|       Map         |
+-------------------+
```