# Design Patterns Complete Reference Table

## 🏭 Creational Patterns

### **1. Singleton Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Principal` (C) | `static Principal instance` - holds single instance | `private Principal()` - prevents external instantiation<br>`static Principal getInstance()` - returns singleton | `if (instance == null) instance = new Principal();`<br>`return instance;` |

---

### **2. Factory Method Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `IceCream` (I) | None | `void serve()` - product behavior | Interface defines contract |
| `ChocolateIceCream` (C) | None | `void serve()` - chocolate implementation | `System.out.println("Serving Chocolate Ice Cream 🍫");` |
| `VanillaIceCream` (C) | None | `void serve()` - vanilla implementation | `System.out.println("Serving Vanilla Ice Cream 🍦");` |
| `StrawberryIceCream` (C) | None | `void serve()` - strawberry implementation | `System.out.println("Serving Strawberry Ice Cream 🍓");` |
| `IceCreamFactory` (C) | None | `static IceCream makeIceCream(String type)` - factory method | `switch (type.toLowerCase()) {`<br>`case "chocolate": return new ChocolateIceCream();`<br>`case "vanilla": return new VanillaIceCream();` |

---

### **3. Abstract Factory Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Paint` (I) | None | `void usePaint()` - paint product interface | Product interface |
| `Brush` (I) | None | `void useBrush()` - brush product interface | Product interface |
| `WatercolorPaint` (C) | None | `void usePaint()` - watercolor paint | `System.out.println("Using Watercolor Paint 🎨");` |
| `WatercolorBrush` (C) | None | `void useBrush()` - watercolor brush | `System.out.println("Using Watercolor Brush 🖌️");` |
| `OilPaint` (C) | None | `void usePaint()` - oil paint | `System.out.println("Using Oil Paint 🌈");` |
| `OilBrush` (C) | None | `void useBrush()` - oil brush | `System.out.println("Using Oil Brush 🖌️");` |
| `PaintingKitFactory` (I) | None | `Paint createPaint()` - factory method for paint<br>`Brush createBrush()` - factory method for brush | Abstract factory interface |
| `WatercolorKitFactory` (C) | None | `Paint createPaint()` - returns WatercolorPaint<br>`Brush createBrush()` - returns WatercolorBrush | `return new WatercolorPaint();`<br>`return new WatercolorBrush();` |
| `OilPaintingKitFactory` (C) | None | `Paint createPaint()` - returns OilPaint<br>`Brush createBrush()` - returns OilBrush | `return new OilPaint();`<br>`return new OilBrush();` |

---

### **4. Builder Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Burger` (C) | `boolean cheese, lettuce, doublePatty, mayo, onions` - burger components | `private Burger(Builder builder)` - private constructor<br>`void show()` - displays burger | `this.cheese = builder.cheese;`<br>`this.lettuce = builder.lettuce;` |
| `Burger.Builder` (C) | `boolean cheese, lettuce, doublePatty, mayo, onions = true` - builder state | `Builder addCheese()` - adds cheese<br>`Builder addLettuce()` - adds lettuce<br>`Builder addDoublePatty()` - adds double patty<br>`Builder addMayo()` - adds mayo<br>`Builder removeOnions()` - removes onions<br>`Burger build()` - builds final burger | `this.cheese = true; return this;`<br>`return new Burger(this);` |

---

### **5. Prototype Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Toy` (I) | None | `Toy clone()` - clone method<br>`void show()` - display toy | Prototype interface |
| `ToyRobot` (C) | `String color`<br>`int height`<br>`boolean hasLaser` - robot attributes | `ToyRobot(String, int, boolean)` - constructor<br>`Toy clone()` - clones robot<br>`void show()` - displays robot | `return new ToyRobot(this.color, this.height, this.hasLaser);` |

---

## 🏗️ Structural Patterns

