// const { expect, it } = require("@jest/globals");
// const { describe } = require("yargs");
const {suma, resta, multiplicacion, division} = require("../calc");

describe("Pruebas de suma, resta, multiplicación y divisón", () => {

  test("Salida de suma con números positivos", () => {
    expect(suma(25,25)).toBe(50);
  })

  it("Salida de suma con números negativos", () => {
    expect(suma(50,-10)).toBe(40);
  })
})