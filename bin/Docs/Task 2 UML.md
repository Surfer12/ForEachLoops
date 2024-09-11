Task 2 UML 
### UML Flowchart for Task2.java

Below is a UML flowchart representing the flow of the program in [`Task2.java`](command:_github.copilot.openRelativePath?%5B%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "c:\Users\18057\OneDrive\Desktop\Cuesta\Cuesta Fall 2024\Cis 232\InClassSept10\src\Main\Task2.java").

```plaintext
+-------------------------------+
|           Start               |
+-------------------------------+
              |
              v
+-------------------------------+
| Initialize String word = "hello" |
+-------------------------------+
              |
              v
+---------------------------------------------+
| Initialize Map<Character, Integer> frequencyMap |
| = new HashMap<>()                           |
+---------------------------------------------+
              |
              v
+---------------------------------------------+
| For each character c in word.toCharArray()  |
|   - frequencyMap.put(c,                     |
|     frequencyMap.getOrDefault(c, 0) + 1)    |
+---------------------------------------------+
              |
              v
+---------------------------------------------+
| For each Map.Entry<Character, Integer> entry|
| in frequencyMap.entrySet()                  |
|   - Print entry.getKey() + " : " +          |
|     entry.getValue()                        |
+---------------------------------------------+
              |
              v
+-------------------------------+
|             End               |
+-------------------------------+
```

### Explanation

1. **Start**: The program begins execution.
2. **Initialize String**: The string [`word`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A17%2C%22character%22%3A15%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A3%2C%22character%22%3A8%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition") is initialized with the value `"hello"`.
3. **Initialize Map**: A [`HashMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A6%2C%22character%22%3A17%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A6%2C%22character%22%3A17%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition") named [`frequencyMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A18%2C%22character%22%3A32%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition") is created to store the frequency of each character.
4. **Populate Frequency Map**:
   - The program iterates over each character [`c`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A21%2C%22character%22%3A18%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition") in the string [`word`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A17%2C%22character%22%3A15%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A3%2C%22character%22%3A8%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition").
   - For each character, it updates the frequency map using [`frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1)`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A18%2C%22character%22%3A32%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition").
5. **Print Frequency**:
   - The program iterates over each entry in the [`frequencyMap`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A18%2C%22character%22%3A32%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition") using [`entrySet()`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2Fc%3A%2FUsers%2F18057%2FOneDrive%2FDesktop%2FCuesta%2FCuesta%20Fall%202024%2FCis%20232%2FInClassSept10%2Fsrc%2FMain%2FTask2.java%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A26%2C%22character%22%3A64%7D%7D%5D%2C%22d0eb274c-809f-4470-b94e-03025f50333d%22%5D "Go to definition").
   - For each entry, it prints the character (key) and its frequency (value).
6. **End**: The program ends execution.

This flowchart provides a visual representation of the steps involved in the program, from initialization to populating the frequency map and printing the results.