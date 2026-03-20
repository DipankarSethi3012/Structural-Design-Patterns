# ✨ Structural Design Patterns 🏗️

<div align="center">

![Design Patterns](https://img.shields.io/badge/Design%20Patterns-Structural-blue?style=for-the-badge&logo=java)
![Language](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

**Master the Art of Building Flexible Software Architecture** 🎨

*A comprehensive collection of Structural Design Patterns implementations in Java with detailed explanations and real-world examples.*

[📚 Documentation](#-documentation) • [🚀 Quick Start](#-quick-start) • [📖 Patterns](#-structural-design-patterns) • [💡 Examples](#-examples)

</div>

---

## 📌 Table of Contents

- [About](#-about)
- [Patterns Overview](#-structural-design-patterns)
- [Project Structure](#-project-structure)
- [Quick Start](#-quick-start)
- [Pattern Details](#-detailed-pattern-documentation)
- [Best Practices](#-best-practices)
- [Resources](#-resources)
- [Contributing](#-contributing)

---

## 🎯 About

Structural Design Patterns are design patterns that deal with object composition, creating relationships between entities to form larger structures. These patterns help ensure that when one part changes, the entire structure doesn't need to change, promoting flexibility and maintainability in your codebase.

### Why Structural Patterns? 🤔

✅ **Improved Flexibility** - Compose objects in different ways  
✅ **Better Maintainability** - Easier to modify and extend code  
✅ **Code Reusability** - Create composable, reusable components  
✅ **Decoupling** - Reduce dependencies between classes  
✅ **Performance** - Optimize resource usage through sharing  

---

## 📚 Structural Design Patterns

<table align="center">
  <thead>
    <tr>
      <th>🎭 Pattern</th>
      <th>📝 Purpose</th>
      <th>⚡ Key Benefit</th>
      <th>🎯 Use When</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><strong>Adapter</strong></td>
      <td>Convert interface of a class into another interface</td>
      <td>Integrates incompatible interfaces</td>
      <td>Connecting legacy code with new systems</td>
    </tr>
    <tr>
      <td><strong>Bridge</strong></td>
      <td>Decouple abstraction from implementation</td>
      <td>Independent variation of both</td>
      <td>Multiple implementations exist</td>
    </tr>
    <tr>
      <td><strong>Composite</strong></td>
      <td>Compose objects into tree structures</td>
      <td>Treat individual and composite uniformly</td>
      <td>Building hierarchical structures</td>
    </tr>
    <tr>
      <td><strong>Decorator</strong></td>
      <td>Add behavior to objects dynamically</td>
      <td>Flexible alternative to subclassing</td>
      <td>Adding responsibilities at runtime</td>
    </tr>
    <tr>
      <td><strong>Facade</strong></td>
      <td>Provide unified interface to subsystem</td>
      <td>Simplifies complex interactions</td>
      <td>Hiding complexity from clients</td>
    </tr>
    <tr>
      <td><strong>Flyweight</strong></td>
      <td>Share common state between objects</td>
      <td>Reduces memory footprint</td>
      <td>Many similar objects needed</td>
    </tr>
    <tr>
      <td><strong>Proxy</strong></td>
      <td>Control access to another object</td>
      <td>Lazy initialization and access control</td>
      <td>Controlling resource access</td>
    </tr>
  </tbody>
</table>

---

## 📂 Project Structure

```
Structural-Design-Patterns/
│
├── 📁 AdapterDesignPattern/          # Convert interface of class
│   ├── MediaAdapter.java
│   ├── AudioPlayer.java
│   └── MediaPlayer.java
│
├── 📁 BridgeDesignPattern/           # Decouple abstraction & implementation
│   ├── Shape.java
│   ├── Color.java
│   └── implementations/
│
├── 📁 CompositeDesignPattern/        # Tree structures
│   ├── Component.java
│   ├── Leaf.java
│   └── Composite.java
│
├── 📁 DecoratorDesignPattern/        # Add behavior dynamically
│   ├── Component.java
│   ├── ConcreteComponent.java
│   └── decorators/
│
├── 📁 FacadeDesignPattern/           # Unified interface
│   ├── Facade.java
│   └── subsystems/
│
├── 📁 FlyweightPattern/              # Share common state
│   ├── FlyweightFactory.java
│   └── ConcreteFlyweight.java
│
├── 📁 ProxyDesignPattern/            # Control access
│   ├── Subject.java
│   ├── RealSubject.java
│   └── ProxySubject.java
│
└── README.md                          # This file
```

---

## 🚀 Quick Start

### Prerequisites
- Java 8 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)
- Basic understanding of OOP concepts

### Clone the Repository

```bash
git clone https://github.com/DipankarSethi3012/Structural-Design-Patterns.git
cd Structural-Design-Patterns
```

### Running Examples

```bash
# Compile
javac AdapterDesignPattern/*.java

# Run
java AdapterDesignPattern.AudioPlayer
```

---

## 📖 Detailed Pattern Documentation

### 1️⃣ Adapter Pattern 🔌

**Intent:** Convert the interface of a class into another interface clients expect.

**Problem Scenario:**
```
You have a legacy class with one interface, but your new code expects a different interface.
```

**Solution:**
```java
public interface MediaPlayer {
    void play(String audioType, String fileName);
}

public class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;
    
    @Override
    public void play(String audioType, String fileName) {
        // Convert interface and delegate
    }
}
```

**When to Use:**
- ✅ Integrating with legacy systems
- ✅ Using third-party libraries with different interfaces
- ✅ Creating a unified interface for multiple implementations

---

### 2️⃣ Bridge Pattern 🌉

**Intent:** Decouple an abstraction from its implementation.

**Problem Scenario:**
```
You have a class that can vary in two dimensions independently.
```

**Key Concept:**
```
Abstraction ──────> Implementation
    ↓                    ↓
  Color                Shape
  (Refined)         (Concrete)
```

**When to Use:**
- ✅ Multiple independent variations needed
- ✅ Want to avoid permanent binding
- ✅ Changes in one shouldn't affect the other

---

### 3️⃣ Composite Pattern 🌲

**Intent:** Compose objects into tree structures.

**Problem Scenario:**
```
You need to represent part-whole hierarchies in a tree structure.
```

**Example Use Cases:**
- 📂 File system (folders containing files/folders)
- 🎨 GUI component hierarchies
- 📋 Document structures

---

### 4️⃣ Decorator Pattern 🎀

**Intent:** Attach additional responsibilities to an object dynamically.

**Problem Scenario:**
```
You want to add features to objects without modifying their structure.
```

**Advantages:**
- ✅ More flexible than subclassing
- ✅ Avoids class explosion
- ✅ Responsibilities can be combined at runtime

---

### 5️⃣ Facade Pattern 🏛️

**Intent:** Provide a unified interface to a set of interfaces in a subsystem.

**Problem Scenario:**
```
Complex subsystem has many interdependent components.
```

**Benefits:**
- ✅ Decouples client from subsystem
- ✅ Reduces dependencies
- ✅ Makes system easier to use

---

### 6️⃣ Flyweight Pattern 🪶

**Intent:** Use sharing to support large numbers of fine-grained objects efficiently.

**Problem Scenario:**
```
Application creates many similar objects consuming excessive memory.
```

**Memory Optimization:**
```
Before:  1000 objects = 1000 × size
After:   1000 objects = intrinsic state × shared + extrinsic state
```

---

### 7️⃣ Proxy Pattern 🔐

**Intent:** Provide a surrogate or placeholder for another object.

**Use Cases:**
1. 🔄 **Remote Proxy** - Represents remote object
2. 💾 **Virtual Proxy** - Lazy initialization
3. 🔒 **Protection Proxy** - Access control
4. 📝 **Logging Proxy** - Record method calls

---

## 💡 Examples

### Adapter Pattern Example

```java
// Old interface
class OldAudioPlayer {
    public void playMP3(String file) { }
}

// New interface expected
interface NewMediaPlayer {
    void play(String format, String file);
}

// Adapter
class AudioAdapter implements NewMediaPlayer {
    private OldAudioPlayer oldPlayer = new OldAudioPlayer();
    
    @Override
    public void play(String format, String file) {
        if ("MP3".equals(format)) {
            oldPlayer.playMP3(file);
        }
    }
}
```

### Decorator Pattern Example

```java
interface Coffee {
    double cost();
    String description();
}

class SimpleCoffee implements Coffee {
    @Override
    public double cost() { return 2.0; }
    @Override
    public String description() { return "Coffee"; }
}

class MilkDecorator implements Coffee {
    private Coffee coffee;
    
    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    
    @Override
    public double cost() { return coffee.cost() + 0.5; }
    @Override
    public String description() { 
        return coffee.description() + ", Milk"; 
    }
}

// Usage
Coffee coffee = new MilkDecorator(
    new ChocolateDecorator(new SimpleCoffee())
);
```

---

## 📊 Pattern Comparison Matrix

| Pattern | Complexity | Memory | Flexibility | Runtime |
|---------|-----------|--------|-------------|---------|
| Adapter | Low | Low | Medium | No |
| Bridge | Medium | Medium | High | No |
| Composite | Medium | Medium | High | Yes |
| Decorator | Medium | Low | High | Yes |
| Facade | Low | Low | Low | No |
| Flyweight | High | Very Low | Low | No |
| Proxy | Medium | Medium | Medium | Yes |

---

## ✅ Best Practices

### Do's ✅

- ✅ Use patterns to solve **real problems**, not for the sake of it
- ✅ **Document** why you're using a particular pattern
- ✅ Keep pattern implementations **simple and understandable**
- ✅ **Combine patterns** when it makes sense
- ✅ **Refactor** code to patterns incrementally

### Don'ts ❌

- ❌ Over-engineer with unnecessary patterns
- ❌ Use patterns to hide poor design
- ❌ Ignore code readability for pattern purity
- ❌ Force-fit patterns into unrelated problems
- ❌ Create complex inheritance hierarchies

---

## 🔗 Resources

### 📚 Books
- "Design Patterns: Elements of Reusable Object-Oriented Software" - Gang of Four
- "Head First Design Patterns" - Freeman & Robson
- "Refactoring: Improving the Design of Existing Code" - Martin Fowler

### 🎓 Online Resources
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)
- [Oracle Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [Design Patterns Explained Simply](https://www.youtube.com/playlist?list=PLrhzvIcii6GNrzfy_K5srQQA3-f20tILH)

### 📖 Documentation
- UML Diagrams for each pattern
- Real-world use cases
- Performance considerations

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Contribution Ideas
- 💻 Add more implementation examples
- 📝 Improve documentation
- 🐛 Fix bugs and issues
- 🎨 Add visual diagrams
- 🧪 Add unit tests

---

## 📝 License

This project is open source and available under the MIT License.

---

## 👨‍💻 Author

**Dipankar Sethi**
- GitHub: [@DipankarSethi3012](https://github.com/DipankarSethi3012)

---

## ⭐ Show Your Support

Give a ⭐ if this project helped you! Your support motivates us to create better content.

---

<div align="center">

**Happy Learning! 🚀**

*Master Design Patterns and Write Better Code*

[⬆ Back to Top](#-structural-design-patterns)

</div>
