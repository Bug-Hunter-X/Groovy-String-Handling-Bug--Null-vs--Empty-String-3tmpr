```groovy
def someMethod(String param) {
  if (param == null || param.isEmpty()) {
    return ""
  } else {
    return param.toUpperCase()
  }
}

println someMethod(null)
println someMethod("")
println someMethod("hello")
```