### **6. Adapter Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `IndianSocket` (I) | None | `void givePower()` - target interface | Target interface |
| `ForeignPlug` (C) | None | `void supplyElectricity()` - adaptee method | `System.out.println("Foreign plug supplying electricity ⚡");` |
| `PlugAdapter` (C) | `ForeignPlug foreignPlug` - adaptee reference | `PlugAdapter(ForeignPlug)` - constructor<br>`void givePower()` - adapts interface | `foreignPlug.supplyElectricity();` |

---

### **7. Bridge Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `TV` (I) | None | `void on()` - turn on<br>`void off()` - turn off<br>`void changeChannel(int)` - change channel | Implementor interface |
| `SonyTV` (C) | None | `void on()`, `void off()`, `void changeChannel(int)` - Sony implementation | `System.out.println("Sony TV is ON 🔵");` |
| `SamsungTV` (C) | None | `void on()`, `void off()`, `void changeChannel(int)` - Samsung implementation | `System.out.println("Samsung TV is ON 🔵");` |
| `RemoteControl` (C - abstract) | `protected TV tv` - implementor reference | `RemoteControl(TV tv)` - constructor<br>`abstract void turnOn()`<br>`abstract void turnOff()`<br>`abstract void setChannel(int)` | `this.tv = tv;` |
| `BasicRemote` (C) | Inherited `tv` | `void turnOn()` - delegates to TV<br>`void turnOff()` - delegates to TV<br>`void setChannel(int)` - delegates to TV | `tv.on();`<br>`tv.off();`<br>`tv.changeChannel(channel);` |

---

### **8. Facade Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `RoomService` (C) | None | `void orderFood()` - orders food | `System.out.println("Room Service: Your food order is placed 🍽️");` |
| `CleaningService` (C) | None | `void requestCleaning()` - cleans room | `System.out.println("Cleaning Service: Your room will be cleaned 🧹");` |
| `LaundryService` (C) | None | `void sendLaundry()` - washes clothes | `System.out.println("Laundry Service: Your clothes will be washed 👕");` |
| `TransportService` (C) | None | `void bookCab()` - books cab | `System.out.println("Transport Service: Your cab is booked 🚗");` |
| `Reception` (C) | `RoomService roomService`<br>`CleaningService cleaning`<br>`LaundryService laundry`<br>`TransportService transport` - subsystem references | `void orderFood()` - delegates to room service<br>`void requestRoomCleaning()` - delegates to cleaning<br>`void sendLaundry()` - delegates to laundry<br>`void bookTransport()` - delegates to transport | `roomService.orderFood();`<br>`cleaning.requestCleaning();`<br>`laundry.sendLaundry();`<br>`transport.bookCab();` |

---

### **9. Decorator Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Gift` (I) | None | `void wrap()` - wrapping behavior | Component interface |
| `SimpleGift` (C) | None | `void wrap()` - basic gift | `System.out.println("Gift box 🎁");` |
| `GiftDecorator` (C - abstract) | `protected Gift gift` - wrapped component | `GiftDecorator(Gift gift)` - constructor<br>`void wrap()` - delegates to wrapped gift | `gift.wrap();` |
| `RedWrapper` (C) | Inherited `gift` | `void wrap()` - adds red wrapping | `super.wrap();`<br>`System.out.println(" + Wrapped with Red Paper ❤️");` |
| `ShinyWrapper` (C) | Inherited `gift` | `void wrap()` - adds shiny wrapping | `super.wrap();`<br>`System.out.println(" + Wrapped with Shiny Paper ✨");` |
| `GlitterWrapper` (C) | Inherited `gift` | `void wrap()` - adds glitter wrapping | `super.wrap();`<br>`System.out.println(" + Wrapped with Glitter Paper ✨✨");` |

---

### **10. Proxy Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `OfficeAccess` (I) | None | `void enter()` - access interface | Subject interface |
| `RealEmployee` (C) | `String name` - employee name | `RealEmployee(String name)` - constructor<br>`void enter()` - enters office | `System.out.println(name + " has entered the office.");` |
| `SecurityGuard` (C) | `RealEmployee employee` - real subject reference | `SecurityGuard(RealEmployee)` - constructor<br>`void enter()` - controls access<br>`boolean checkAccess()` - validates access | `if (checkAccess()) {`<br>`    employee.enter();`<br>`}` |

