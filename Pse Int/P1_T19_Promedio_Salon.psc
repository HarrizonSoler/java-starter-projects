Proceso sin_titulo
	Definir est,i como entero
	Definir acum,n1,n2,n3,prom como Real
	Definir cond como logico
	
	Escribir "This software calculate the final grade of n students and their 3 grades. Made by Harrizon Soler"
	Escribir "Type the number of students"
	Leer est
	
	si est < 1 entonces
		Escribir "ERROR, the number of students must be greater or equal to 1"
	SiNo
		acum <- 0
		cond <- verdadero
		
		Para i = 1 hasta est Hacer
			Escribir "Type the grade 1 of " , i , " student"
			leer n1
			Escribir "Type the grade 2 of " , i , " student"
			leer n2
			Escribir "Type the grade 3 of " , i , " student"
			leer n3
			si n1 < 0 o n2 < 0 o n3 < 0 Entonces
				Escribir "Some of the grades are incorrect, there must b greater than 0"
				est <- i
				cond <- falso
			SiNo
				acum <- ((n1*0.20)+(n2*0.30)+(n3*0.50))+acum
			FinSi
		FinPara
		
		si cond = verdadero entonces
			prom <- acum/est
			Escribir "The final grade of the curse is ", prom
		FinSi
	FinSi
FinProceso
