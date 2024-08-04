package Github.ExceptionHandaling;

public class ExceptionHierarchy {

}

/*

checked exception - compiler force to hande le exception.


Throwable :- (root class)
          1. Exception
          2. Error

1. Exception :-
             (checked exception)
                      1. IO Exception
                              1.1 FileNotFound Exception
                      2. SQL Exception
                      3. ClassNotFound Exception

              (unchecked exception)
                      4.RunTimeException
                             4.1 Arithmetic Exception
                             4.2 NullPointer Exception
                             4.3 NumberFormat Exception
                             4.4 IndexOutOfBound Exception
                                       4.4.1  ArrayIndexOutOfBound Exception
                                       4.4.2  StringIndexOutOfBound Exception

2. Error :-
          1.StackOverFlow Error
          2.OutOfMemory Error
          3.Assertion Error
          4.Unknown Error

*/