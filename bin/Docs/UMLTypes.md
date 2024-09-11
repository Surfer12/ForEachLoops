UML stands for Unified Modeling Language. It is a standardized modeling language used to visualize, specify, construct, and document the artifacts of a software system. UML provides a set of graphic notation techniques to create visual models of object-oriented software-intensive systems.

### Key Components of UML:
1. **Class Diagrams**: Show the static structure of the system, including classes, attributes, operations, and relationships.
2. **Use Case Diagrams**: Represent the functional requirements of the system, showing actors and their interactions with use cases.
3. **Sequence Diagrams**: Illustrate how objects interact in a particular sequence of time.
4. **Activity Diagrams**: Depict the flow of control or object flow with emphasis on the sequence and conditions of the flow.
5. **State Diagrams**: Describe the states of an object and transitions between those states.
6. **Component Diagrams**: Show the organization and dependencies among a set of components.
7. **Deployment Diagrams**: Model the physical deployment of artifacts on nodes.

### Example of a Simple UML Class Diagram:
```plaintext
+---------------------+
|      Person         |
+---------------------+
| - name: String      |
| - age: int          |
+---------------------+
| + getName(): String |
| + getAge(): int     |
+---------------------+
```

### Example of a Simple UML Use Case Diagram:
```plaintext
+---------------------+
|      System         |
| +-----------------+ |
| |   Use Case 1    | |
| |   Use Case 2    | |
| +-----------------+ |
+---------------------+
      ^       ^
      |       |
+-----+       +-----+
| Actor 1     Actor 2|
+---------------------+
```

UML is widely used in software engineering to help developers and stakeholders understand and communicate the design and functionality of a system.