

# **🧩 Adapter Pattern — Theory Summary**

### **1) Intent**

* Convert one interface into another the client expects.
* Allow incompatible classes to work together.
* Act as a translator between two different interfaces.

---

### **2) Motivation**

* Legacy or third-party classes cannot be changed.
* Client code needs a specific interface, but existing class doesn’t match.
* Adapter sits in between to avoid modifying existing systems.

---

### **3) Applicability**

* When two classes cannot collaborate due to **incompatible interfaces**.
* When you want to **reuse existing classes** without altering them.
* When migrating systems where old & new components must interoperate.

---

### **4) Structure**

* **Target** → desired interface.
* **Adaptee** → existing class with incompatible interface.
* **Adapter** → implements Target, internally calls Adaptee.

---

### **5) Participants**

* **Target**
* **Adaptee**
* **Adapter**
* **Client**

---

### **6) Advantages**

* Allows reuse of existing implementations.
* Removes client dependency on Adaptee’s interface.
* Easy to integrate legacy classes.

---

### **7) Consequences**

* Extra object increases call indirection.
* Class adapter limited by language (requires multiple inheritance).
* Overuse can create many small wrapper classes.
