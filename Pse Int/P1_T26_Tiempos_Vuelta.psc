Proceso sin_titulo
	Definir v,vuel,mv Como Entero
	Definir i,b Como Logico
	Definir sum,prom Como Real 
	Escribir "Este software calcula valores de vueltas por un atleta"
	Escribir "Hecho por Harrizon Soler"
	
	v <- 0
	vuel <- 0
	i <- Verdadero
	mv <- 0
	b <- Verdadero
	sum <- 0
	prom <- 0
	
	Mientras i = Verdadero Hacer
		v <- v + 1
		si v = 1 Entonces
			i <- Verdadero
		SiNo
			Escribir "Desea registrar la vuelta ",v," ? (Verdadero o Falso)"
			leer i
		FinSi
		si i = Verdadero Entonces
			Escribir ""
			Escribir "Digite los minutos de la vuelta ",v
			Leer vuel
			Escribir ""
			si v=1 Entonces
				mv <- vuel
			sino
				si vuel < mv Entonces
					mv <- vuel
				FinSi
			FinSi
			sum <- sum + vuel
		FinSi
		Si v=1 y i=Falso Entonces
			b <- Falso
		FinSi
	FinMientras
	Si b = Verdadero Entonces
		prom <- sum/v
		Escribir ""
		Escribir "El promedio de vueltas es ",prom," min"
		Escribir "La mejor vuelta fue de " , mv," min"
	FinSi
FinProceso
