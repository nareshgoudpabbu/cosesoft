let balance = 10000;

function updateBalance(){
document.getElementById("balance").innerText = balance;
}

function depositMoney(){

let amount =
parseFloat(document.getElementById("amount").value);

if(amount > 0){

balance += amount;

updateBalance();

document.getElementById("message").innerHTML =
"✅ ₹" + amount + " Deposited Successfully";

}
}

function withdrawMoney(){

let amount =
parseFloat(document.getElementById("amount").value);

if(amount > balance){

document.getElementById("message").innerHTML =
"❌ Insufficient Balance";

}
else if(amount > 0){

balance -= amount;

updateBalance();

document.getElementById("message").innerHTML =
"💸 ₹" + amount + " Withdrawn Successfully";

}
}

function checkBalance(){

document.getElementById("message").innerHTML =
"💰 Current Balance: ₹" + balance;

}
