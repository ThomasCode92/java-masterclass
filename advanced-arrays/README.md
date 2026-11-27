# 🎓 Mastering Java: Advanced Arrays

## 📚 What is Covered?

This module explores Java arrays beyond the basics, covering declaration,
initialization, multi-dimensional and jagged arrays, the `java.util.Arrays`
utility class, array references, and variable arguments (`varargs`).

- Declaring, initializing, and accessing arrays with `length`, loops, and default values.
- Using `Arrays` to sort, fill, copy, print, search, and compare arrays.
- Understanding array references, aliasing, and how method calls can mutate arrays.
- Working with 2D, jagged, and 3D arrays using nested loops and `deepToString()`.
- Defining `varargs` methods and converting between arrays and variable arguments.
- Practicing descending sorts, minimum-value searches, and in-place reversals.

## 🏗️ Project Structure

The project is organized into several subfolders, each focusing on a specific
topic:

- **ArrayReferences/**:
  - `Main`: Reference vs. value behavior — aliasing an array, mutating it through another variable, and passing it to a method.
- **ArraysProject/**:
  - `Main`: Declaring, initializing, indexing, and looping over arrays, plus treating arrays as `Object` and `Object[]` values.
- **MultipleArrays/**:
  - `Main`: 2D, jagged, and 3D arrays; nested traversal; `Arrays.deepToString()`; and heterogeneous `Object[]` arrays.
- **UsingArrays/**:
  - `Main`: `Arrays.sort()`, `fill()`, `copyOf()`, `binarySearch()`, and `equals()` on primitive and `String` arrays.
- **VarArgs/**:
  - `Main`: Variable-argument methods, `split()`, `String.join()`, and `String.repeat()`.
- **challenges/**:
  - `ArrayChallenge`: Generate random values and manually sort them in descending order.
  - `ImplementMinFinder`: Read user input and find the smallest value in an array (`MinFinder`).
  - `MinimumElementChallenge`: Parse comma-separated input, find the minimum, and reverse an array in place or into a copy (`Main`).
  - `ReverseArray`: Reverse an array in place with a temporary-variable swap loop (`ReverseArray`).
  - `SortIntegersDescending`: Read, print, and sort integers descending with a reusable `SortedArray` helper class (`Main`).
