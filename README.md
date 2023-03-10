# jaktJ

A toy JVM class file parser written in [Jakt](https://github.com/SerenityOS/jakt).

## Motivation

The main purpose of this project is to get a feel for using Jakt. A class file
parser felt like something that is easy, and at the same time big enough so that
one can get a feel for the language without getting lost in the sample problem.

## Building with jakt

```console
jakt src/main.jakt -o jaktj
```

## Building with CMake

Make sure to install the ``jakt`` compiler somewhere. For example, ``/path/to/jakt-install``.

This can be done by cloning ``jakt``, and running the following commands from its directory:

```console
jakt> cmake -GNinja -B build -DCMAKE_CXX_COMPILER=clang++ -DCMAKE_INSTALL_PREFIX=/path/to/jakt-install
jakt> cmake --build build
jakt> cmake --install build
```

Next you can build this project by configuring CMake to know where to find the ``jakt`` cmake helper scripts.

```console
> cmake -GNinja -B build -DCMAKE_CXX_COMPILER=clang++ -DCMAKE_PREFIX_PATH=/path/to/jakt-install
> cmake --build build
```

## Running the application

After building, the program will be in the `build` directory.

```console
> ./build/jaktj samples/hello_world/Main.class
```

This will (more or less) pretty print the class file content to stdout.

## License

Copyright: Mathis Wiehl and contributors 2023; Licensed under the EUPL, with
extension of article 5 (compatibility clause) to any licence for distributing
derivative works that have been produced by the normal use of the Work as a
library.

