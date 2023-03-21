---
id: z7r40311sdjgmtosqq19j1e
title: Let Bindings
desc: ''
updated: 1678726509702
created: 1678726069189
---

You can create a new lexical scope for any value using a `let` expression:


```clojure
(println (let [foo 10
               bar (* foo 2)] ;; `bar foo` will work here but `foo bar` won't, because let bindings are not hoisted
           (println foo) ;; 10
           (println bar) ;; 20
           30)) ;; 30
```

As you can see, it ain't pretty. But it get's the job done. 

In the clunkiness of the `let` expression, you can see the language's preference for passing data through chains of functions. 

> It is better to have 100 functions operate on one data structure than to have 10 functions operate on 10 data structures.