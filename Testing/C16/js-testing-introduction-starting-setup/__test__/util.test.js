const { generateText } = require("../util");

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

  test("Salida con carácteres en edad", () => {
    const text = generateText("Daniel", "Treinta");
    expect(text).toBe("Daniel (null years old)");
  })

})

