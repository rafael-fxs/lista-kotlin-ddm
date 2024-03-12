// Aluno: Rafael Felipe Xavier da Silva
// Curso: Sistemas de Informação
// Matéria: Desenvolvimento para Dispositivos Móveis (Turma 5º U)

fun main() {
    println("\n// 1")
    /*
        Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário. 
    */
   
    println("${indPar(2)}")
    println("${indPar(3)}")
    
    println("\n// 2")
    /*
        Crie uma função que receba um array de inteiros e retorne o maior número. 
    */
    
    maiorNumeroArrayInteiros(arrayOf(10, 15, 6))
    
    println("\n// 3")
    /*
        Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome". 
    */
    
    var listaPessoas = listOf(Pessoa("Rafael", 22), Pessoa("Amanda", 23));
    listaPessoas = listaPessoas.sortedBy{it.nome.toString()}
    println(listaPessoas[0].nome);
    
    println("\n// 4")
    /*
        Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente). 
    */
    
    println("${indPalindromo("batata")}")
    println("${indPalindromo("mirim")}")
    
    println("\n// 5")
    /*
        Implemente uma função lambda que retorne o maior valor entre dois números.
    */
    
    val maiorNumero: (Int, Int) -> Int = { a, b -> if (a >= b) a else b }
    println("${maiorNumero(9, 6)}")
    
    println("\n// 6")
    /*
        Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite".
        Adicione um método chamado "saque" que recebe um valor como parâmetro e subtrai do saldo da conta.
        Se o valor do saque for maior que o saldo da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente". 
    */
    
    var contaRafael = ContaBancaria(50.0, 100.0)
    contaRafael.sacar(150.0)
    
    println("\n// 7")
    /*
        Crie uma função que receba uma lista de strings e retorne a string mais longa da lista. 
    */
    
    val lista = listOf("Abacaxi", "Cachorro", "Avião", "Livro", "Maçaneta")
    println("${stringMaisLonga(lista)}")
    
    println("\n// 8")
    /*
        Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma lista de funcionários e retorne o funcionário com o maior salário. 
    */
    
    val listaFuncionarios = listOf(Funcionario("Rafael", 30, 3000.0), Funcionario("Guilherme", 25, 3500.0), Funcionario("Lucas", 35, 2800.0))
    println("${funcionarioMaiorSalario(listaFuncionarios)}")
     
    println("\n// 9")
    /*
        Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente, sem usar o método de ordenação da linguagem.
    */
    
    val listaDesordenada = listOf(5, 2, 8, 1, 9, 3)
    println("${ordenarLista(listaDesordenada)}")
	
    println("\n// 10")
    /*
        Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula e retorna a área do triângulo.
    */
    
    val triangulo = Triangulo(5.0, 7.0)
    println("A área do triângulo é: ${triangulo.area()}")
    
    println("\n// 11")
    /*
        Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra "A", em ordem alfabética.
    */
    
    val listaPalavras = listOf("Abacaxi", "Amigo", "Arvore", "Avião", "Batata", "Carro")
    println("${stringsQueComecamComA(listaPalavras)}")
    
    println("\n// 12")
    /*
        Utilize um mapa para representar um dicionário de palavras e suas traduções.
    */
    
    val dicionario = mapOf(
        "mesa" to "table",
        "cachorro" to "dog",
        "livro" to "book",
        "computador" to "computer",
        "janela" to "window"
    )

    println("Dicionário de palavras:")
    for ((palavra, traducao) in dicionario) {
        println("$palavra: $traducao")
    }
    
    println("\n// 13")
    /*
        Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda.
        A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado.
        Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração, multiplicação e divisão.
        Use a função de ordem superior para realizar essas operações com diferentes pares de números.
    */
    
    val numero1 = 4.0
    val numero2 = 2.0
    val soma: (Double, Double) -> Double = { a, b -> a + b }
    val subtracao: (Double, Double) -> Double = { a, b -> a - b }
    val multiplicacao: (Double, Double) -> Double = { a, b -> a * b }
    val divisao: (Double, Double) -> Double = { a, b -> a / b }

    println("Soma: ${operacaoMatematica(numero1, numero2, soma)}")
    println("Subtração: ${operacaoMatematica(numero1, numero2, subtracao)}")
    println("Multiplicação: ${operacaoMatematica(numero1, numero2, multiplicacao)}")
    println("Divisão: ${operacaoMatematica(numero1, numero2, divisao)}")
    
    println("\n// 14")
    /*
        Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo.
        A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas). 
        Em seguida, use essa função para verificar se algumas palavras são palíndromos.
    */
    
    val palavras = listOf("ovo", "arara", "reviver", "banana", "Teste")
    for (palavra in palavras) {
        if (palavra.isPalindromo()) {
            println("$palavra é um palíndromo.")
        } else {
            println("$palavra não é um palíndromo.")
        }
    }
    
    println("\n// 15")
    /*
        Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros.
        Você deve criar funções de alta ordem para realizar as seguintes operações: filtrarPares: Uma função que filtra e retorna apenas os 
        números pares do array; dobrarValores: Uma função que dobra o valor de cada número no array; somarValores: Uma função que calcula a 
        soma de todos os valores no array. Em seguida, crie um array de números inteiros e utilize as funções de alta ordem para realizar essas operações.
    */
    
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = filtrarPares(numeros)
    println("${pares.joinToString()}")

    val dobrados = dobrarValores(numeros)
    println("${dobrados.joinToString()}")

    println("${somarValores(numeros)}")
    
}

