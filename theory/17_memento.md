
# **💾 Memento Pattern — Theory Summary**

### **1) Intent**

* Capture an object’s **internal state** without exposing it.
* Store that state externally as a **memento**.
* Restore the object back to that state later.

---

### **2) Motivation**

* Need “undo/rollback” without violating encapsulation.
* Useful when object state is complex but must be restorable.
* Example: game save points, text editor undo, checkpoints.

---

### **3) Applicability**

* When an object must be able to **revert** to a previous state.
* When internal state should remain **private** and hidden.
* When the system requires checkpoints or transactional save/restore.

---

### **4) Structure**

* **Originator** → creates memento, restores state.
* **Memento** → stores internal state snapshot.
* **Caretaker** → holds mementos but doesn’t inspect contents.

---

### **5) Participants**

* **Originator**
* **Memento**
* **Caretaker**

---

### **6) Advantages**

* Preserves **encapsulation** (state stays private).
* Enables clean undo/rollback.
* Caretaker can hold many historical snapshots.

---

### **7) Consequences**

* Memory overhead if many mementos are stored.
* Saving deep object graphs can be expensive.
* Caretaker must manage lifecycle of mementos manually.

