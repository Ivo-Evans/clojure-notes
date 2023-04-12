---
id: 7r36hllt7ctf03u7notgvxs
title: Profiles
desc: ''
updated: 1681312521754
created: 1681311162355
---

Lein uses the concept of `profiles` to let you achieve different behaviour. 
Profiles are specified in `project.clj` or, if present, a `profiles.clj`. 

Profiles are a surprisingly complex topic. There are number of default profiles, including `dev` and `uberjar`, which are applied in certain circumstances.

You can also apply a profile by using the `with-profile` subcommand:

```bash
lein with-profile foo run -m server.index # run the main function from server.index with the profile `foo`
```

Importantly, when you run a profile, it is merged into the map of other applied profiles. Order of declaration within a file determines priority in case of conflicts. If two profiles have the same name, they are not merged into each other - one is picked. 

A `lein` profile, as far as I can see, can be used to add to and override any part of the project configuration, most importantly dependencies and options, like uberjar location. 
