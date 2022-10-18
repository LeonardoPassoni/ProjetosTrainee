
const lista = new Array(
    `São Paulo`,
    `Rio de Janeiro`,
    `Salvador`,
    `AAAAAA`
)

console.log(lista)

lista.push("Teste")

console.log(lista)

lista.splice(3,2)

lista.forEach(item => console.log(item))
