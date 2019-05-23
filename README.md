# Factory-Design-Pattern
```
public interface Vehicle {
	int set_num_of_wheels();
	int set_num_of_passengers();
	boolean has_gas();
}
```
a) Explain how can you use the pattern to create car and plane class?

Answer:

I have use Factory design to solve this problem.Factory Pattern defines an interface for creating an object, but let’s the classes that implement the interface decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses.
