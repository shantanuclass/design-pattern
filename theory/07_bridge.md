# **🌉 Bridge Pattern — Theory Summary**

### **1) Intent**

* Separate **abstraction** from its **implementation**.
* Allow both to vary **independently**.
* Avoid permanent binding between high-level logic and low-level platform.

---

### **2) Motivation**

* Inheritance causes class explosion when combining dimensions (e.g., Shape × Color).
* Need to extend abstraction and implementation **without affecting each other**.
* Reduce coupling between what an object does and how it does it.

---

### **3) Applicability**

* When abstraction and implementation must evolve separately.
* When a class has multiple independent variation axes.
* When avoiding deep inheritance hierarchies.

---

### **4) Structure**

* **Abstraction** → defines high-level operations.
* **RefinedAbstraction** → extends Abstraction.
* **Implementor** → interface for low-level operations.
* **ConcreteImplementor** → platform-specific implementation.

---

### **5) Participants**

* **Abstraction**
* **RefinedAbstraction**
* **Implementor**
* **ConcreteImplementor**
* **Client**

---

### **6) Advantages**

* Decouples abstraction from implementation.
* Prevents large, rigid inheritance trees.
* Enables independent extension of both hierarchies.

---

### **7) Consequences**

* More classes due to two parallel hierarchies.
* Indirection makes calls slightly more complex.
* Must design abstraction boundaries carefully.

