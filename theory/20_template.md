# **📜 Template Method Pattern — Theory Summary**

### **1) Intent**

* Define the **skeleton of an algorithm** in a method.
* Let subclasses override **specific steps** without changing the algorithm’s structure.
* Promote code reuse by sharing the overall process.

---

### **2) Motivation**

* Many algorithms share common steps but differ in a few parts.
* Avoid duplicating the entire algorithm across subclasses.
* Ensure some steps are fixed while others are customizable.

---

### **3) Applicability**

* When subclasses must vary **part of an algorithm**.
* When the algorithm has **invariant steps** that should remain unchanged.
* When wanting to enforce a consistent process across variations.

---

### **4) Structure**

* **AbstractClass** → defines template method + fixed steps; declares abstract steps.
* **ConcreteClass** → implements variable (hook or abstract) steps.
* **Template Method** → final method calling steps in defined order.

---

### **5) Participants**

* **AbstractClass**
* **ConcreteClass**
* **Client**

---

### **6) Advantages**

* Promotes code reuse by keeping algorithm structure centralized.
* Subclasses override only what changes.
* Ensures consistent execution order.

---

### **7) Consequences**

* More classes required (one per variation).
* Hard to change overall algorithm structure later.
* Subclassing can lead to tight coupling to the abstract class.
