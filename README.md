🏦 Bank Account System (Core Java)
📌 Project Description

This is a simple Core Java project that demonstrates Object-Oriented Programming (OOP) concepts like:

Inheritance
Class & Object usage
Method implementation

The project simulates basic bank account details and debit card details of a customer.

🚀 Features
Display Account Holder Details
Display Bank Account Information
Display Debit Card Details
Demonstrates Inheritance in Java
🧠 Concepts Used
Classes & Objects
Inheritance (extends)
Method Calling
Data Members
🏗️ Project Structure
bankAprill/
│
├── accholderDetails   → Base class (Account holder info)
├── accountdetails     → Child class (Bank account info)
├── debitcardDetails   → Child class (Debit card info)
└── Main               → Main class (Execution starts here)
💻 How It Works
The base class accholderDetails stores:
Name
Address
Two child classes extend it:
accountdetails → Stores account number, IFSC, branch
debitcardDetails → Stores card number, PIN
The Main class:
Creates objects
Calls methods
Displays output
▶️ Sample Output
------welcome------
accountholderName: vineeth
adress: kota
accountNumber: 123456789
ifsc_code: 1234
branch: kota
-----------------------
accountholderName: vineeth
adress: kota
debitcardNumber: 987654321
pin: 12345
--------ok done--------

📈 Future Improvements
Add user input using Scanner
Implement deposit/withdraw features
Add validation for PIN
Store multiple users using ArrayList
Convert into full ATM system
👨‍💻 Author

Vineeth Tumati
Java Developer (Fresher)
