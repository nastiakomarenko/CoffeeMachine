# CoffeeMachine
Description
Let's simulate an actual coffee machine. It has a limited supply of water, milk, coffee beans, and disposable cups. Also, it counts how much money it gets for selling coffee. The coffee machine has several options: first, it needs to be able to sell coffee. It can make different varieties of coffee: espresso, latte, and cappuccino. Of course, each variety requires a different amount of supplies, except that all of them require only one disposable cup. Second, the coffee machine should be able to get replenished by a special worker. Third, another special worker should be able to take money from the coffee machine.

It reads one line from the standard input, which can be "buy", "fill", or "take". If you want to buy some coffee, input "buy". If you are a special worker and you think that it is time to fill up all the supplies for the coffee machine, input "fill". If you are another special worker and it is time to take the money from the coffee machine, input "take".

If the user writes "buy" then they must choose one of three varieties of coffee that the coffee machine can make: espresso, latte, or cappuccino.

For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
If the user writes "fill", the program should ask them how much water, milk, coffee, and how many disposable cups they want to add to the coffee machine.

If the user writes "take" the program should give them all the money that it earned from selling coffee.

At the start, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.

