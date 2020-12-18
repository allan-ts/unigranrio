package ap2.calculadoraimc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadoraImc {

	CalculadoraImc calc;

	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
	
	// Testes crianças

	@Test
	public void testeCriancaBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.05, 15.0, "feminino", 4));
	}

	@Test
	public void testeCriancaPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.05, 15.435, "masculino", 4));
	}

	@Test
	public void testeCriancaPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.05, 18.7, "masculino", 4));
	}

	@Test
	public void testeCriancaSobrepesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.05, 20, "masculino", 4));
	}

	@Test
	public void testeCriancaSobrepesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.05, 50, "feminino", 4));
	}

	@Test
	public void testeCriancaObesidade() {
		Assert.assertEquals("Obesidade", calc.calcularImc(1.05, 51, "feminino", 4));
	}
	
	
	// Testes adultos 

	@Test
	public void testeAdultoBaixoPesoMuitoGrave() {
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.70, 46.2, "feminino", 20));
	}

	@Test
	public void testeAdultoBaixoPesoGraveMinimo() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.70, 46.25, "masculino", 65));
	}

	@Test
	public void testeAdultoBaixoPesoGraveMaximo() {
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.70, 49.1, "masculino", 65));
	}

	@Test
	public void testeAdultoBaixoPesoMinimo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 49.2, "feminino", 20));
	}

	@Test
	public void testeAdultoBaixoPesoMaximo() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 53.45, "masculino", 65));
	}

	@Test
	public void testeAdultoPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 53.48, "feminino", 20));
	}

	@Test
	public void testeAdultoPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 71.88, "masculino", 65));
	}

	@Test
	public void testeAdultoSobrepesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 72.8, "feminino", 20));
	}

	@Test
	public void testeAdultoSobrepesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 86.67, "masculino", 65));
	}

	@Test
	public void testeAdultoObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 86.7, "feminino", 20));
	}

	@Test
	public void testeAdultoObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 101.13, "masculino", 65));
	}

	@Test
	public void testeAdultoObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 101.16, "feminino", 20));
	}

	@Test
	public void testeAdultoObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 115.57, "masculino", 65));
	}

	@Test
	public void testeAdultoObesidadeGrauIII() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 115.7, "masculino", 65));
	}
	
	
	// Testes idoso mulher

	@Test
	public void testeIdosoMulherBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 60, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 63.6, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 73, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherSobrepesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 78.5, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherSobrepesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 92.47, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 92.98, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 106.93, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 107.4, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 117, "feminino", 66));
	}

	@Test
	public void testeIdosoMulherObesidadeGrauIII() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 121.8, "feminino", 66));
	}
	
	
	// Testes idoso homem

	@Test
	public void testeIdosoHomemBaixoPeso() {
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.70, 63.5, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemPesoNormalMinimo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 63.6, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemPesoNormalMaximo() {
		Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 78.03, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemSobrepesoMinimo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 78.5, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemSobrepesoMaximo() {
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 86, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeGrauIMinimo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 87.2, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeGrauIMaximo() {
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 100, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeGrauIIMinimo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 101.65, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeGrauIIMaximo() {
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.70, 115.57, "masculino", 66));
	}

	@Test
	public void testeIdosoHomemObesidadeGrauIII() {
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.70, 116, "masculino", 66));
	}

}
