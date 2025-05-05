#!/bin/bash

echo "� Compiling test and source files..."
javac -cp ".;junit-4.12.jar;hamcrest-core-1.3.jar" ItemManager.java ItemManagerTest.java

if [ $? -ne 0 ]; then
  echo "❌ Compilation failed. Fix the errors above and re-run."
  exit 1
fi

echo "✅ Compilation successful."
echo "� Running tests..."
java -cp ".;junit-4.12.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ItemManagerTest
