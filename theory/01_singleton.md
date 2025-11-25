# **🔒 Singleton Pattern — Theory Summary**

### **1) Intent**

* Ensure **only one instance** of a class exists.
* Provide a **global access point** to it.
* Control object creation for shared resources.

---

### **2) Motivation**

* Needed when **exactly one object** must coordinate system actions.
* Avoid multiple expensive or conflicting instances.
* Prevent inconsistent state across multiple objects.

---

### **3) Applicability**

* When a class must have **one and only one instance**.
* When centralized **logging, config, cache, DB connection** is required.
* When global point of access is needed **without global variables**.

---

### **4) Structure**

* **Private constructor** → prevents external instantiation.
* **Static instance field** → holds the single object.
* **Public static getInstance()** → returns that object.

---

### **5) Participants**

* **Singleton class** → defines and manages sole instance.
* **Client** → uses getInstance() to access it.
* (No other participants—pattern is minimal.)

---

### **6) Advantages**

* Controlled, single access point.
* Saves memory by avoiding duplicate objects.
* Useful for shared resources (DB, loggers).

---

### **7) Consequences**

* Can lead to **hidden dependencies** (global state).
* Difficult to unit test (hard to replace).
* Can become a **bottleneck** in multithreaded use if not thread-safe.
