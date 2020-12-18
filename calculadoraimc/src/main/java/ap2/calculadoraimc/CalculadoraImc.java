package ap2.calculadoraimc;

public class CalculadoraImc {

	public String calcularImc(double altura, double peso, String sexo, int idade) {

		double imc = peso / (altura * altura);

		if (idade < 20) {
			if (imc < 14) {
				return "Baixo peso";
			}
			if (imc == 14 || imc < 17) {
				return "Peso normal";
			}
			if (imc == 18 || imc < 46) {
				return "Sobrepeso";
			}
			if (imc >= 46) {
				return "Obesidade";
			}
		} if (idade >= 20 || idade < 66) {
			if (imc < 16) {
				return "Baixo peso muito grave";
			}
			if (imc == 16 || imc < 17) {
				return "Baixo peso grave";
			}
			if (imc == 17 || imc < 18.5) {
				return "Baixo peso";
			}
			if (imc == 18.5 || imc < 25) {
				return "Peso normal";
			}
			if (imc == 25 || imc < 30) {
				return "Sobrepeso";
			}
			if (imc == 30 || imc < 35) {
				return "Obesidade grau I";
			}
			if (imc == 35 || imc < 40) {
				return "Obesidade grau II";
			}
			if (imc > 40) {
				return "Obesidade grau III";
			}
		} if (idade > 65 && sexo.equals("feminino")) {
			if (imc < 22) {
				return "Baixo peso";
			}
			if (imc == 22 || imc < 27) {
				return "Peso normal";
			}
			if (imc > 27 || imc < 32) {
				return "Sobrepeso";
			}
			if (imc == 32 || imc < 37) {
				return "Obesidade grau I";
			}
			if (imc == 37 || imc < 42) {
				return "Obesidade grau II";
			}
			if (imc >= 42) {
				return "Obesidade grau III";
			}
		} if (idade > 65 && sexo.equals("masculino")) {
			if (imc < 22) {
				return "Baixo peso";
			}
			if (imc == 22 || imc < 27) {
				return "Peso normal";
			}
			if (imc == 27 || imc < 30) {
				return "Sobrepeso";
			}
			if (imc == 30 || imc < 35) {
				return "Obesidade grau I";
			}
			if (imc == 35 || imc < 40) {
				return "Obesidade grau II";
			}
			if (imc >= 40) {
				return "Obesidade grau III";
			}
		}
		return "Parâmetros inválidos!";
	}
}
