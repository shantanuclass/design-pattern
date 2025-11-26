# **🚂 Interpreter Pattern — Theory Summary**

### **1) Intent**

* Define a grammar for a simple language.
* Represent each grammar rule as a class.
* Interpret statements by evaluating an **abstract syntax tree (AST)**.

---

### **2) Motivation**

* Some problems are best solved by creating a **mini-language** (e.g., commands, expressions).
* Need to parse and execute instructions like `FORWARD 10`, `LEFT`, `LOOP 3`.
* Each rule should interpret itself independently.

---

### **3) Applicability**

* When a language/grammar is **simple and stable**.
* When expressions can be represented as a **tree of rules**.
* When adding new grammar rules should be easy.

---

### **4) Structure**

* **AbstractExpression** → common interpret() interface.
* **TerminalExpression** → handles basic symbols (e.g., numbers, commands).
* **NonTerminalExpression** → handles grammar combinations (e.g., loops, sequences).
* **Context** → holds information for interpretation.

---

### **5) Participants**

* **AbstractExpression**
* **TerminalExpression / NonTerminalExpression**
* **Context**
* **Client** (builds AST and triggers interpretation)

---

### **6) Advantages**

* Easy to add new grammar rules (new expression classes).
* Clear separation between grammar structure and interpretation.
* Natural fit for recursive language constructs.

---

### **7) Consequences**

* Class count grows quickly for complex grammars.
* Not suitable for large or evolving languages.
* Parsing logic can become slow if AST is large.

