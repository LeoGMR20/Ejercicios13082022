fun main(){
    print("Introduzca un mensaje: ")
    val mensaje = readln()

    respuestaMensaje(mensaje)
}

fun respuestaMensaje(mensaje: String){
    var resultado = ""
    if(mensaje.length % 7 == 0){
        resultado += generarAstericos(mensaje.length)
    }
    else{
        print("¿Cuantos '*' desea visualizar?: ")
        val cantAst = readln().toInt()
        resultado += generarAstericos(cantAst)
        resultado += mensaje
    }
    println(resultado)
}

fun generarAstericos(cantAst: Int): String{
    var asteriscos = ""
    for (i in 0 until cantAst) asteriscos += "*"
    return asteriscos
}