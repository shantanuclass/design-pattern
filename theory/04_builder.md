Here is **Builder Pattern** across the 7 theory domains — short, crisp, maximum 3 points, no redundancy.

---

# **🏗️ Builder Pattern — Theory Summary**

### **1) Intent**

* Separate **construction logic** from the final object.
* Build complex objects **step-by-step**.
* Allow different representations using the same construction process.

---

### **2) Motivation**

* Constructors become messy when objects have many optional parts.
* Need flexibility to build various versions of the same object.
* Avoid telescoping constructors (too many parameter combinations).

---

### **3) Applicability**

* When object creation involves **many steps or configurations**.
* When you want different *variants* of an object from the same steps.
* When object construction should be **isolated** from the object itself.

---

### **4) Structure**

* **Builder** → declares building steps.
* **ConcreteBuilder** → implements step logic.
* **Director** → controls order of steps (optional).
* **Product** → final complex object.

---

### **5) Participants**

* **Builder / ConcreteBuilder**
* **Director** (optional but common)
* **Product**

---

### **6) Advantages**

* Handles complex object creation cleanly.
* Supports **different representations** from same process.
* Improves readability by separating construction steps.

---

### **7) Consequences**

* More classes required.
* Must execute steps in proper sequence.
* Director becomes unnecessary in very simple builds.

---

If you want, I’ll give **Prototype Pattern** next.
