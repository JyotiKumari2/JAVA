# JAVA

## JVM Architecture

1. What is the JVM?
Ans: 
- JVM is the abbreviation of Java Virtual Machine.
- JVM allows computers to run and interpret Java programs.
- JVM provides a platform-independent execution environment.
- JVM converts Java bytecode into machine-specific code.
2. What are the main components of the JVM?

Ans
- ClassLoader:  Loads class file into memory.
- ByteCode: Verifies the correctness of ByteCode.
- Execution Engine: Executes the ByteCode. It includes an interpreter and JIT (Just-In-Time) compiler.
- Garbage Collector: Manages memory by reclaiming unused objects.
Runtime Data Areas: This includes memory structures like Method Area, Heap, Stack, Program Counter (PC Registers), and Native Method Stack.

3. What is the difference between JDK, JRE, and JVM?
Ans:
- JDK ( Java Development Kit): 
  - It is a full-featured software development kit.
  - This includes JRE, development tools like compilers (javac), and other utilities required for developing Java applications.
- Allows Java developers to build Java Applications, Applets, and components.
- Tools: Compiler (javac), debugger, disassembler, applet viewer, stub file generator, documentation generator.
- JDK allows developers to:
   - Compile source code into byte code.
   - Package applications.
   - Spin up JVMs.
   - Manage runtime environment of Java Applications.
   - Write applications that can run on any Java Virtual Machine.
   - Use Java applications on another system without changing or recompiling the code.

- JRE ( Java Runtime Environment):
   - JRE = JVM + Java Class Libraries + Java Class Loader.
   - Acts as translator between Java Program and Operating System.
- Use to develop Java Softwares.
JVM ( Java Virtual Machine):
- Engine provides runtime environment to execute bytecode.

4. Explain the role of the Classloader in the JVM.
Ans:
- The class loader is responsible for loading java classes into memory.
- It consists of three types of class loaders:
1. Bootstrap Classloader: 
   - First class loader that starts when a java program runs.
   - It loads core java libraries.
2. Extension Classloader:
    - Loads classes from extension directory.
    - It is a child of bootstrap classloader.
3. Application/System ClassLoader: 
   - It loads classes from classpath, which is a list of directories and jar files that the JVM searches for classes.

5. What is the difference between Stack and Heap memory in JVM?
Answer:
Stack Memory: It is used for storing method call frames, local variables, and references to objects. Each thread has its own stack, and stack memory is fast and smaller in size. It is automatically managed.
Heap Memory: It is used for storing objects created dynamically during runtime. The heap is shared among all threads and has a larger size. Memory in the heap is managed by the Garbage Collector.
6. What is Garbage Collection in JVM?
Answer: Garbage Collection (GC) is a process in which the JVM automatically reclaims memory by destroying objects that are no longer in use (i.e., objects that are not reachable from any thread). It helps prevent memory leaks and optimize memory usage.
 
7. What are the different types of references in Java?
Answer:
Strong Reference: The default reference, which prevents the object from being garbage collected.
Soft Reference: Objects with soft references are collected only when the JVM is running low on memory.
Weak Reference: Objects with weak references are collected when the garbage collector runs, regardless of the available memory.
Phantom Reference: Used for cleanup actions after the object has been finalized and just before it’s garbage collected.

8. Explain the concept of Just-In-Time (JIT) Compiler in JVM.
Answer: The JIT Compiler is part of the JVM that improves performance by compiling bytecode into native machine code at runtime. It compiles frequently executed code paths into machine code so that it runs faster in subsequent executions.

9. What is the difference between an Interpreter and JIT Compiler in JVM?
Answer:
Interpreter: It reads and executes bytecode line by line, which can be slower as it doesn’t optimize the execution.
JIT Compiler: It compiles bytecode into native machine code, which can run faster because it is optimized for the specific system at runtime.
 
10. What are the different types of memory areas in the JVM?
Answer: The JVM memory is divided into several regions:
Method Area: Stores class definitions, static variables, and constants.
Heap: Stores objects created during the execution of the program.
Stack: Stores method frames, local variables, and references to objects.
Program Counter (PC) Register: Keeps track of the current instruction being executed by each thread.
Native Method Stack: Used for native method calls (code written in other languages like C/C++).

11. What is the role of the JVM in platform independence?
Answer: The JVM makes Java platform-independent by abstracting the underlying hardware. Java programs are compiled into bytecode, which can be executed on any platform that has a compatible JVM, ensuring that the same code runs on different platforms without modification.

12. What do you understand by "native methods" in Java?
Answer: Native methods are methods written in languages other than Java, such as C or C++. These methods are usually part of the Java Native Interface (JNI), which allows Java code to call or be called by native code.

13. Explain the concept of Method Area in JVM.
Answer: The Method Area is a part of the memory in the JVM where class structures such as method and field data, the constant pool, and the code for methods are stored. This area is shared among all threads.


# Polymorphism


### Method Overloading : use for compile time polymorphism
### Method Overriding : use for runtime polymorphism


# Abstract Class

### What is Abstract Class

### Types of Classes
- Abstract Class: We cannot create objects of abstract classes but we can create a reference.
- Concrete Class : We can create objects of concrete classes.

- If any class inheriting from abstract class the that class will also become abstract class.

 

# Interfaces


- Purpose of interface is to achieve polymorphism
- Interfaces are implemented, and in java we implement multiple classes
- Interface is a collection of abstract methods