# **📚 Iterator Pattern — Theory Summary**

### **1) Intent**

* Provide a way to **access elements sequentially** in a collection.
* Do so **without exposing** the collection’s internal structure.
* Support multiple traversal strategies.

---

### **2) Motivation**

* Collections store data in complex internal forms (trees, arrays, lists).
* Clients should not need to know how items are stored.
* External iterator simplifies traversal with a uniform interface.

---

### **3) Applicability**

* When clients need to traverse collections **uniformly**.
* When you want to support multiple traversal methods.
* When exposing internal data structures would break encapsulation.

---

### **4) Structure**

* **Iterator** → defines traversal operations like `next()` and `hasNext()`.
* **ConcreteIterator** → implements traversal logic.
* **Aggregate** → creates an iterator for its elements.

---

### **5) Participants**

* **Iterator**
* **ConcreteIterator**
* **Aggregate (Collection)**
* **Client**

---

### **6) Advantages**

* Uniform access across different collection types.
* Preserves encapsulation of internal representation.
* Allows multiple active traversals simultaneously.

---

### **7) Consequences**

* Extra classes (iterators) must be implemented.
* Iterators can become invalid if collection changes.
* Performance overhead if creating many iterators.
