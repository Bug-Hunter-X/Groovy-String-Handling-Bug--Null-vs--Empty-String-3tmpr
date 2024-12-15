# Groovy String Handling Bug

This repository demonstrates an unexpected behavior when handling null and empty strings in a Groovy method.  The `someMethod` function aims to convert a string to uppercase, but its handling of null and empty string inputs is flawed.

## Bug Description
The provided Groovy code exhibits unexpected behavior when passed an empty string (""). It should ideally return an empty string, but instead, it throws a `NullPointerException`.

## Solution
The solution involves adding explicit checks for empty strings in addition to null checks.