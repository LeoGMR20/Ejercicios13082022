fun main(){
    val numeros = mutableListOf<Int>()
    val cantidadNum: Int
    print("Ingrese la cantidad de números que quiera ingresar: ")
    cantidadNum = readln().toInt()
    println("Ingrese los números.")
    for (i in 0 until cantidadNum){
        print("Número ${i.inc()}: ")
        numeros.add(readln().toInt())
    }
    println(numeros.distinct())
    // TODO: Preguntar al inge sobre como pasar como parámetro las listas 
}

/*fun listaCadena(listaNum: Int): String{
    var noRepetido = emptyArray<Int>()
    var resultado = ""
    for (i in 0 until arrayNum.size){
        if (i == 0) resultado += arrayNum[i].toString()
        else{
            if (!noRepetido.contains(arrayNum[i])) resultado += arrayNum[i].toString()
        }
        noRepetido += arrayNum[i]
    }
    return resultado
}

//Forma con arrays

/*fun main(){
    val numeros = intArrayOf(1,2,2,2,3,4,5,6,6,7,7,7)
    println(arrayCadena(numeros))
}

fun arrayCadena(arrayNum: IntArray): String{
    var noRepetido = emptyArray<Int>()
    var resultado = ""
    for (i in 0 until arrayNum.size){
        if (i == 0) resultado += arrayNum[i].toString()
        else{
            if (!noRepetido.contains(arrayNum[i])) resultado += arrayNum[i].toString()
        }
        noRepetido += arrayNum[i]
    }
    return resultado
}*/