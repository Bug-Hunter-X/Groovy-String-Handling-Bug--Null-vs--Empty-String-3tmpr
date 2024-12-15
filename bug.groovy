```groovy
def someMethod(String param) {
  if (param == null) {
    return "null"
  } else {
    return param.toUpperCase()
  }
}

println someMethod(null)
println someMethod("")
println someMethod("hello")
```