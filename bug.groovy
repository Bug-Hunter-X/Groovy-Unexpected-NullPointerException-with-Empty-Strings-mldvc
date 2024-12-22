```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null string provided"
  }
  // Some code that processes the string str
}

println myMethod(null) //Correctly prints "Null string provided"
println myMethod("")   // throws NullPointerException, unexpected!
```