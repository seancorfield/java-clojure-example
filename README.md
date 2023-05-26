# Combining Java and Clojure in a deps.edn project

> Updated 5/26/2023 to use `build.clj`.

The Clojure source code is in `clj/src`.
The Java source code is in `java/src`.


`deps.edn` puts both `clj/src` and `target/classes` on the classpath,
and it has a `:build` alias for `tools.build` usage.

`build.clj` has a `compile-java` function that compiles the Java code
into `target/classes` and a `run` function that runs the Clojure code
(after compiling the Java code).

This command compiles the Java code and then runs the Clojure code:

```bash
clojure -T:build run
```

You can compile the Java code as a single step with:

```bash
clojure -T:build compile-java
```

Once the Java code has been compiled, you can run the Clojure code
with:

```bash
clojure -M -m my.main
```
