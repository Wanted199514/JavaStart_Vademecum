var plansza = document.getElementById("plotno");
console.log(plansza);

var kontekst = plotno.getContext("2d");
kontekst.strokeStyle = "rgb(255,0,0)";
kontekst.fillStyle = "rgb(0,255,0)";

//kontekst.strokeRect(200,10,10,10);
//kontekst.fillRect(40,40,20,20);
//kontekst.fillRect(35,35,400,10);
//kontekst.strokeRect(750,350,50,50);
//kontekst.clearRect(0,0,400,200);

//kontekst.clearRect(0,0,plansza.width,plansza.height);

var rozmiarElementuWeza = 20;
var siatkaSzer = plansza.width / rozmiarElementuWeza;
var siatkaWys = plansza.height / rozmiarElementuWeza;

var kierunekX = 1;
var kierunekY = 0;

var x = 10;
var y = 10;

var snake  = [
    {x : 2, y : 0},
    {x : 1, y : 0},
    {x : 0, Y : 0}
];

function jablkoLocaja() {
    var jablkoX = Math.floor(Math.random() * siatkaSzer);
    var jablkoY = Math.floor(Math.random() * siatkaWys);
}

function logKlawisz(event) {
    console.log(event);

    if (event.key==="ArrowUp") {
            console.log("Strzalka w gore");
            kierunekX = 0;
            kierunekY = -1;
        }
        else if (event.key==="ArrowDown") {
            console.log("Strzalka w dol");
            kierunekX = 0;
            kierunekY = 1;
        }
        else if (event.key==="ArrowRight") {
        console.log("Strzalka w prawo")
            kierunekX = 1;
            kierunekY = 0;
        }
        else if (event.key==="ArrowLeft") {
            console.log("Strzalka w lewo")
            kierunekX = -1;
            kierunekY = 0;
        }
        else {
            console.log("Cos innego nis Stralki");
        }
    }

    document.addEventListener("keydown",logKlawisz);

/*
function konsola() {
    console.log(".");
}

setInterval(konsola,1000);*/
