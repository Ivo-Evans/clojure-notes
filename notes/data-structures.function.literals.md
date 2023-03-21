---
id: kggvxt8mmaouf2fddetvs5c
title: Literals
desc: ''
updated: 1678991095920
created: 1678723596968
---

There are lots of ways to create functions:

```clojure
(defn add-v1 [& rest] (apply + rest))
(defn add-v2 "same as v1 but with a docstring" [& rest] (apply + rest))
(defn- add-v3 [& rest] (apply + rest))
(fn add-v4 [& rest] (apply + rest))
(fn [& rest] (apply + rest))
#(apply + %&)
```

Of these, __only__ `defn` and `defn-` functions are practical for creating frequently reused functions. The `(fn name args body)` syntax creates the `name` inside the function's closure, so it is only useful for recursion.

Therefore, broadly speaking, we can break these function types down into named functions and anonymous functions, where `defn` and `defn-` functions are named and `fn` and `#` functions are anonymous. 

A `defn-` function differs from a `defn` function in that a `defn-` function is marked as private to its namespace. 

`#` functions are similar to `fn` functions. In a `#` function, use `%n` to access the argument list (`%0`, `%1` etc.) and `%&` to access the rest.

Another difference between `#` and `fn` functions is that the `fn` syntax creates a free space for any expressions, but the `#` syntax requires that its body is a single expression:

```clojure
#(* 2 2)
(fn [] (* 2 2)) ;; note the nested parentheses
```

As a result, `#` functions which simply return values, without doing anything to them, don't work

```clojure
(#(4)) ;; java.lang.Long cannot be cast to clojure.lang.IFn
```


Functions also create new [[scope.closures]].