// const { expect, it } = require("@jest/globals");
// const { describe } = require("yargs");
const {suma, resta, multiplicacion, division} = require("../calc");

describe("Pruebas de suma", () => {

  test("Salida de suma con números positivos", () => {
    expect(suma(25,25)).toBe(50);
  })

  it("Fruta es verdadero", () => {
    let fruta = false;
    expect(fruta).toBeTruthy();
  })

  it("Salida de suma con números negativos", () => {
    expect(suma(50,-10)).toBe(40);
  })

  it("Salida de suma con valor no-numerico", () => {
    expect(suma(50,"A")).toBe(0);
  })
})

describe("Pruebas de resta", () => {

  test("Salida de resta con numeros positivos", () => {
    expect(resta(50,25)).toBe(25);
  })

  it("Salida de resta con valor no-numerico", () => {
    expect(resta(50,"A")).toBe(0);
  })
})

describe("Pruebas de división", () => {

  test("Salida de división con numeros positivos", () => {
    expect(division(10,5)).toBe(2);
  })

  it("Salida de divisón con valor no-numerico", () => {
    expect(division(50,"A")).toBe(0);
  })
})

describe("Pruebas de multiplicación", () => {

  test("Salida de multiplicacion con numeros positivos", () => {
    expect(multiplicacion(2,10)).toBe(20);
  })

  it("Salida de multiplicacion con valor no-numerico", () => {
    expect(multiplicacion(2,"Z")).toEqual(0);
  })
})