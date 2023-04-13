---
id: ny17qu6jit9rshavdmjo3gd
title: Using Instance Methods
desc: ''
updated: 1681403092118
created: 1681400339157
---

You can use a macro over the dot operator:

```clojure
(.indexOf "Let's synergize our bleeding edges" "y")
```

This example translates to this Java code:

```java
"Let's synergize our bleeding edges".indexOf("y")
```