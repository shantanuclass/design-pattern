# **🏭 Factory Method Pattern — Theory Summary**

### **1) Intent**

* Define a method to **create objects** without specifying the exact class.
* Let subclasses decide **which object** to instantiate.
* Promote loose coupling in object creation.

---

### **2) Motivation**

* Direct `new` causes tight coupling to concrete classes.
* Need flexibility to choose object type at runtime.
* Frameworks often need extensible object creation logic.

---

### **3) Applicability**

* When a class **cannot anticipate** which class to create.
* When subclasses should **override object creation**.
* For replacing large `if-else / switch` blocks used to pick concrete types.

---

### **4) Structure**

* **Creator** class declaring factory method.
* **ConcreteCreators** override the method to create specific products.
* **Product / ConcreteProduct** hierarchy for return types.

---

### **5) Participants**

* **Product** → interface/base type.
* **ConcreteProduct** → actual objects created.
* **Creator / ConcreteCreator** → defines & overrides factory method.

---

### **6) Advantages**

* Removes tight coupling to concrete classes.
* Supports adding new product types easily.
* Localizes creation logic in subclasses.

---

### **7) Consequences**

* More classes due to subclassing.
* Complex when many product types exist.
* Clients must understand hierarchy to choose correct creator.


If you want, I’ll continue with **Abstract Factory Pattern**.
