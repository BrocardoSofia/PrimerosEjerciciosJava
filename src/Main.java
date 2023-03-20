import java.util.Scanner;

public class Main
{
    public static Scanner scan;
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
        //ejercicio14();
        //ejercicio15();
        //ejercicio16();
        //ejercicio17();
        //ejercicio18();
        //ejercicio19();
        //ejercicio20();
        //ejercicio21();
        //ejercicio22();
        //ejercicio23();
        //ejercicio24();
        //ejercicio25();
        ejercicio26();

        scan.close();
    }

    public static void ejercicio1()
    {
        //calcular promedio de un arreglo cargado por teclado
        int[] numeros = new int[5];
        int suma = 0;
        float promedio;

        for(int i=0; i< numeros.length; i++)
        {
            System.out.println("Ingrese un numero: ");
            numeros[i] = scan.nextInt();
        }

        for(int i=0; i< numeros.length; i++)
        {
            suma += numeros[i];
        }

        promedio =(float)suma/numeros.length;

        System.out.println("El promedio es: "+promedio);
    }

    public static void ejercicio2()
    {
        // Calcular si un número es par o no.
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();

        if(numero%2 == 0)
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }

    public static void ejercicio3()
    {
        // Mostrar los primeros 100 números primos
        int contador = 0, primos = 1;

        do
        {

            if(esPrimo(primos) == 1)
            {
                System.out.println(""+primos);
                contador++;
            }
            primos++;
        }while(contador < 100);
    }

    public static int esPrimo(int numero)
    {
        int resultado = 1;

        if(numero == 0 || numero == 1 || numero == 4)
        {
            resultado = 0;
        }
        else
        {
            for(int i=2; i<numero/2; i++)
            {
                if(numero%i == 0)
                {
                    resultado = 0;
                }
            }

        }

        return resultado;
    }

    public static void ejercicio4()
    {
        int tope, contador = 0, primo = 0;

        System.out.println("Ingrese cuantos numeros primos desea ver: ");
        tope = scan.nextInt();

        do
        {
            if(esPrimo(primo)==1)
            {
                System.out.println(""+primo);
                contador++;
            }
            primo++;
        }while(contador < tope);
    }

    public static void ejercicio5()
    {
        //Ingresar un número o tantos como quiera el usuario y revisar si es primo.
        String opcionStrig;
        char seguir;
        int numero;

        do
        {
            System.out.println("Ingrese un numero: ");
            numero = scan.nextInt();

            scan.nextLine();
            if(esPrimo(numero) == 1)
            {
                System.out.println(""+numero+" es primo");
            }
            else
            {
                System.out.println(""+numero+" no es primo");
            }

            System.out.println("Desea consultar mas numeros? (n para salir)");
            opcionStrig = scan.nextLine();

            seguir = opcionStrig.charAt(0);
        }while(seguir != 'n');
    }

    public static void ejercicio6()
    {
        //Encontrar la suma de los primeros 10 números naturales.
        int suma = 0;

        for(int i=0; i<10; i++)
        {
            suma += i;
        }

        System.out.println("suma de los primeros 10 numeros naturales: "+suma);
    }

    public static void ejercicio7()
    {
        //Sumar (en cantidad, no acumular) cuántos números positivos ingresa un usuario.
        int contador = 0, numero;
        String opcion;
        char seguir;

        do
        {
            System.out.println("Ingrese un numero: ");
            numero = scan.nextInt();

            contador++;
            scan.nextLine();

            System.out.println("Desea seguir? (n para salir)");
            opcion = scan.nextLine();
            seguir = opcion.charAt(0);
        }while(seguir != 'n');

        System.out.println("Cantidad de elementos ingresados: "+contador);
    }

    public static void ejercicio8()
    {
        //Revisar si un año es bisiesto o no.
        int anio;

        System.out.println("Ingrese el anio a evaluar: ");
        anio = scan.nextInt();

        if(((anio%100 != 0) && (anio%4 == 0)) || (anio%400 == 0))
        {
            System.out.println(""+anio+" es bisiesto");
        }
        else
        {
            System.out.println(""+anio+" no es bisiesto");
        }
    }

    public static void ejercicio9()
    {
        //Encontrar el valor ASCII de un carácter.
        String caracter;
        int valorASCII;

        System.out.println("Ingrese un caracter: ");
        caracter = scan.nextLine();

        valorASCII = caracter.charAt(0);

        System.out.println("El valor ASCII para el caracter"+caracter.charAt(0)+" = "+valorASCII );
    }

    public static void ejercicio10()
    {
        //Multiplicar dos números.
        int numero1, numero2, resultado;

        System.out.println("Ingrese el primer numero: ");
        numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = scan.nextInt();

        resultado = numero1 * numero2;

        System.out.println(""+numero1+" * "+numero2+" = "+resultado);
    }

    public static void ejercicio11()
    {
        //Realizar un programa que le pregunte al usuario que área desea calcular.
        // Las opciones son: rectángulo, cuadrado, triangulo y circulo.
        int opcion, flag = 0;

        do
        {
            System.out.println("CALCULADORA DE AREA");
            System.out.println(" ");
            System.out.println("    1. Rectangulo");
            System.out.println("    2. Cuadrado");
            System.out.println("    3. Circulo");

            opcion = scan.nextInt();

            switch (opcion)
            {
                case 1:
                    areaRecnangulo();
                    flag = 1;
                    break;

                case 2:
                    areaCuadrado();
                    flag = 1;
                    break;

                case 3:
                    areaCirculo();
                    flag = 1;
                    break;

                default:
                    System.out.println("Error: opcion no valida");
                    break;
            }

        }while(flag == 0);

    }

    public static void areaRecnangulo()
    {
        int ladoMayor, ladoMenor, area;

        System.out.println("Ingrese el lado menor: ");
        ladoMenor = scan.nextInt();

        System.out.println("Ingrese el lado mayor");
        ladoMayor = scan.nextInt();

        area = ladoMayor * ladoMenor;

        System.out.println("Area: "+ area);
    }

    public static void areaCuadrado()
    {
        int lado, area;

        System.out.println("Ingrese el lado: ");
        lado = scan.nextInt();

        area = lado * lado;

        System.out.println("Area: "+ area);
    }

    public static void areaCirculo()
    {
        int radio;
        double area = 0;

        System.out.println("Ingrese el radio: ");
        radio = scan.nextInt();

        area = (double)(radio * radio) * 3.14;

        System.out.println("Area: "+ area);
    }

    public static void ejercicio12()
    {
        //Programa que lea un nombre y muestre por pantalla:
        //“Buenos dias nombre_introducido”
        String nombre;

        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();

        System.out.println("Buenos dias "+nombre);
    }

    public static void ejercicio13()
    {
        //Escribir un programa que lea un número entero por teclado y obtenga y muestre por
        // pantalla el doble y el triple de ese número
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = scan.nextInt();

        System.out.println("Doble: "+numero*2);
        System.out.println("Triple: "+numero*3);
    }

    public static void ejercicio14()
    {
        //Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        // La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
        // F = 32 + ( 9 * C / 5)
        float centigrados, fahrenheit;

        System.out.println("Ingrese la temperatura en grados centigrados: ");
        centigrados = scan.nextFloat();

        fahrenheit = 32 + (9*centigrados / 5);
        System.out.println(""+centigrados+" C = "+fahrenheit+" F");
    }

    public static void ejercicio15()
    {
        /*
          Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra por
            pantalla la longitud y el área de la circunferencia. Investigar el uso de la librería Math.
          Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
        * */
        double radio, longitud, area;

        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = scan.nextDouble();

        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio,2);

        System.out.println("Longitud: "+longitud);
        System.out.println("Area: "+area);
    }

    public static void ejercicio16()
    {
        //Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        double velocidadKmH, velocidadMS;

        System.out.println("Ingrese la velocdad en Km/h: ");
        velocidadKmH = scan.nextFloat();

        velocidadMS = velocidadKmH / 3.6;

        System.out.println(""+velocidadKmH+" km/h = "+velocidadMS+" m/s");
    }

    public static void ejercicio17()
    {
        //Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud
        // de la hipotenusa según el teorema de Pitágoras.
        double cateto1, cateto2, hipotenusa;

        System.out.println("Ingrese el primer cateto: ");
        cateto1 = scan.nextDouble();

        System.out.println("Ingrese el segundo cateto: ");
        cateto2 = scan.nextDouble();

        hipotenusa = Math.sqrt((Math.pow(cateto1,2) + Math.pow(cateto2, 2)));

        System.out.println("Hipotenusa: "+hipotenusa);
    }

    public static void ejercicio18()
    {
        //Programa lea 30 temperaturas correspondientes a un mes y
        //calcule el maximo, el minimo y el promedio
        double temperatura, minimo = 0, maximo = 0, suma = 0, promedio;
        int cantidad = 10;

        for(int i=0; i<cantidad; i++)
        {
            System.out.println("Ingrese la "+(i+1)+"º temperatura: ");
            temperatura = scan.nextDouble();

            suma += temperatura;

            if(i == 0)
            {
                minimo = temperatura;
                maximo = temperatura;
            }
            else
            {
                if(minimo > temperatura)
                {
                    minimo = temperatura;
                }
                if(maximo < temperatura)
                {
                    maximo = temperatura;
                }
            }
        }

        promedio = suma / cantidad;

        System.out.println("Temperatura minima: "+minimo+"ºC");
        System.out.println("Temperatura maxima: "+maximo+"ºC");
        System.out.println("Temperatura promedio: "+promedio+"ºC");
    }

    public static void ejercicio19()
    {
        //Pide por teclado dos números y genera 10 números aleatorios
        //entre esos números. Usa el método Math.random para generar un número
        //entero aleatorio
        int menor, mayor;
        long[] numeros = new long [10];
        double aux;

        System.out.println("Ingrese un numero: ");
        menor = scan.nextInt();

        do
        {
            System.out.println("Ingrese un numero mayor a "+menor+" : ");
            mayor = scan.nextInt();

            if(menor >= mayor)
            {
                System.out.println("Error: el numero debe ser mayor a "+menor);
            }
        }while(menor >= mayor);

        for(int i=0; i<10; i++)
        {
            //cargo numeros random a un arreglo de 10 numeros
            aux = Math.random() * ((mayor - menor) + menor);
            numeros[i] = Math.round(aux);
        }

        mostrarArreglo(numeros, 10);
    }

    static public void mostrarArreglo(long[] arreglo, int validos)
    {
        for(int i=0; i<validos; i++)
        {
            System.out.println(""+arreglo[i]);
        }
    }

    public static void ejercicio20()
    {
        //Crea una aplicación que nos pida un día de la semana y que
        //nos diga si es un día laboral o no. Usa un switch para ello.
        String dia;

        System.out.println("Ingrese el nombre del dia: ");
        dia = scan.nextLine();

        switch(dia)
        {
            case "lunes":
                System.out.println("Es un dia laboral");
                break;

            case "martes":
                System.out.println("Es un dia laboral");
                break;

            case "miercoles":
                System.out.println("Es un dia laboral");
                break;

            case "jueves":
                System.out.println("Es un dia laboral");
                break;

            case "viernes":
                System.out.println("Es un dia laboral");
                break;

            case "sabado":
                System.out.println("No es un dia laboral, es fin de semana");
                break;

            case "domingo":
                System.out.println("No es un dia laboral, es fin de semana");
                break;
        }
    }

    public static void ejercicio21()
    {
        //Pide por teclado un número entero positivo (debemos
        //controlarlo) y muestra el número de cifras que tiene. Por ejemplo: si
        //introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar
        //si tiene una o más cifras, al mostrar el mensaje
        int numero, cifras = 1, control;

        System.out.println("Ingrese un numero entero positivo");
        numero = scan.nextInt();

        control = numero;

        while(control/10 > 0)
        {
            control = control/10;
            cifras++;
        }

        System.out.println("El numero "+numero+" tiene "+cifras+" cifras");
    }

    public static void ejercicio22()
    {
        //Crea una aplicación llamada CalculadoraPolacaInversaApp,
        //nos pedirá 2 operandos (int) y un signo aritmético (String), según este último
        //se realizará la operación correspondiente. Al final mostrara el resultado en un
        //cuadro de diálogo.
        //Los signos aritméticos disponibles son:
        //● +: suma los dos operandos.
        //● -: resta los operandos.
        //● *: multiplica los operandos.
        //● /: divide los operandos, este debe dar un resultado con decimales (double)
        //● ^: 1º operando como base y 2º como exponente.
        //● %: módulo, resto de la división entre operando1 y operando2.
        int numero1, numero2;
        String simbolo;

        System.out.println("Ingrese el primero numero: ");
        numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = scan.nextInt();

        scan.nextLine();
        System.out.println(("Ingrese el operador (+,-,*,/,^,%)"));
        simbolo = scan.nextLine();

        switch(simbolo.charAt(0))
        {
            case '+':
                System.out.println(""+numero1+" + "+numero2+" = "+(numero1+numero2));
                break;

            case '-':
                System.out.println(""+numero1+" - "+numero2+" = "+(numero1-numero2));
                break;

            case '*':
                System.out.println(""+numero1+" * "+numero2+" = "+(numero1*numero2));
                break;

            case '/':
                System.out.println(""+numero1+" / "+numero2+" = "+(numero1/numero2));
                break;

            case '^':
                System.out.println(""+numero1+" ^ "+numero2+" = "+(Math.pow(numero1, numero2)));
                break;

            case '%':
                System.out.println(""+numero1+" % "+numero2+" = "+(numero1%numero2));
                break;
        }
    }

    public static void ejercicio23()
    {
        //Pide por teclado el nombre, edad y salario y muestra el salario
        //● Si es menor de 16 no tiene edad para trabajar
        //● Entre 19 y 50 años el salario es un 5 por ciento más
        //● Entre 51 y 60 años el salario es un 10 por ciento más
        //● Si es mayor de 60 el salario es un 15 por ciento más

        String nombre;
        int edad;
        float salario = 0;

        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();

        if(edad >= 16)
        {
            System.out.println("Ingrese su salario: ");
            salario = scan.nextFloat();

            if((edad>19)&&(edad<50))
            {
                salario += salario*0.05;
            }
            else if((edad>51) && (edad<60))
            {
                salario += salario*0.10;
            }
            else if(edad>=60)
            {
                salario += salario*0.15;
            }
        }

        System.out.println("Nombre: ............... "+nombre);
        System.out.println("Edad: ................. "+edad);
        System.out.println("Salario: .............. $"+salario);
    }

    public static void ejercicio24()
    {
        //Crea un programa que pida al usuario su nombre y su edad, y muestre por
        //pantalla un mensaje personalizado de bienvenida.

        String nombre;
        int edad;

        System.out.println("Ingrese su nombre: ");
        nombre = scan.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();

        System.out.println("Bienvenid@ "+nombre+" ("+edad+")");
    }

    public static void ejercicio25()
    {
        //Crea un programa que pida al usuario el precio y la cantidad de varios
        //productos, y muestre por pantalla el total de la venta.
        int cantidadPrendas;
        float precio, precioTotalVenta;

        System.out.println("Ingrese el precio unitario de la prenda: ");
        precio = scan.nextFloat();

        System.out.println("Ingrese la cantidad de prendas a comprar: ");
        cantidadPrendas = scan.nextInt();

        precioTotalVenta = precio * cantidadPrendas;

        System.out.println("...............................................");
        System.out.println("                    Ticket");
        System.out.println("...............................................");
        System.out.println("Precio unitario: ................. $"+precio);
        System.out.println("Cantidad: ........................ "+cantidadPrendas);
        System.out.println("");
        System.out.println("Total: ........................... $"+precioTotalVenta);
    }

    public static void ejercicio26()
    {
        //Crea un programa que pida al usuario el nombre, la edad y el género de varias
        //personas, y muestre por pantalla estadísticas como la edad promedio y el
        //porcentaje de hombres y mujeres.
        String nombre, seguir, genero;
        char control = 's';
        int mujeres = 0, hombres = 0, noBinarios = 0, edad, sumaEdades = 0, contadorPersonas= 0, flag = 0;
        float promedioEdades, porcMujeres, porcHombres;

        do {
            System.out.println("Ingrese su nombre: ");
            nombre = scan.nextLine();

            System.out.println("Ingrese su edad: ");
            edad = scan.nextInt();

            scan.nextLine();
            do {
                System.out.println("Ingrese su genero: (F/M)");
                genero = scan.nextLine();

                if(((genero.charAt(0)=='M'))||(genero.charAt(0)=='F'))
                    flag = 1;
                else
                    System.out.println("Error: ingrese una opcion valida");
            }while(flag == 0);

            //sumo para la estadistica final
            sumaEdades += edad;

            if(genero.charAt(0) == 'F')
                mujeres++;
            else
                hombres++;

            contadorPersonas++;
            System.out.println("Desea seguir cargando personas? ('n' para salir)");
            seguir = scan.nextLine();

            control = seguir.charAt(0);
        }while((control!='n'));

        //calculo las estadisticas
        promedioEdades = sumaEdades / contadorPersonas;

        porcMujeres = (float)(mujeres*100)/contadorPersonas;
        porcHombres = (float) 100 - porcMujeres;

        System.out.println("Edad promedio: ..................... "+promedioEdades);
        System.out.println("Porcentaje de Mujeres: ............. "+porcMujeres+"%");
        System.out.println("Porcentaje de Hombres: ............. "+porcHombres+"%");
    }
    
}