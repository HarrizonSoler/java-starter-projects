Proceso sin_titulo
	Definir parada,i,pase,pass Como Entero
	Definir acumpe,acumps ,total ,ganan como real
	Definir c1 Como Logico
	Escribir "Este software simula la ruta de un bus calculando la ganancia"
	Escribir "Hecho por Harrizon Soler"
	Escribir "   _____________"
	Escribir " _/_|[][][][][] | - -"
	Escribir "(      City Bus | - -"
	Escribir "=--OO-------OO--=dwb"
	Escribir ""
	Escribir "**********Digite el numero de paradas**********"
	Leer parada
	si parada < 1 entonces
		Escribir "El numero de paradas debe ser mayor o igual a 1"
	SiNo
		acumpe <-0
		acumps <-0
		c1 <- Verdadero
		Escribir ""
		Para i = 1 hasta parada Hacer
			Escribir "Digite los pasajeros entrada de la parada ",i
			Leer pase
			si i > 1 Entonces
				Escribir ""
				Escribir "Digite el numero de pasajeros salida de la parada ",i
				leer pass
				Escribir ""
			SiNo
				Escribir ""
				pass <- 0
				Escribir "Pasajeros Salida 0"
				Escribir ""
			FinSi
			si pase < 0 o pass < 0 Entonces
				Escribir ""
				Escribir "El n. de pasajeros entrada y salida deben ser al menos 0"
				parada <- i
				c1 <- Falso
			SiNo
				acumpe <- acumpe + pase
				acumps <- acumps + pass
			FinSi
		FinPara
		total <- acumpe - acumps
		ganan <- acumpe*150
		si c1 = Verdadero Entonces
			Escribir ""
			Escribir "En total entraron ", acumpe , " pasajeros y salieron ",acumps
			Escribir "Con una diferencia de ",total, ", (saquelos)"
			Escribir "La ganancia fue de ",ganan
		FinSi
	FinSi
	
FinProceso 
