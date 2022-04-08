/**
 * @jest-environment jsdom
 */
const { generateText, validateInput, createElement } = require('../util.js');

describe("Pruebas de salida de datos", () => {

  test("Salida de nombre y edad", () => {
    const text = generateText("Daniel", 30);
    expect(text).toBe("Daniel (30 years old)");
  });

  it("Salida con datos vacíos", () => {
    const text = generateText("", null);
    expect(text).toBe(" (null years old)");
  })
  
  test("Salida sin datos", () => {
    const text = generateText();
    expect(text).toBe("undefined (undefined years old)");
  })
})

describe('Pruebas de validacion de tipo de datos', () => {
  test('Validar texto', () => {
      const text = validateInput('texto');
      expect(text).toBe(true);
  });

  test('Validar vacio', () => {
      const text = validateInput('');
      expect(text).toBe(false);
  });
});


describe('Pruebas de creación', () => {
  test('Validar elemento creado', () => {
      const text = createElement("H1","Hello","comentario");
      expect(text.innerHTML).toBe("Hello");
      expect(text.className).toBe("comentario");
      expect(text.tagName).toBe("H1");
  });
});
