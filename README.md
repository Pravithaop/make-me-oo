So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.

------------------------------------------------------------------------------

Problems with Shivam's OOP solution.


- There is no need of getters and setters in the solution.
- Properties should be declared as final. It’s to indicate that the properties values cannot be changed.The fields should be final
- The point.java files do not have any behaviour. It’s an example of data class codesmell.
- Setters are not used in the code.

- Apart from using getters and setters the code is similar as that of procedural code. No oop concept applied.
- No need of using static keywords in the methods.Static methods do not encapsulate.
- We can refactor the distance calculation into a method.
-  DistanceAndDirection.java file is removed



DistanceAndDirectionCalculatorTest.j

- Doesn’t follow AAA format.
- Magic number code smell. That expected value can be moved into a variable named “expected”.
- Import statement can be optimised for assertEquals.



