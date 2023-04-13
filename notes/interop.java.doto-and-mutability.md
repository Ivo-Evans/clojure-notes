---
id: hfxaxnw4mprfa2qllox8awl
title: Doto and Mutability
desc: ''
updated: 1681401358041
created: 1681400911066
---
Clojure provides the `doto` macro to let you work more easily with mutable data structures:

```clojure
(let [stack (java.util.Stack.)]
  (doto stack (.push "First plate") (.push "Second plate"))
  (println stack))
```

Note that this won't work in a repl, as far as I can tell. But it did work inside a namespace run by lein. 