---

### **11. Composite Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `FileSystem` (I) | None | `void showDetails()` - component interface | Component interface |
| `File` (C) | `String name` - file name | `File(String name)` - constructor<br>`void showDetails()` - displays file | `System.out.println("📄 File: " + name);` |
| `Folder` (C) | `String name` - folder name<br>`List<FileSystem> items` - children list | `Folder(String name)` - constructor<br>`void add(FileSystem item)` - adds child<br>`void showDetails()` - displays folder & children | `items.add(item);`<br>`for (FileSystem item : items) {`<br>`    item.showDetails();`<br>`}` |

---

## 🧠 Behavioral Patterns

### **12. Chain of Responsibility Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `RequestHandler` (C - abstract) | `protected RequestHandler next` - next handler reference | `void setNext(RequestHandler next)` - sets next handler<br>`abstract void handle(String request)` - handles request | `this.next = next;` |
| `OlderSibling` (C) | Inherited `next` | `void handle(String request)` - handles snack requests | `if (request.equalsIgnoreCase("snack")) {`<br>`    // handle`<br>`} else if (next != null) next.handle(request);` |
| `Parent` (C) | Inherited `next` | `void handle(String request)` - handles ice cream requests | `if (request.equalsIgnoreCase("ice cream")) {`<br>`    // handle`<br>`} else if (next != null) next.handle(request);` |
| `Grandparent` (C) | Inherited `next` | `void handle(String request)` - handles all remaining | `System.out.println("Grandparent: Pizza request approved! 🍕😄");` |

---

### **13. Observer Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Observer` (I) | None | `void update(String weather)` - update notification | Observer interface |
| `WeatherReporter` (C) | `List<Observer> subscribers` - observer list<br>`String currentWeather` - current state | `void subscribe(Observer o)` - adds observer<br>`void unsubscribe(Observer o)` - removes observer<br>`void setWeather(String weather)` - changes state<br>`void notifyAllSubscribers()` - notifies all | `subscribers.add(o);`<br>`this.currentWeather = weather;`<br>`notifyAllSubscribers();`<br>`for (Observer o : subscribers) {`<br>`    o.update(currentWeather);`<br>`}` |
| `You` (C) | None | `void update(String weather)` - reacts to weather | `System.out.println("You: Weather changed to '" + weather + "'. Taking an umbrella! ☔");` |
| `Farmer` (C) | None | `void update(String weather)` - reacts to weather | `System.out.println("Farmer: Weather is '" + weather + "'. Adjusting crop watering 🌾");` |
| `PicnicPlanner` (C) | None | `void update(String weather)` - reacts to weather | `System.out.println("Picnic Planner: Weather is '" + weather + "'. Moving picnic indoors 🧺➡️🏠");` |

---

### **14. Mediator Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `AirTrafficControl` (I) | None | `void requestLanding(Airplane, String runway)` - coordinates landing<br>`boolean isRunwayFree(String runway)` - checks availability<br>`void setRunwayBusy(String runway, boolean busy)` - updates status | Mediator interface |
| `ControlTower` (C) | `Map<String, Boolean> runwayStatus` - runway states | `boolean isRunwayFree(String runway)` - checks runway<br>`void setRunwayBusy(String, boolean)` - updates runway<br>`void requestLanding(Airplane, String)` - coordinates | `if (isRunwayFree(runway)) {`<br>`    airplane.land(runway);`<br>`    setRunwayBusy(runway, true);`<br>`}` |
| `Airplane` (C) | `String name` - airplane name<br>`AirTrafficControl tower` - mediator reference | `Airplane(String, AirTrafficControl)` - constructor<br>`void requestLanding(String runway)` - requests through mediator<br>`void land(String runway)` - lands airplane | `tower.requestLanding(this, runway);` |

