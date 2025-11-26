# Design Patterns Quick Reference Table

## 🏭 Creational Patterns

| Pattern | Classes (C) / Interfaces (I) | Purpose of Each Class/Interface |
|---------|------------------------------|--------------------------------|
| **Singleton** | `Principal` (C) | Holds single instance, prevents external instantiation via private constructor |
| **Factory Method** | `IceCream` (I)<br>`ChocolateIceCream` (C)<br>`VanillaIceCream` (C)<br>`StrawberryIceCream` (C)<br>`IceCreamFactory` (C) | Product interface<br>Concrete chocolate product<br>Concrete vanilla product<br>Concrete strawberry product<br>Factory that creates products based on type |
| **Abstract Factory** | `Paint` (I)<br>`Brush` (I)<br>`WatercolorPaint` (C)<br>`WatercolorBrush` (C)<br>`OilPaint` (C)<br>`OilBrush` (C)<br>`PaintingKitFactory` (I)<br>`WatercolorKitFactory` (C)<br>`OilPaintingKitFactory` (C) | Product interface for paint<br>Product interface for brush<br>Concrete watercolor paint<br>Concrete watercolor brush<br>Concrete oil paint<br>Concrete oil brush<br>Abstract factory interface<br>Factory creating watercolor family<br>Factory creating oil painting family |
| **Builder** | `Burger` (C)<br>`Burger.Builder` (C - inner) | Complex product being built<br>Builder that constructs Burger step-by-step |
| **Prototype** | `Toy` (I)<br>`ToyRobot` (C) | Prototype interface with clone() method<br>Concrete prototype that implements cloning |

---

## 🏗️ Structural Patterns

| Pattern | Classes (C) / Interfaces (I) | Purpose of Each Class/Interface |
|---------|------------------------------|--------------------------------|
| **Adapter** | `IndianSocket` (I)<br>`ForeignPlug` (C)<br>`PlugAdapter` (C) | Target interface client expects<br>Adaptee with incompatible interface<br>Adapter converting ForeignPlug to IndianSocket |
| **Bridge** | `TV` (I)<br>`SonyTV` (C)<br>`SamsungTV` (C)<br>`RemoteControl` (C - abstract)<br>`BasicRemote` (C) | Implementor interface<br>Concrete implementor for Sony<br>Concrete implementor for Samsung<br>Abstraction holding TV reference<br>Refined abstraction delegating to TV |
| **Facade** | `RoomService` (C)<br>`CleaningService` (C)<br>`LaundryService` (C)<br>`TransportService` (C)<br>`Reception` (C) | Subsystem for food orders<br>Subsystem for room cleaning<br>Subsystem for laundry<br>Subsystem for transport<br>Facade providing unified interface to all subsystems |
| **Decorator** | `Gift` (I)<br>`SimpleGift` (C)<br>`GiftDecorator` (C - abstract)<br>`RedWrapper` (C)<br>`ShinyWrapper` (C)<br>`GlitterWrapper` (C) | Component interface<br>Concrete component (base gift)<br>Base decorator wrapping Gift<br>Concrete decorator adding red paper<br>Concrete decorator adding shiny paper<br>Concrete decorator adding glitter paper |
| **Proxy** | `OfficeAccess` (I)<br>`RealEmployee` (C)<br>`SecurityGuard` (C) | Subject interface<br>Real subject performing actual work<br>Proxy controlling access to RealEmployee |
| **Composite** | `FileSystem` (I)<br>`File` (C)<br>`Folder` (C) | Component interface<br>Leaf representing individual file<br>Composite holding children (files/folders) |

---

## 🧠 Behavioral Patterns

