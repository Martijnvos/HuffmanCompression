# Huffman compression application
This application consists of a command line interface in order to encode and decode text with the huffman compression 
algorithm.  

You can provide the application with the following parameters:
1. 'encode' or 'decode'
2. The number of words to encode for the performance test when chosen for encode.    
:warning: This parameter CAN NOT be used with decode and expects an integer value!

In case no parameter(s) is/are given, the application will default to encoding the built-in String

# Sonar
The code has been checked with the SonarLint plugin for IntelliJ IDEA.  
This has been done using IntelliJ IDEA 2017.2.2