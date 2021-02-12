# sbt-multimodule-debugging-issue
 Sample project to replicate IntelliJ IDEA issue with Scala debugging.

Steps to reproduce:
1) Place breakpoint at ProjectFoo/src/main/scala/Solution.scala:6
2) Debug test "Concatenate strings" at ProjectFoo/src/test/scala/SolutionTest.scala
3) Observe that execution is paused at Project**Bar**/src/main/scala/Solution.scala:6 instead of the original file