| Pattern | Classes (C) / Interfaces (I) | Purpose of Each Class/Interface |
|---------|------------------------------|--------------------------------|
| **Chain of Responsibility** | `RequestHandler` (C - abstract)<br>`OlderSibling` (C)<br>`Parent` (C)<br>`Grandparent` (C) | Handler defining interface & next reference<br>Concrete handler processing snack requests<br>Concrete handler processing ice cream requests<br>Concrete handler processing pizza requests (final) |
| **Observer** | `Observer` (I)<br>`WeatherReporter` (C)<br>`You` (C)<br>`Farmer` (C)<br>`PicnicPlanner` (C) | Observer interface with update() method<br>Subject maintaining & notifying observers<br>Concrete observer taking umbrella<br>Concrete observer adjusting crops<br>Concrete observer moving picnic indoors |
| **Mediator** | `AirTrafficControl` (I)<br>`ControlTower` (C)<br>`Airplane` (C) | Mediator interface<br>Concrete mediator coordinating runway access<br>Colleague communicating through mediator |
| **State** | `TrafficLightState` (I)<br>`RedState` (C)<br>`GreenState` (C)<br>`YellowState` (C)<br>`TrafficLight` (C) | State interface<br>Concrete state handling red light behavior<br>Concrete state handling green light behavior<br>Concrete state handling yellow light behavior<br>Context holding current state & delegating |
| **Strategy** | `RouteStrategy` (I)<br>`DrivingStrategy` (C)<br>`WalkingStrategy` (C)<br>`BikingStrategy` (C)<br>`PublicTransitStrategy` (C)<br>`GPSNavigator` (C) | Strategy interface<br>Concrete strategy for driving routes<br>Concrete strategy for walking routes<br>Concrete strategy for biking routes<br>Concrete strategy for transit routes<br>Context using selected strategy |
| **Memento** | `PlayerMemento` (C)<br>`Player` (C)<br>`MemoryCard` (C) | Memento storing player state snapshot<br>Originator creating & restoring from memento<br>Caretaker managing memento storage |
| **Iterator** | `Iterator` (I)<br>`BookshelfIterator` (C)<br>`Aggregate` (I)<br>`Bookshelf` (C) | Iterator interface<br>Concrete iterator traversing books<br>Aggregate interface<br>Concrete aggregate creating iterator |
| **Interpreter** | `Expression` (I)<br>`ForwardExpression` (C)<br>`LeftExpression` (C)<br>`RightExpression` (C)<br>`LoopExpression` (C)<br>`TrainContext` (C)<br>`Parser` (C) | Abstract expression interface<br>Terminal expression for forward command<br>Terminal expression for left turn<br>Terminal expression for right turn<br>Non-terminal expression for loops<br>Context providing train operations<br>Parser building expression tree from commands |
| **Template Method** | `CookieRecipe` (C - abstract)<br>`ChocolateChipCookie` (C)<br>`OatmealRaisinCookie` (C)<br>`PeanutButterCookie` (C) | Abstract class defining template & fixed steps<br>Concrete class implementing chocolate flavoring<br>Concrete class implementing oatmeal flavoring<br>Concrete class implementing peanut butter flavoring |

---

## 📝 Memory Tips

**Class Role Patterns:**

**Creational Patterns:**
- Factory classes → CREATE products
- Builder classes → CONSTRUCT complex objects step-by-step
- Prototype interfaces → DEFINE clone() method

**Structural Patterns:**
- Adapter → CONVERTS interface A to interface B
- Decorator → WRAPS and ADDS features
- Facade → SIMPLIFIES by hiding subsystems
- Proxy → CONTROLS ACCESS to real object
- Composite → CONTAINS children (tree structure)
- Bridge → SEPARATES abstraction from implementation

**Behavioral Patterns:**
- Subject/Observable → NOTIFIES observers
- Observer → REACTS to subject changes
- Context → HOLDS current state/strategy and DELEGATES
- State/Strategy → IMPLEMENTS specific behavior
- Handler → PROCESSES or FORWARDS request
- Mediator → COORDINATES colleague interactions
- Originator → CREATES and RESTORES memento
- Caretaker → STORES mementos
- Iterator → TRAVERSES collection
- Parser → BUILDS expression tree
