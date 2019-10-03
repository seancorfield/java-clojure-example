# Combining Java and Clojure in a deps.edn project

`deps.edn` has alias to compile Java code.

It also has folder tree containing (compiled) `.class` files in `:paths`.

This command compiles the Java code and then runs the Clojure code:

```bash
clj -A:compile -m my.main
```
