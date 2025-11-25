

# **🏢 Facade Pattern — Theory Summary**

### **1) Intent**

* Provide a **simplified interface** to a complex subsystem.
* Hide internal complexity from the client.
* Make subsystem usage easier and cleaner.

---

### **2) Motivation**

* Large systems have many interacting components that overwhelm clients.
* Client should not need to understand subsystem internals.
* A single entry point improves usability and reduces coupling.

---

### **3) Applicability**

* When you want to **simplify** interaction with a complex subsystem.
* When you need to **decouple** client code from subsystem classes.
* When migrating legacy systems where you expose only a clean interface.

---

### **4) Structure**

* **Facade** → unified high-level interface.
* **Subsystem classes** → perform real work.
* **Client** → calls Facade, not subsystems.

---

### **5) Participants**

* **Facade**
* **Subsystem Classes**
* **Client**

---

### **6) Advantages**

* Reduces client–subsystem coupling.
* Makes complex subsystems easier to use.
* Supports layering by defining entry points.

---

### **7) Consequences**

* May hide important subsystem features.
* Facade becomes a **god-object** if overloaded.
* Subsystems may still need direct access occasionally.