---

### **15. State Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `TrafficLightState` (I) | None | `void handle(TrafficLight context)` - state behavior | State interface |
| `RedState` (C) | None | `void handle(TrafficLight context)` - red light behavior | `System.out.println("🔴 Red Light: STOP!");`<br>`context.setState(new GreenState());` |
| `GreenState` (C) | None | `void handle(TrafficLight context)` - green light behavior | `System.out.println("🟢 Green Light: GO!");`<br>`context.setState(new YellowState());` |
| `YellowState` (C) | None | `void handle(TrafficLight context)` - yellow light behavior | `System.out.println("🟡 Yellow Light: CAUTION!");`<br>`context.setState(new RedState());` |
| `TrafficLight` (C) | `TrafficLightState currentState` - current state reference | `TrafficLight()` - initializes with RedState<br>`void setState(TrafficLightState state)` - changes state<br>`void change()` - triggers state behavior | `this.currentState = new RedState();`<br>`this.currentState = state;`<br>`currentState.handle(this);` |

---

### **16. Strategy Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `RouteStrategy` (I) | None | `void calculateRoute(String start, String end)` - algorithm interface | Strategy interface |
| `DrivingStrategy` (C) | None | `void calculateRoute(String start, String end)` - driving algorithm | `System.out.println("🚗 Driving Route: Using highways...");` |
| `WalkingStrategy` (C) | None | `void calculateRoute(String start, String end)` - walking algorithm | `System.out.println("🚶 Walking Route: Using sidewalks...");` |
| `BikingStrategy` (C) | None | `void calculateRoute(String start, String end)` - biking algorithm | `System.out.println("🚲 Biking Route: Using bike lanes...");` |
| `PublicTransitStrategy` (C) | None | `void calculateRoute(String start, String end)` - transit algorithm | `System.out.println("🚇 Transit Route: Using buses and trains...");` |
| `GPSNavigator` (C) | `RouteStrategy strategy` - current strategy reference | `void setStrategy(RouteStrategy strategy)` - swaps strategy<br>`void navigate(String start, String end)` - executes strategy | `this.strategy = strategy;`<br>`strategy.calculateRoute(start, end);` |

---

### **17. Memento Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `PlayerMemento` (C) | `int health, score`<br>`String location` - saved state | `PlayerMemento(int, int, String)` - constructor<br>`int getHealth(), getScore()`<br>`String getLocation()` - getters | `this.health = health;`<br>`this.score = score;`<br>`this.location = location;` |
| `Player` (C) | `int health, score`<br>`String location` - current state | `void setState(int, int, String)` - sets state<br>`void showState()` - displays state<br>`PlayerMemento saveGame()` - creates memento<br>`void loadGame(PlayerMemento)` - restores from memento | `return new PlayerMemento(health, score, location);`<br>`this.health = memento.getHealth();`<br>`this.score = memento.getScore();` |
| `MemoryCard` (C) | `List<PlayerMemento> saves` - memento storage | `void addSave(PlayerMemento m)` - stores memento<br>`PlayerMemento getSave(int index)` - retrieves memento | `saves.add(m);`<br>`return saves.get(index);` |

---

### **18. Iterator Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `Iterator` (I) | None | `boolean hasNext()` - checks more elements<br>`Object next()` - returns next element | Iterator interface |
| `BookshelfIterator` (C) | `String[] books` - collection reference<br>`int index = 0` - current position | `BookshelfIterator(String[] books)` - constructor<br>`boolean hasNext()` - checks if more books<br>`Object next()` - returns next book | `return index < books.length;`<br>`return books[index++];` |
| `Aggregate` (I) | None | `Iterator createIterator()` - factory method | Aggregate interface |
| `Bookshelf` (C) | `String[] books` - internal collection | `Bookshelf(String[] books)` - constructor<br>`Iterator createIterator()` - creates iterator | `return new BookshelfIterator(books);` |

---

