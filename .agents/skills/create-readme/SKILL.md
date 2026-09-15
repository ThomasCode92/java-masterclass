---
name: create-readme
description: Generates a README file for a module.
---

# Create README File

This skill generates a README file for a specific module, including sections
describing what is covered and the structure of the module.

## Information Gathering

Before creating the README file, you need to gather information about the
module, such as its purpose, features, installation instructions, usage
examples, and any other relevant details. This information can be obtained from
inspecting:

- Commit messages/ Git history
- Java source code
- File structure
- Existing documentation

### Organize Folders

If you find that the module has a complex folder structure or a couple of folder
should be grouped to gether, come up with a logical organization and ask the
user for confirmation before making changes. If the user agrees, proceed with
the reorganization and provide a brief description of each folder's purpose in
the README file.

## Create README File

**IMPORTANT:** Use the following template. The README file must **strictly
match** the structure and format provided. Do not deviate from the template
format.

### The Template

The template can be found [here](./readme.md).

When filling out the template:

- Replace `MODULE TITLE` with the actual course module name.
- Fill in all sections with relevant information gathered
- When using bullet point, add one (relevant) emoji per point to enhance
  readability When describing the project structure, use this as an example:
- When listing the subfolders in the project structure, provide a brief
  description of each folder's purpose.

```text title="Example Project Structure"
- **classes-constructors/**:
  - `Classes`: Introduction to class definitions and objects.
  - `BankAccount`: Practice with fields, methods, and encapsulation.
  - `CustomerData`: Deep dive into constructors and constructor chaining.
  - `Records`: Exploring the modern Record type in Java.
```

### Creating the README File

Add the README file to the correct module folder, typically named `README.md`.
Ensure it follows the template structure and includes all relevant information
gathered during the information gathering phase.

## Post-Creation

After creating the README file:

1. **Verify the content**: Ensure all sections are filled out correctly and the
   information is accurate.
2. **Check formatting**: Make sure the markdown formatting is consistent and
   renders correctly.
3. **Suggest next steps**: Ask the user to review the README file and provide
   feedback or additional information if necessary. When the user is satisfied,
   proceed with committing the README file.

### Committing the README File

1. **Commit the README**: Commit the README file to the module's repository.

```bash
git add <module>/README.md
git commit -m "Add README for <module>"
```

2. **Push the changes**: Push the commit to the remote repository.

```bash
git push origin HEAD
```
