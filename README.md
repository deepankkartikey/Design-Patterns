### Design Patterns
### 1. Singleton Design Pattern
- Create only single object and reuse it multiple times during program lifespan
    ### Ways to break Singleton pattern:
- Using Reflection API
    -   Solution
        - Throw runtimeexception if object instance method is accessed the second time.
        - Make the class as enum
- Serializing and Deserializing object
- Using clone() method 

### 2. Factory Design Pattern
- Single Superclass and multiple child classes
- Getting specific subclass based on input and requirement
### Advantages
- Focus on creating object for interface rather than implementation
- Loose coupling implies more robus code

### 3. Abstract Factory Design Pattern
- Uses factory of factories to create an object
- Extra layer of abstraction provides more code hiding

### Factory v/s Abstract Factory
##### Factory

- Imagine you are constructing a house and you approach a carpenter for a door. You give the measurement for the door and your requirements, and he will construct a door for you. In this case, the carpenter is a factory of doors. Your specifications are inputs for the factory, and the door is the output or product from the factory.

##### Abstract Factory

- Now, consider the same example of the door. You can go to a carpenter, or you can go to a plastic door shop or a PVC shop. All of them are door factories. Based on the situation, you decide what kind of factory you need to approach. This is like an Abstract Factory.