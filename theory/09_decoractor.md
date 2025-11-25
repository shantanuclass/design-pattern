

# **🎁 Decorator Pattern — Theory Summary**

### **1) Intent**

* Add responsibilities to objects **dynamically**.
* Wrap objects to extend behavior **without modifying** their class.
* Support flexible, layered feature addition.

---

### **2) Motivation**

* Inheritance becomes impractical for many feature combinations.
* Need to attach optional features at runtime (e.g., pizza toppings, UI styles).
* Avoid subclass explosion.

---

### **3) Applicability**

* When you want to **add features at runtime**.
* When extension by inheritance is not feasible.
* When different combinations of behaviors must be supported.

---

### **4) Structure**

* **Component** → base interface.
* **ConcreteComponent** → original object.
* **Decorator** → wraps component and forwards calls.
* **ConcreteDecorator** → adds extra behavior.

---

### **5) Participants**

* **Component**
* **ConcreteComponent**
* **Decorator**
* **ConcreteDecorator**
* **Client**

---

### **6) Advantages**

* Flexible runtime behavior extension.
* Avoids large subclass hierarchies.
* Supports many combinations via chained decorators.

---

### **7) Consequences**

* Too many small wrapper objects.
* Debugging becomes harder due to call stacking.
* Order of decorators may affect behavior.

