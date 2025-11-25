# **🌳 Composite Pattern — Theory Summary**

### **1) Intent**

* Treat **individual objects** and **composed groups** uniformly.
* Represent part–whole hierarchies as tree structures.
* Allow clients to ignore differences between leaf and composite.

---

### **2) Motivation**

* Systems like folders/files need nested structures.
* Clients should perform operations without checking object type.
* Avoid complex branching logic (`if leaf else composite`).

---

### **3) Applicability**

* When objects form a natural **hierarchical tree**.
* When clients must work with **single + group objects** identically.
* When adding new element types should be easy.

---

### **4) Structure**

* **Component** → common interface.
* **Leaf** → indivisible object.
* **Composite** → holds children, implements operations recursively.
* **Client** → uses Component uniformly.

---

### **5) Participants**

* **Component**
* **Leaf**
* **Composite**
* **Client**

---

### **6) Advantages**

* Simplifies client code (uniform treatment).
* Easy to add new leaf/composite types.
* Supports recursive operations naturally.

---

### **7) Consequences**

* Hard to enforce restrictions on valid child types.
* Can make design too general (weak type safety).
* Debugging recursive calls can be complex.

