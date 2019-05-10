(()=>{
    var cards = document.querySelector("#cards");
    cards = document.getElementById("cards")

    var card1 = document.createElement("div");
    card1.classList.add("card");
    card1.innerText= "HELLO ITS ME";
    cards.appendChild(card1);
})();