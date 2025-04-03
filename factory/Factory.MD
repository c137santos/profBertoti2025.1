# Factory



## Problems:

## How implement it?

The factory pattern delegate the responsability of creation the object. A Factory. And the code decide which subclass will instantiate. 

## UML

![alt text](singletonUMLExp.png)


## Anti-Patterns

That implement code [here](AntiPatterns.Java)

## Patterns

That implement code [here](DatabaseSingleton.Java)

1 - **Global Variables** - singleton look like global vars, is a bad practice, because you can't control the access to the object.

2 - **Static Classes** - is a bad practice, because you can't control the access to the object.

3 - **Single Responsibility Principle** - Since Singleton is designed as a single class, it often violates this principle by having multiple responsibilities. This is considered a bad practice because it makes the object's access control more difficult.

## Reffers

https://www.coursera.org/learn/design-patterns/lecture/hWt11/2-1-3-singleton-pattern

https://www.youtube.com/watch?v=x9h8MgAvi_I

https://refactoring.guru/design-patterns/singleton/java/example