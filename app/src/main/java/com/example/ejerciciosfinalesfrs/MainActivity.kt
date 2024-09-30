package com.example.ejerciciosfinalesfrs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

        }
//Ejercicio 1.
//Declara una variable llamada edad y asígnale tu edad actual. Luego, declara una variable llamada nombre y asígnale tu nombre.
// Finalmente, crea una variable llamada altura y asígnale tu altura en metros como un número decimal.
// Asegúrate de que los tipos de datos de las variables sean apropiados.

//Ejercicio 2
/*Declara una constante llamada PI y asígnale el valor de Pi (3.14159).
Luego, declara una variable llamada radio y asígnale un valor entero. Calcula el área de un círculo utilizando la fórmula A = πr^2, donde r es el radio.
Asegúrate de convertir el radio a un tipo de dato adecuado antes de realizar la operación.
*/

/*Ejercicio 3
*
* Crea una función llamada saludar que tome dos argumentos: nombre y edad.
* La función debe imprimir un saludo que incluya el nombre y la edad de la persona.
* Luego, llama a esta función con tus propios datos.
* */
/* Ejercicio 4
Crea una función llamada informaciónPersonal que tome tres argumentos: nombre, edad y ciudad.
La función debe imprimir una cadena que utilice string templates para mostrar esta información de forma legible.
Llama a la función con tus propios datos.
 */
/*Ejercicio 5
Escribe una función que convierta grados Celsius a Fahrenheit.
Luego, escribe otra función que convierta grados Fahrenheit a Celsius.*/

fun main(){


    /*EJ1*/
       var edad:Int=18;
       var nombre:String="nombre"
        var altura:Double= 1.75


    /*ej2*/
    var pi : Float=3.14159F
    var radio: Int=4
    var A: Float=pi*(radio*radio)
    println(A)

//Ej3
         saludar("paco",19)


/*Ej4*/
informaciónPersonal("paco",19,"Almeria")
        grados(12.5F)
        Fare(120.3f)
}

/*Ej5*/
fun grados(celsius:Float): Float {
        var F:Float=0.0F
        F=(celsius*9/5)+32
        println(""+celsius+"C"+" = "+F+"F")

        return F
}
fun Fare(F:Float):Float{
        var C:Float=0.0F
        C=(F*5/9)-32
        println(""+F+"F"+" = "+C+"C")


        return C
}

/*Ej4*/
fun informaciónPersonal (nombre:String,edad:Int,ciudad:String){
    println("Mi nombre: $nombre")
        println("Mi edad: $edad")
        println("Mi ciudad: $ciudad")
}





/*Ej3*/
fun saludar(nombre:String,edad:Int){

println("nombre:"+nombre+" y mi edad: "+edad)
}

