# How to add a collapsible section in markdown
## 1. Example
<details>
  <summary>Click me</summary>

  ### Heading
  1. Foo
  2. Bar
     * Baz
     * Qux

  ### Some Javascript
  ```js
  function logSomething(something) {
    console.log('Something', something);
  }
  ```
</details>


## 2. Code/Markdown
````md
<details>
  <summary>Click me</summary>
  
  ### Heading
  1. Foo
  2. Bar
     * Baz
     * Qux

  ### Some Javascript
  ```js
  function logSomething(something) {
    console.log('Something', something);
  }
  ```
</details>
````

## 3. Tips & Tricks

### 3.1 Expand by Default
To have a collapsible section expanded by default, simply include the 'open' attribute within the `<details>` tag:

<details open>
  <summary>Hello</summary>
  World!
</details>

```
<details open>
  <summary>Hello</summary>
  World!
</details>
```

### 3.2 Customize Clickable Text
You can modify the appearance of the clickable text by adding styling inside the `<summary>` tags:

<details>
  <summary><i>Wow, so fancy</i></summary>
  <b>WOW, SO BOLD</b>
</details>

```
<details>
  <summary><i>Wow, so fancy</i></summary>
  <b>WOW, SO BOLD</b>
</details>
```

### 3.3 Nested Collapsible Sections
NB: When including headings within collapsible sections, remember to add a new line after the `<summary>` tag.

<details>
<summary>Section A</summary>
<details>
<summary>Section A.B</summary>
<details>
<summary>Section A.B.C</summary>
<details>
<summary>Section A.B.C.D</summary>
  Done!
</details>
</details>
</details>
</details>

```
<details>
<summary>Section A</summary>
<details>
<summary>Section A.B</summary>
<details>
<summary>Section A.B.C</summary>
<details>
<summary>Section A.B.C.D</summary>
  Done!
</details>
</details>
</details>
</details>
```
