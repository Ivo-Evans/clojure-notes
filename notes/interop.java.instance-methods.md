---
id: ny17qu6jit9rshavdmjo3gd
title: Instance Methods
desc: ''
updated: 1681400576254
created: 1681400339157
---

You can use a macro over the dot operator:

```clojure
(.indexOf "Let's synergize our bleeding edges" "y")
```

translates to this Java code:

```java
"Let's synergize our bleeding edges".indexOf("y")
```