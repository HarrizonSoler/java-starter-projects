Proceso sin_titulo
	Definir n,acum como real
	Definir i como Entero
	
	acum<-0
	
	Escribir "This software determine which is the largest of three numbers.Made by Harrizon Soler"
	para i<-1 hasta 3 Hacer
		Escribir "Typer the value for number ",i
		leer n
		si n>acum Entonces
			acum<-n
		FinSi
	FinPara
	Escribir "The largest number is ",acum
FinProceso
