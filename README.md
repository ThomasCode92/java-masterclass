# 🎓 Java Masterclass

Gain real-world experience with OOP, coding exercises, and problem-solving for
job-ready Java development skills.

> This repository contains the code for the
> [Java Masterclass](https://www.udemy.com/course/java-the-complete-java-developer-course/)
> course by Tim Buchalka on Udemy. The course is designed to teach Java
> programming from beginner to advanced levels, covering topics such as
> object-oriented programming (OOP), data structures, algorithms, and more.

## 📝 Course Structure

### 📜 Table of Content

| Module                       | Description                                             | Link                                          |
| ---------------------------- | ------------------------------------------------------- | --------------------------------------------- |
| OOP: Classes and Inheritance | Classes, Constructors, Inheritance, and String handling | [README](./oop-classes-inheritance/README.md) |

### 🔢 Multiple Java Projects

Each Java project folder contains a `.project` file and a `.classpath` file.
These are Eclipse-compatible project descriptors used by the Java extension in
VS Code to recognize and configure standalone Java projects.

- `.project` identifies the folder as a Java project. It declares the project
  name, Java builder, and Java language-server nature.
- `.classpath` defines the Java runtime, the `src` source folder, and the `bin`
  folder where compiled classes are written.

### 🤖 AI Usage

The repository has a couple of Skills that AI agents can use to help with a
couple of tasks. The Skills are located in the [.agents](./.agents) folder.

- `/create-pull-request`: Create a pull-request for the current branch.
- `/create-readme`: Create a README.md file for a project. The README.md file
  will be created in the root of the project folder.
