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

