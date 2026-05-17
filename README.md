Age Validation Using Custom Exception in Java

## Description
This Java program demonstrates the use of user-defined exceptions for validating age input. The program accepts age as a command-line argument and checks whether the entered age is below 18. If the condition is true, a custom exception named `Age` is thrown and handled using a `try-catch` block.

The program helps in understanding:
- Custom Exception Handling
- Classes and Objects
- Inheritance
- Command-Line Arguments
- Try, Throw, and Catch Blocks

## 2. GUI Dial Pad Using Java Swing

### Description
This Java program demonstrates the development of a simple GUI-based dial pad application using Java Swing and AWT event handling. The application contains numeric buttons from 0–9, a clear button, and a call button. Users can enter numbers into a text field by clicking the buttons.

The program uses `JFrame`, `JButton`, `JTextField`, `GridLayout`, and `ActionListener` to create an interactive graphical user interface. The call button changes its label to “Hang up” when pressed and resets the interface when pressed again.

This program helped in understanding GUI development, event handling, layout management, button actions, and Java Swing components.

### Concepts Used
- Java Swing
- GUI Programming
- Event Handling
- ActionListener
- JFrame and JButton
- Layout Management

### Compilation
```bash
javac GUI1.java
```

### Execution
```bash
java GUI1
```

### Features
- Numeric Dial Pad
- Interactive Buttons
- Call and Hang Up Functionality
- Text Field Display
- GUI Layout using GridLayout

## 3. Temperature Converter Using Java Swing

### Description
This Java program demonstrates the development of a GUI-based Temperature Converter using Java Swing and AWT event handling. The application allows users to enter temperature values in Celsius and convert them into Fahrenheit by clicking the convert button.

The program uses components such as `JFrame`, `JTextField`, `JButton`, and `JLabel` to create an interactive graphical user interface. Event handling is implemented using the `ActionListener` interface to perform the temperature conversion operation when the button is clicked.

The application also demonstrates the use of layout positioning, window handling, and exception handling concepts in Java GUI programming. Through this program, I improved my understanding of Swing components, event-driven programming, user interaction handling, and Java GUI development.

### Concepts Used
- Java Swing
- GUI Programming
- Event Handling
- ActionListener
- JFrame, JButton, JLabel, JTextField
- Exception Handling
- Layout Management

### Compilation
```bash
javac P1.java
```

### Execution
```bash
java P1
```

### Features
- Celsius to Fahrenheit Conversion
- Interactive GUI Interface
- Button Click Event Handling
- User Input through Text Fields
- Simple and User-Friendly Design

## 4. Sum of Numbers Using StringTokenizer in Java

### Description
This Java program demonstrates the use of `StringTokenizer` for processing and extracting numeric values from a string. The program accepts a line of input containing numbers separated by spaces and calculates their total sum.

The application uses the `Scanner` class to read user input and `StringTokenizer` to divide the string into individual tokens. Each token is converted into an integer using `Integer.parseInt()` and added to the total sum using a loop.

Through this program, I applied concepts such as string processing, tokenization, loops, input handling, and type conversion in Java. The program helped me improve my understanding of handling user input, manipulating strings, and performing arithmetic operations efficiently.

### Concepts Used
- Scanner Class
- StringTokenizer
- Loops
- String Processing
- Integer Conversion
- User Input Handling

### Compilation
```bash
javac Sum.java
```

### Execution
```bash
java Sum
```

### Sample Input
```bash
10 20 30 40
```

### Output
```bash
sum is : 100
```

### Features
- Accepts Multiple Numbers in a Single Line
- Tokenizes Input String
- Calculates Total Sum
- Simple Console-Based Application
