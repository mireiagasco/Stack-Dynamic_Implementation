# Dynamic Implementation Of A Stack

This implementation of a stack has been built using Java and generics, so it can be used with custom objects.  It is based upon a Node class, which contains the data that has to be stored (data) and a reference to the node below it in the stack (nextNode).  The stack itself consists of a reference to the top node (top) and an integer that indicates the total height of the stack (numElem).

The methods implemented are the following:\
-> Constructor: creates an empty stack.\
-> Push: adds a new element to the stack. The element must be indicated as an argument.\
-> Pop: removes and returns the element on the top of the stack.\
-> Empty: returns a boolean indicating if the stack is empty or not.\
-> Size: returns an integer indicating the size of the stack.\
-> Peek: returns the element on the top of the stack without removing it.\

The exceptions used are:\
-> StackIsEmpty: in case the pop() or peek() methods cannot get the element on the top because the stack is empty.

