---
id: 96ivv51zii0f8btp1qtzuvw
title: Ns Macro
desc: ''
updated: 1681490509236
created: 1681486953628
---

`ns` has this form

```clojure
(ns
name ; unquoted text - a symbol
docstring ; a string
attr-map ; options
& references ; used for imports
)
```

`attr-map` is for configuring the namespace metadata. Mostly, you'll be concerned with references.

## ns references

`references` is an arbitrary number of s-expressions, each of which should begin with one of the keywords, 

- `:refer-clojure`
- `:require`
- `:use` (deprecated in favour of `:require` with its `:refer` option)
- `:import`
- `:load`
- `:gen-class` 

Each of these keywords corresponds directly to a function which is invoked by the `ns` macro. For instance, if you give `ns` `(:gen-class)`, `ns` will call `(gen-class)`.

It's syntactically acceptable but not idiomatic to have repeats. Prefer one `:require` with n arguments to n `:require`s with 1 argument.

Let's go over some use cases to see when you might want to use each keyword:

### You want to import a namespace, and use it as a symbol

```clojure
(ns foo.bar
  (:require clojure.string
            [clojure.set :as set]))

(clojure.string/upper-case "foobar")
(set/union #{:a :b} #{:a :c} #{:b :d})
```

### You want to import items from a namespace, and use them as symbols

```clojure
(ns foo.bar
  (:require [clojure.string :refer [upper-case lower-case]]
            [clojure.set :refer :all]))

(upper-case "foobar")
(lower-case "doombar")
(union #{:a :b} #{:a :c} #{:b :d})
```

### You want to import a Java Class, a defrecord or a deftype

```clojure
(ns pirate.talk
  (:import [java.util Date Stack]))
```

See also [[interop.java.importing-packages]].

### You want a Java class to be created when you compile the namespace

```clojure
(ns server.index (:gen-class))
```

### You want to load Clojure code by filepath instead of namespace

Look into [`:load`](https://clojuredocs.org/clojure.core/load)

### You want to override the way the `ns` macro `require`s Clojure

Look into `:refer-clojure`
