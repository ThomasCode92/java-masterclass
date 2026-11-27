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
|------------------------------|---------------------------------------------------------|-----------------------------------------------|
| OOP: Classes and Inheritance | Classes, Constructors, Inheritance, and String handling | [README](./oop-classes-inheritance/README.md) |
| OOP: Advanced Techniques     | Composition, Encapsulation, Polymorphism, and Packages  | [README](./advanced-oop-techniques/README.md) |
| Advanced Arrays              | Array Basics, Utilities, References, and varargs        | [README](./advanced-arrays/README.md)          |

### 🔢 Multiple Java Projects

This repository is a collection of small, focused Java projects rather than a
single application. Projects are grouped by topic so that each example can be
opened, run, and studied independently.

#### 📁 How Projects Are Organized

- **Topic folders** group related lessons, for example `inheritance` or `text-strings`.
- **Project folders** contain the source for one single project in a `src/` directory with a `Main.java` entry point.
- **Challenges** contain exercises that apply several concepts together, grouped in a module's `challenges/` directory.
- Each module README documents the projects and the Java concepts covered.

#### ▶️ Running a Project

1. Open the repository in [IntelliJ IDEA](https://www.jetbrains.com/idea/).
2. Open the project folder you want to explore.
3. Select the `Main` class and run it from the editor.

The projects use IntelliJ IDEA's build system and Java 17. Generated output
folders such as `bin/` and `out/` are ignored by Git, so only the source and
project configuration need to be retained.

## 🤖 AI Usage

### 🧠 Skills

The repository has a couple of Skills that AI agents can use to help with a
couple of tasks. The Skills are located in the [.agents](./.agents) folder.

- `/create-pull-request`: Create a pull-request for the current branch.
- `/create-readme`: Create a README.md file for a module.

### 🦺 Agent Harness

The `opencode.json` file in the root of the repository contains the
configuration for [OpenCode](https://opencode.com/). It adds the
[Ollama Cloud](https://ollama.com/) provider to OpenCode.

Before opening OpenCode, make sure to set the `OLLAMA_API_KEY` environment
variable with your Ollama API key.

```shell
export OLLAMA_API_KEY=<your-ollama-api-key>
```
