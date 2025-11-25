
# **🚦 State Pattern — Theory Summary**

### **1) Intent**

* Allow an object to **change behavior** when its internal state changes.
* Make the object appear as if it changed its class.
* Encapsulate state-specific behavior in separate state objects.

---

### **2) Motivation**

* Avoid long `if-else` or `switch` blocks checking state repeatedly.
* Each state should handle its own behavior + transitions.
* Example: traffic lights, workflow steps, UI modes.

---

### **3) Applicability**

* When an object’s behavior depends on its state.
* When state transitions must be **explicit and organized**.
* When you want to eliminate conditional logic for state management.

---

### **4) Structure**

* **Context** → holds current state and delegates behavior.
* **State** → interface for state-specific actions.
* **ConcreteState** → implements behavior for each state.

---

### **5) Participants**

* **Context**
* **State**
* **ConcreteState (1…n)**

---

### **6) Advantages**

* Removes complex conditional state logic.
* Makes state transitions cleaner and modular.
* Easier to add new states without touching existing code.

---

### **7) Consequences**

* More classes (one per state).
* Transition logic may be scattered across states.
* Overkill if object has very few states.
