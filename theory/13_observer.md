
# **👥 Observer Pattern — Theory Summary**

### **1) Intent**

* Define a **one-to-many** dependency between objects.
* Automatically notify dependents when subject changes.
* Keep observers **in sync** without tight coupling.

---

### **2) Motivation**

* Many objects need updates when one object changes.
* Avoid manual polling by observers.
* Useful in GUIs, live dashboards, notifications.

---

### **3) Applicability**

* When change in one object affects many others.
* When you want dynamic **subscribe/unsubscribe** behavior.
* When you need loose coupling between subject and observers.

---

### **4) Structure**

* **Subject** → maintains observers, notifies them.
* **Observer** → defines update interface.
* **ConcreteSubject / ConcreteObserver** → actual implementations.

---

### **5) Participants**

* **Subject**
* **Observer**
* **ConcreteSubject**
* **ConcreteObserver**

---

### **6) Advantages**

* Promotes loose coupling.
* Supports dynamic registration of observers.
* Automatic update propagation.

---

### **7) Consequences**

* Many observers = costly update cascade.
* Hard to debug who gets notified when.
* Possible inconsistent states if updates aren’t synchronized.
