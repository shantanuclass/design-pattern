
# ✅ 1. **Abstract Factory vs Builder vs Prototype**

*(Asked as “Discriminate the creational patterns…”)*

| Point                 | Abstract Factory                            | Builder                                 | Prototype                                  |
| --------------------- | ------------------------------------------- | --------------------------------------- | ------------------------------------------ |
| **1. Purpose**        | Create families of related objects          | Construct complex objects step-by-step  | Clone existing objects                     |
| **2. Focus**          | Product *families*                          | Construction *process*                  | Object *copying*                           |
| **3. Client Control** | Client chooses factory, not product details | Full control over construction steps    | Client only clones existing prototype      |
| **4. When to Use**    | Need consistent combinations of objects     | Complex object with many optional parts | Object creation is costly, want duplicates |
| **5. Return Type**    | Often returns different related objects     | Always returns one complex object       | Returns object of same type as original    |

---

# ✅ 2. **Composite vs Decorator**

| Point                     | Composite                                  | Decorator                                   |
| ------------------------- | ------------------------------------------ | ------------------------------------------- |
| **1. Purpose**            | Treat individual + group objects uniformly | Add responsibilities dynamically            |
| **2. Structure**          | Tree structure (whole–part)                | Wrapper structure (layered wrappers)        |
| **3. Component Role**     | Nodes may contain children                 | Wrapper contains only one component         |
| **4. Use Case**           | Hierarchies: folders/files, UI trees       | Features added at runtime: toppings, styles |
| **5. Effect on Behavior** | Composition builds structural hierarchy    | Behavior extended without modifying class   |

---

# ✅ 3. **Class Adapter vs Object Adapter**

| Point                   | Class Adapter                               | Object Adapter                               |
| ----------------------- | ------------------------------------------- | -------------------------------------------- |
| **1. Implementation**   | Uses *multiple inheritance*                 | Uses *composition*                           |
| **2. Flexibility**      | Less flexible—ties to one Adaptee           | More flexible—can wrap multiple Adaptees     |
| **3. Reuse**            | Cannot adapt subclasses                     | Can adapt subclasses via composition         |
| **4. Override Ability** | Can override Adaptee’s behavior             | Must rely on delegation                      |
| **5. Language Support** | Works only in languages with MI (e.g., C++) | Works in all OO languages (Java recommended) |

---

# ✅ 4. **Facade vs Mediator**

| Point                     | Facade                                                | Mediator                                              |
| ------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| **1. Purpose**            | Simplifies access to a subsystem                      | Manages communication between many objects            |
| **2. Object Interaction** | Facade doesn’t control object-to-object communication | Mediator centralizes and controls interactions        |
| **3. Direction of Use**   | Client → Facade → Subsystems                          | Colleagues ↔ Mediator ↔ Colleagues                    |
| **4. Focus**              | Reduce complexity for the client                      | Reduce coupling among interacting objects             |
| **5. Change Impact**      | Adding new subsystem may need Facade update           | Adding new colleague usually requires Mediator update |

---

# ✅ 5. **Observer vs Mediator**

| Point               | Observer                                   | Mediator                                   |
| ------------------- | ------------------------------------------ | ------------------------------------------ |
| **1. Purpose**      | Notify many dependents of state changes    | Coordinate communication among objects     |
| **2. Relationship** | One-to-many dependency                     | Many-to-many interactions simplified       |
| **3. Trigger**      | State change triggers notifications        | Events/messages trigger mediator logic     |
| **4. Coupling**     | Loose coupling between subject & observers | Removes direct coupling between colleagues |
| **5. Flow**         | Subject → Observers                        | Colleagues ↔ Mediator ↔ Colleagues         |

---

# ✅ 6. **State vs Strategy**

| Point                      | State                                       | Strategy                                   |
| -------------------------- | ------------------------------------------- | ------------------------------------------ |
| **1. Purpose**             | Change behavior when internal state changes | Choose behavior algorithm at runtime       |
| **2. Who Controls Change** | Context changes state internally            | Client selects/changes strategy            |
| **3. Object Identity**     | Appears to change its “class” at runtime    | Object behavior changes via algorithm swap |
| **4. Transitions**         | States often transition to each other       | Strategies do **not** transition           |
| **5. Use Case**            | Traffic light, workflow steps               | Sorting, routing, pricing algorithms       |