fun indPar(num: Int): Boolean {
    return num % 2 == 0
}
fun maiorNumeroArrayInteiros(array: Array<Int>) {
    var maiorNumero = 0;
    for (i in array) {
        if (i > maiorNumero)
            maiorNumero = i
    }
    println(maiorNumero)
}

fun indPalindromo(palavra: String): Boolean {
    return palavra == palavra.reversed()
}

fun stringMaisLonga(lista: List<String>): String? {
    if (lista.isEmpty()) return null

    var maisLonga = lista[0]
    for (str in lista) {
        if (str.length > maisLonga.length) {
            maisLonga = str
        }
    }
    return maisLonga
}

fun funcionarioMaiorSalario(funcionarios: List<Funcionario>): Funcionario? {
    if (funcionarios.isEmpty()) return null

    var funcionarioMaiorSalario = funcionarios[0]
    for (funcionario in funcionarios) {
        if (funcionario.salario > funcionarioMaiorSalario.salario) {
            funcionarioMaiorSalario = funcionario
        }
    }
    return funcionarioMaiorSalario
}

fun ordenarLista(lista: List<Int>): List<Int> {
	val listaOrdenada = lista.toMutableList()
    for (i in 1 until listaOrdenada.size) {
        val chave = listaOrdenada[i]
        var j = i - 1

        while (j >= 0 && listaOrdenada[j] > chave) {
            listaOrdenada[j + 1] = listaOrdenada[j]
            j--
        }
        listaOrdenada[j + 1] = chave
    }

    return listaOrdenada
}

fun stringsQueComecamComA(lista: List<String>): List<String> {
    return lista.filter { it.startsWith("A", ignoreCase = true) }
                .sorted()
}

fun operacaoMatematica(a: Double, b: Double, operacao: (Double, Double) -> Double): Double {
    return operacao(a, b)
}

fun String.isPalindromo(): Boolean {
    val textoTratado = this.lowercase().trim()
    return textoTratado == textoTratado.reversed()
}

fun filtrarPares(array: IntArray): IntArray {
    return array.filter { it % 2 == 0 }.toIntArray()
}

fun dobrarValores(array: IntArray): IntArray {
    return array.map { it * 2 }.toIntArray()
}

fun somarValores(array: IntArray): Int {
    return array.sum()
}


class Pessoa(nome: String, idade: Int) {
    var nome = nome;
    var idade = idade;
}

class ContaBancaria(var saldo: Double, var limite: Double) {
    fun sacar(valor: Double) {
        if (valor > (saldo + limite)) {
            throw Exception("Saldo insuficiente")
        } 
        saldo -= valor
        println(saldo)
    }
}

class Funcionario(val nome: String, val idade: Int, val salario: Double) {
    override fun toString(): String {
        return "Funcionário: nome=$nome, idade=$idade, salario=$salario"
    }
}

class Triangulo(val base: Double, val altura: Double) {
    fun area(): Double {
        return base * altura / 2
    }
}
