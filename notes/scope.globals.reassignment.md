---
id: 1zrujnkdw69f4czj62ymprz
title: Reassignment
desc: ''
updated: 1678726096295
created: 1678723752502
---

In Clojure, everything is global to its namespace unless it has been created in a new lexical scope. 

When you use `def` or `defn`, as in these code examples, the values can be freely reassigned. 

```clojure
(defn foobar [] 5)
(defn mutator [] (defn foobar [] 6))
(println (foobar)) ;; 5
(mutator)
(println (foobar)) ;; 6
```

```clojure
(def foo 10)
(defn mutator [] (def foo 20))
(println foo) ;; 10
(mutator)
(println foo) ;; 20
```