### **19. Interpreter Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `TrainContext` (C) | None | `void moveForward(int steps)` - moves train<br>`void turnLeft()` - turns left<br>`void turnRight()` - turns right | `System.out.println("🚂 Moving forward " + steps + " steps.");` |
| `Expression` (I) | None | `void interpret(TrainContext context)` - interprets expression | Expression interface |
| `ForwardExpression` (C) | `int steps` - terminal value | `ForwardExpression(int steps)` - constructor<br>`void interpret(TrainContext)` - executes forward | `context.moveForward(steps);` |
| `LeftExpression` (C) | None | `void interpret(TrainContext)` - executes left | `context.turnLeft();` |
| `RightExpression` (C) | None | `void interpret(TrainContext)` - executes right | `context.turnRight();` |
| `LoopExpression` (C) | `int times`<br>`Expression command` - non-terminal data | `LoopExpression(int, Expression)` - constructor<br>`void interpret(TrainContext)` - loops command | `for (int i = 0; i < times; i++) {`<br>`    command.interpret(context);`<br>`}` |
| `Parser` (C) | None | `static Expression parse(String command)` - parses command string | `String[] parts = command.split(" ");`<br>`if (parts[0].equalsIgnoreCase("LOOP")) {`<br>`    return new LoopExpression(...);`<br>`}` |

---

### **20. Template Method Pattern**

| Class/Interface | Variables | Methods | Key Code Lines |
|-----------------|-----------|---------|----------------|
| `CookieRecipe` (C - abstract) | None | `final void bakeCookies()` - template method (final)<br>`private void preheatOven()` - fixed step<br>`private void mixIngredients()` - fixed step<br>`private void bake()` - fixed step<br>`private void coolDown()` - fixed step<br>`protected abstract void addFlavoring()` - abstract hook | `preheatOven();`<br>`addFlavoring(); // subclass`<br>`mixIngredients();`<br>`bake();`<br>`coolDown();` |
| `ChocolateChipCookie` (C) | None | `protected void addFlavoring()` - chocolate implementation | `System.out.println("🍫 Adding chocolate chips...");` |
| `OatmealRaisinCookie` (C) | None | `protected void addFlavoring()` - oatmeal implementation | `System.out.println("🌾 Adding oatmeal and raisins...");` |
| `PeanutButterCookie` (C) | None | `protected void addFlavoring()` - peanut butter implementation | `System.out.println("🥜 Adding peanut butter chunks...");` |

---

## 🎯 Quick Pattern Recognition Guide

**Key Code Signatures:**

1. **Singleton**: `private static instance`, `private constructor`, `getInstance()`
2. **Factory**: `switch/if-else returning new ConcreteProduct()`
3. **Abstract Factory**: Multiple `create` methods returning related products
4. **Builder**: Method chaining with `return this`, final `build()` method
5. **Prototype**: `clone()` returning `new ConcretePrototype(this.field1, this.field2)`
6. **Adapter**: `adaptee.oldMethod()` called inside `newMethod()`
7. **Bridge**: Abstraction holds implementor reference, delegates calls
8. **Facade**: Simple methods delegating to multiple subsystems
9. **Decorator**: `super.operation()` then add extra behavior
10. **Proxy**: Check condition, then `realSubject.operation()`
11. **Composite**: Loop through children calling same method recursively
12. **Chain**: `if (canHandle) process else if (next != null) next.handle()`
13. **Observer**: `for (Observer o : observers) o.update()`
14. **Mediator**: Colleagues call `mediator.method()`, mediator coordinates
15. **State**: `currentState.handle(this)`, state sets `context.setState(nextState)`
16. **Strategy**: `strategy.algorithm()` - context delegates to strategy
17. **Memento**: `new Memento(state)` to save, `this.state = memento.getState()` to restore
18. **Iterator**: `hasNext()` checks index, `next()` returns and increments
19. **Interpreter**: `if (terminal) execute; else parse and interpret children`
20. **Template**: `final templateMethod()` calls fixed + abstract steps in sequence
