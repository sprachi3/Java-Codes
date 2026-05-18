#include <iostream>
using namespace std;

class Wallet {
private:
    int balance = 0;
public:
    friend class FinancialAnalyst;
};

class FinancialAnalyst {
public:
    void displayBalance(Wallet& wallet) {
        cout << "Current balance: $" << wallet.balance << endl;
    }
};

int main() {
    Wallet myWallet;
    FinancialAnalyst analyst;
    analyst.displayBalance(myWallet);
    return 0;
}