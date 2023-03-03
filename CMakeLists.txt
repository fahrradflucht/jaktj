cmake_minimum_required(VERSION 3.20)
project(jaktj
   VERSION 1.0.0
   LANGUAGES CXX
)

find_package(Jakt REQUIRED)

add_jakt_executable(jaktj
   MAIN_SOURCE src/main.jakt
   MODULE_SOURCES
      src/attribute_info.jakt
      src/class_file_parser.jakt
      src/field_info.jakt
      src/method_info.jakt
)
