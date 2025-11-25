# **🔗 Chain of Responsibility Pattern — Theory Summary**

### **1) Intent**

* Pass a request along a chain of handlers.
* Each handler decides to **process or forward** the request.
* Remove direct coupling between sender and receiver.

---

### **2) Motivation**

* Avoid large `if-else` blocks deciding who handles what.
* Allow multiple handlers to get a chance to process the same request.
* Enable flexible request routing without modifying client code.

---

### **3) Applicability**

* When multiple objects may handle a request.
* When handler order or availability may change dynamically.
* When you want to assign responsibility **at runtime**.

---

### **4) Structure**

* **Handler** → defines interface & reference to next handler.
* **ConcreteHandler** → handles or forwards the request.
* **Client** → starts the request by calling the first handler.

---

### **5) Participants**

* **Handler**
* **ConcreteHandler (1…n)**
* **Client**

---

### **6) Advantages**

* Reduces coupling between sender and receiver.
* Easy to add/remove/reorder handlers.
* Supports dynamic handling logic.

---

### **7) Consequences**

* Request may go unhandled if chain ends.
* Hard to debug long chains.
* Handlers must cooperate properly for predictable results.
