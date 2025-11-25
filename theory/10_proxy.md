
# **🛡️ Proxy Pattern — Theory Summary**

### **1) Intent**

* Provide a **surrogate or placeholder** for another object.
* Control access to the real object.
* Add functionality (e.g., logging, security, caching) before delegating.

---

### **2) Motivation**

* Direct access to the real object may be expensive or restricted.
* Need to protect, manage, or defer access to a resource.
* Example: authentication before accessing a folder, lazy-loading large objects.

---

### **3) Applicability**

* When controlling access (protection proxy).
* When delaying creation of expensive objects (virtual proxy).
* When accessing remote services (remote proxy).

---

### **4) Structure**

* **Subject** → common interface.
* **RealSubject** → actual object containing real logic.
* **Proxy** → wraps RealSubject and adds access control.
* **Client** → interacts with Proxy as if it were RealSubject.

---

### **5) Participants**

* **Subject**
* **RealSubject**
* **Proxy**
* **Client**

---

### **6) Advantages**

* Adds security, caching, logging transparently.
* Controls expensive or remote resource access.
* Keeps client code identical (same interface).

---

### **7) Consequences**

* Adds indirection (slightly slower calls).
* Proxy must maintain correctness with RealSubject.
* Can increase complexity when many proxy types exist.
