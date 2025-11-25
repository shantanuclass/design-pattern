# **🧭 Strategy Pattern — Theory Summary**

### **1) Intent**

* Define a family of algorithms and make them **interchangeable**.
* Allow algorithm selection **at runtime**.
* Separate algorithm from the context that uses it.

---

### **2) Motivation**

* Avoid large conditional blocks choosing algorithms.
* Need to switch behaviors easily (e.g., driving/walking/biking routes).
* Make algorithms independent and reusable.

---

### **3) Applicability**

* When multiple algorithms perform similar tasks.
* When behavior must change **dynamically**.
* When you want to isolate complex algorithms from context logic.

---

### **4) Structure**

* **Strategy** → interface for algorithm.
* **ConcreteStrategy** → different algorithm implementations.
* **Context** → holds a Strategy and delegates work to it.

---

### **5) Participants**

* **Strategy**
* **ConcreteStrategy (1…n)**
* **Context**

---

### **6) Advantages**

* Eliminates conditional branching for algorithm selection.
* Easy to add new algorithms without modifying existing code.
* Promotes reusable, clean algorithm classes.

---

### **7) Consequences**

* More objects created (one per strategy).
* Client must understand available strategies.
* Switching strategy frequently may add slight overhead.
