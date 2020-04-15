Proceso sin_titulo
	Definir n,i Como Entero
	Definir acum,prom Como Real
	Escribir "Este software determina la suma y promedio de los numeros ingresados (hasta que sean menores a 100)"
	Escribir "Hecho por Harrizon Soler"
	
    n <- 100
	acum<-0
	prom<-0
	i<-0
	
	Mientras n >= 100 Hacer
		Escribir "******Digite un numero a agregar******"
		leer n
		acum <- acum + n
		i <- i+1
	FinMientras
	prom <- acum/i
	Escribir "La suma de los ",i," numeros es ",acum,", y su promedio es ",prom
FinProceso
