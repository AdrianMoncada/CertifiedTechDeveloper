/**
 * @jest-environment jsdom
 */
const fs = require("fs");

const { init, limpiar, resetear, resolver } = require('../funcionalidad.js');

describe("Prueba de init function", () => {

  test("Testear function resover", () => {
    
    document.body.innerHTML = fs.readFileSync("./calculadora.html");
    // resultado.textContent = "2";
    // operandoa = "1";
    // operandob = "2";
    // operacion = "+";
    // resolver()
    expect(document.body.innerHTML).toContain("<td colspan=\"4\"><span id=\"resultado\">3</span></td>");
    
  });
});
