---
id: pa284nmy1k6skqanshonm7s
title: Type Hints
desc: ''
updated: 1678991033455
created: 1678989231212
---

## type hints

Functions can have type hints:

```clojure
(defn round
  [^double d ^long precision]
  (let [factor (Math/pow 10 precision)]
    (/ (Math/floor (* d factor)) factor)))
```

These type hints do not provide compile-time type safety. Instead, they let the compiler apply optimisations, and therefore remove runtime type safety. It is generally recommended that you don't use type hints until you need to.