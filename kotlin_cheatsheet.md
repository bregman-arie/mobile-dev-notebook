## Kotlin Examples

* Hello World

```
fun main() {
    // this is a comment
    println("Hello world!")
}
```

### Variables

```
val a: Int = 1
val b = 2
val c: Int
c = 3 
d = null
```

```
/* When using `val` you can't change the variable later.
   If you need to change it, use `var` */
var x = 3
x += 1
```

### String Templates

```
var x = 1
val y = "x is $x" 
```

### Conditionals

```
fun getMax(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}
```

Or as an expression:

```
fun getMax(a: Int, b: Int) = if (a > b) a else b
```

Return null if x is not an Integer

```
fun get(x: String): Int? {
    // ...
}
```

### Functions

* Sum of two numbers

```
fun sum(a: Int, b: Int): Int {
    return a + b
}
```
OR
```
fun sum(a: Int, b: Int) = a + b
```

### Loops

for loops

```
val items = listOf("x", "y", "z")
for (item in items) {
    println(item)
}
```

while

```
val items = listOf("x", "y", "z")
var i = 0
while (i < items.size) {
    println("item is ${items[i]}")
    i++
}
```

### when

### Ranges

### Collections

* Iterating over a collection

```
for (item in items) {
    println(item)
}
```

* Check if a collection contains an item

```
when {
    "witcher" in items -> println("good game")
    "smb" in items -> println("smb is the best")
}
```

* Filter and map collections

```
val games = listOf("smb", "starcraft", "witcher")
games
  .filter { it.startsWith("g") }
  .sortedBy { it }
  .map { it.toUpperCase() }
  .forEach { println(it) }
```

### Classes

Create an instance

```
val rectangle = Rectangle(9.0, 8.0)
```
