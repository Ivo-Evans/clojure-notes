---
id: z6m7ouny4b8almzj11kcnmw
title: Keywords and Symbols
desc: ''
updated: 1679428328834
created: 1679426886779
---


Keywords are primarily used as constant string-like objects, e.g. for the keys of hashmaps. You can construct keyword with `:` or `::`:

```clojure
:foo ; :foo
::foo ; :user/foo - creates the keyword in the current namespace
```

You can also use the `keyword` function:

```clojure
(keyword "foo")
(keyword "user" "foo")
```


Symbols are primarily used for bindings in lexical scopes. You can create a symbol at any time using the `'` character or the `symbol` function:

```clojure
(let [foo 'bar] (println foo 'bar (= foo (symbol "bar"))))
;; prints bar bar true
```

In the example above, `foo` is also a symbol.

Both keywords and symbols implement `iFn`. This does not mean they are functions, but they can be called as functions. (relatedly there are separate functions `fn?` and `ifn?`, the former of which returns true for a subset of inputs.)  

The significance of this is that symbols and keys can be placed in the calling position of an s-expression, and when passed maps from the second position, work the same way as the `get` function:


```clojure 
(def my-map {:foo 1 'bar 2})

(:foo my-map) ; 1
('bar my-map) ; 2

(get my-map :foo) ; 1
(get my-map 'bar) ; 2

(my-map :foo) ; 1
(my-map 'bar) ; 2
```