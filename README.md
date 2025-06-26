# Library Management System

This is a simple Java-based Library Management System that allows basic operations such as adding books, registering users, issuing and returning books, and displaying available or borrowed books.

##  Features

- Add books to the library
- Register users
- Issue books to users (only if available)
- Return books (only if issued and borrowed by the user)
- Display all available books
- Display books borrowed by a user

##  Technologies Used

- Java
- Core Java Concepts (OOPs, Collections - `ArrayList`)

##  Project Structure

- `Book.java`: Contains book attributes and methods to get/set book info.
- `User.java`: Represents a user with methods to borrow, return, and display borrowed books.
- `Library.java`: Contains the central logic for managing users and books.
- `Main.java`: A test class to run the system and demonstrate all functionalities.

##  How to Run

1. Clone the repository or download the `.java` files.
2. Compile all Java files:

    ```bash
    javac *.java
    ```

3. Run the main class:

    ```bash
    java Main
    ```

##  Sample Output

The Alchemist added to the library successfully
1984 added to the library successfully
Clean Code added to the library successfully

Alice added successfully in the DB
Bob added successfully in the DB

Book 'The Alchemist' issued to Alice
Book 'Clean Code' issued to Bob

Book 'The Alchemist' returned by Alice
