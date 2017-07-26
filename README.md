# Multithreading-ChequingAccount

This program mimics a debit card account that may have concurrent transactions between a primary and secondary card holder. Multithreading in this case prevents one transaction from competing with the other and ensures a sequence of withdraw actions is done by one transaction in this program. 
This is accomplished by extending the Thread class and using start(), run(), synchronized method.

Also, the program uses wait() and notify() methods for inter-thread communication. When balance is not sufficient for withdraw, the current thread releases the lock and waiting for deposit. The thread executing deposit will release the lock after deposit.

Please try comment out certain code block to test on the program.
