---
id: il7pcqx2iody1cljqku486i
title: Building
desc: ''
updated: 1681312344050
created: 1681309561936
---

You can override the options Lein passes to the JVM and the Clojure compiler by adding to the `:jvm-opts` key in the `project.clj`:

```clojure
:jvm-opts [
    ; jvm memory allocation
    "-Xmx1g"

    ; some Clojure option
    "-Dclojure.compiler.disable-locals-clearing=true"]
```

You can build a project with `lein uberjar`, which will create an executable `jar` file. Unqualified, `lein uberjar` will compile the `:main` namespace in your `project.clj`, as so:

```clojure  :uberjar-name "mobiles-s3-url-signing-service.jar"

  :main     my-app.core
```

The `jar` filename will be based on this namespace and use the version number, unless you specify `:uberjar-name` in your `project.clj`:

```clojure
:uberjar-name "foobar.jar"
```

The `my-app.core` namespace needs to contain a `-main` function, which is called when the uberjar is invoked. 

You can make an uberjar for any namespace in your app. If you want to make an uberjar for an arbitrary namespace, run `lein uberjar -m <namespace>`. The namespace should contain a `-main` function. 