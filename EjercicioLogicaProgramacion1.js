const prompt = require("prompt-sync")();

let scan= prompt("Dame 3 números separados por espacio: ");
let numeros = scan.split(" ");
let max = parseInt(numeros[0]);
let min = parseInt(numeros[0]);
let mid;
//numeros.sort((a, b) => a - b); //forma con metodo sort
//for para obtener maximo y minimo
for (let i=0;i < numeros.length;i++){
    if(i==0) continue;
    if (parseInt(numeros[i])>max){
        max=parseInt(numeros[i]);
    }else if (parseInt(numeros[i])<min){
        min=parseInt(numeros[i]);
    }else{
        console.log("Los números son iguales");
        mid=parseInt(numeros[i]);

    }
}
//for para obtener el valor de en medio
for (let i=0;i < numeros.length;i++){
    if (parseInt(numeros[i])!=max && parseInt(numeros[i])!=min){
        mid= parseInt(numeros[i]);
    }
}

console.log("Mayor a menor:", max, mid, min);
console.log("Menor a mayor:", min, mid, max);
