M.GatesAPComputerScience
========================
Okay cool. So this is a place where I can do my homework.

Exercises in Chapter 3 Litvin:

"1." Mark true or false and explain:

a) The name of a class in Java must be the same as the name of its source file (excluding the extension .java).

True - The name of a class is the exact same as the name of the source file, excluding the extension .java). 
For example, for a program "HelloWorld.java", the name of the source file is "HelloWorld.java" and the name of the
class is the exact same, for example, "public class HelloWorld". Java is also case sensitive so it must be the 
exact same with upper and lowercase letters.

b) The names of classes are case-sensitive.

True - For example, "HelloWorld" is different from "Helloworld".
Also, classes in Java, by convention, always start with a capital letter. 

c) The import statement tells the compiler which other classes use this class.

False - The import statement tells the compiler which other classes to look for that are used in the class of the
program at hand. 

"4." Mark true or false and explain:

a) Fields of a class are usually declared "private".

True - Fields are usually declared private unless there is a good reason for not doing so.

b) An object has to be created before it can be used.

True - An object must be created before it can be used.

c) A class may have more than one constructor.

True - A class can have several constructors that differ in number/types of parameters.

d) The programmer gives names to objects in his programs.

True - The programmer does give names to the objects in his/her program.

e) When an object is created, the program always calls its init method.

False - The init() method is used when applet is launched in the browser and many programs don't use the init method
at all

"5." The following are benefits of encapsulation.

1) The fields of a class can be changed by the programmer and the whole project won't be affected as long as the 
public methods and constructors work the same as before. 

2) The programmer of a class can document for others the constructors and the public methods of the class without 
actually giving them the implementation details. This facilitates team work and program maintenance.

3) Encapsulated classes are easier to maintain, document, and reuse. 

"7." According to the source r is for row and c is for column. This is a copy of the source code:
public Location(int r, int c)
    {
        row = r;
        col = c;
    }

"11." See BookProgram.java

"14." Mark True or False:

a) A subclass inherits all the fields and public methods of is superclass.

True - A sublcass does inherit all the fields and public methods, but not the constructors. 

b) False - Constructors are not inherited from the superclass. The subclass must provide its own. 

16. Which of the following assignment statements wil compile without errors?

a) Actor alice1 = new Actor(); Will compile because you can make another actor within the superclass Actor.

b) Actor alice2 = new Bug(); Will compile because Actor is the superclass and Bug is a subclass of Actor

c) Actor alice3 = new Flower(); Will compile because Actor is the superclass and Flower is a subclass of Bug

d) Bug bob1 = new Actor(); Will not compile because Bug is a subclass of Actor. 
                            Stated error in program "Cannot convert from Actor to Bug"

e) Flower rose1 = new Actor(); Will not compile because Flower is a subclass of Actor.
                                Stated error in program "Cannot convert from Actor to Flower"

f) Flower rose2 = newFlower(Color.RED); Will not compile because there is no defined method "newFlower(Color)"

g) BoxBug boxy1 = new Boxbug(); Will compile because it is from class to class.

h) BoxBug boxy2 = new BoxBug(5); Will compile because it is from class to class. The only difference from the previous 
                                  is that there is a variable, which in this case is valid. 
                                  
i) Bug boxy3 = new BoxBug(5); Will compile because it is from one superclass to a class with a valid variable.


