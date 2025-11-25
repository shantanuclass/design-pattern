# **🗼 Mediator Pattern — Theory Summary**

### **1) Intent**

* Centralize communication between objects.
* Prevent objects (colleagues) from referring to each other directly.
* Reduce complex many-to-many interactions.

---

### **2) Motivation**

* Without a mediator, objects talk to each other chaotically → high coupling.
* Need a **single controller** to coordinate actions (e.g., air traffic control).
* Simplify communication logic by putting it in one place.

---

### **3) Applicability**

* When object interactions are complex and interdependent.
* When you want to avoid direct references between colleague objects.
* When introducing a **central communication authority** makes system cleaner.

---

### **4) Structure**

* **Mediator** → defines communication interface.
* **ConcreteMediator** → coordinates colleague interactions.
* **Colleagues** → communicate only through mediator.

---

### **5) Participants**

* **Mediator**
* **ConcreteMediator**
* **Colleague (1…n)**
* **Client** (creates mediator & colleagues)

---

### **6) Advantages**

* Reduces coupling between colleague objects.
* Centralizes communication logic.
* Easy to change interaction rules by editing mediator only.

---

### **7) Consequences**

* Mediator may become too complex (“god object”).
* Harder to reuse colleagues without a mediator.
* More indirection can reduce performance in heavy systems.
