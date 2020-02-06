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
```

```
/* When using `val` you can't change the variable later.
   If you need to change it, use `var` */
var x = 3
x += 1
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
