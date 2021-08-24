# Design Patterns

In software engineering, a design pattern is a **general repeatable solution** to a **commonly occurring problem** in software design.


## Design Pattern Catalog

**Creational Patterns**
- Abstract Factory
- Builder
- Factory Method
- Prototype
- Singleton

**Structural Patterns**
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

**Behavioral Patterns**
- Chain of Responsibility
- Command
- Interpreter
- Mediator
- Memento
- Observer
- State
- Strategy
- Template Method
- Visitor


## Memento Design Pattern

* A way to store previous states of an Object easily.
* **Memento**: The basic object that is stored in different states.
* **Originator**: Sets and Gets values from the currently targeted Memento. Creates new Mementos and assigns current values to them.
* **Caretaker**: Holds an ArrayList that contains all previous versions of the Memento. It can store and retrieve stored Mementos.

## State

* Allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.
* **Context**(Account): Maintains an instance of a ConcreteState subclass that defines the current state.
* **State**: Defines an interface for encapsulating the behavior associated with a particular state of the Context.
* **Concrete State**: Each subclass implements a behavior associated with a state of Context.

## Iterator

* The Iterator pattern provides you with a uniform way to access different collections of Objects.
* If you get an Array, ArrayList and Hashtable of Objects, you pop out an iterator for each and treat them the same.
* This provides a uniform way to cycle through different collections.
* You can also write polymorphic code because you can refer to each collection of objects because they'll implement the same interface.

## Strategy pattern

* Also known as **Policy Pattern**.
* Used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.