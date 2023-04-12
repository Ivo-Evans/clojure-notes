---
id: h9l0fijxq9l8rbqy1nrih9x
title: Dependencies
desc: ''
updated: 1681308912021
created: 1681308682393
---
Dependencies are specified in the `dependencies` field of the `project.clj`. To install a dependency, you only need to add it to the `project.clj`. Next time you run the project, it will install the dependency. If it doesn't for any reason, you can run `lein deps`. 

To find dependencies, you can run `lein search mysql`, or you can browse [clojars](https://clojars.org/) and [maven central](https://central.sonatype.com/?smo=true). 