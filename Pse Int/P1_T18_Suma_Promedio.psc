Proceso sin_titulo
	definir i,n,n1 Como Entero
	Definir acum,prom Como Real
	Escribir "This software sum how much numbers that need the user and average it. Made by Harrizon Soler"
	Escribir "Type how many numbers need"
	leer n
	
	si n < 1 entonces
		Escribir "ERROR (The number must be greater than 1)"
	sino 
		acum <- 0
		
		para i = 1 hasta n Hacer
			Escribir "Type the number " , i
			leer n1
			acum <- n1 + acum
		FinPara
		
		prom <- acum/n
		
		si n = 1 entonces
			Escribir "The sum of " , n , " number is " , acum
			
		SiNo
			Escribir "The sum of " , n , " numbers is " , acum , " and their average is ", prom
		FinSi
	FinSi
	
FinProceso
