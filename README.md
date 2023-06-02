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

