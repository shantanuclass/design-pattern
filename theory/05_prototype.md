

# **🧸 Prototype Pattern — Theory Summary**

### **1) Intent**

* Create new objects by **cloning existing ones**.
* Avoid costly or complex instantiation.
* Allow copying without depending on concrete classes.

---

### **2) Motivation**

* Creating objects from scratch is expensive (heavy initialization).
* System needs many similar objects with minor differences.
* Dynamic object creation when exact classes aren't known beforehand.

---

### **3) Applicability**

* When object creation is **costly**, and duplicates are needed.
* When objects must be created **at runtime** based on existing ones.
* When system should avoid creating classes for every variation.

---

### **4) Structure**

* **Prototype** → interface with clone() method.
* **ConcretePrototype** → implements cloning logic.
* **Client** → requests clone instead of new.

---

### **5) Participants**

* **Prototype** (declares clone)
* **ConcretePrototype** (implements clone)
* **Client** (creates objects by cloning)

---

### **6) Advantages**

* Faster creation (copy vs build-from-zero).
* Reduces subclassing for object variants.
* Runtime flexibility — objects cloned dynamically.

---

### **7) Consequences**

* Deep vs shallow copy complexity.
* Cloning may be tricky for objects with complex references.
* Hidden coupling if internal state is not properly copied.


