# **🏢 Abstract Factory Pattern — Theory Summary**

### **1) Intent**

* Provide an interface to create **families of related objects**.
* Ensure products created together are **compatible**.
* Avoid mixing objects from different product families.

---

### **2) Motivation**

* Systems need **consistent product sets** (e.g., matching UI themes).
* Avoid hardcoding object families throughout the code.
* Switching product families (e.g., Windows → Mac UI) should require **no code change** in client.

---

### **3) Applicability**

* When products are designed to **work together**.
* When system must support **multiple families** of related objects.
* When you want to **decouple client** from concrete product classes.

---

### **4) Structure**

* **AbstractFactory** → declares methods for each abstract product.
* **ConcreteFactory** → creates concrete product families.
* **AbstractProduct / ConcreteProduct** → product hierarchy.

---

### **5) Participants**

* **AbstractFactory**
* **ConcreteFactory**
* **AbstractProduct**
* **ConcreteProduct**
* **Client** → uses factory to create product families.

---

### **6) Advantages**

* Ensures **compatible product sets**.
* Supports easy **family switching**.
* Promotes strong **encapsulation** of object creation.

---

### **7) Consequences**

* Difficult to introduce **new product types**.
* Increases number of classes.
* Rigid if product family definitions change frequently.

