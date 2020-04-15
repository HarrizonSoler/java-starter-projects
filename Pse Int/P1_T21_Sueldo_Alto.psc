Proceso sin_titulo
	Definir ne,i como Entero
	Definir acum,alto,sueldo,dias,total Como Real
	Definir c1 Como Logico
	
	Escribir "Este software calcula el salario promedio,total y el mas alto de N empleados. Hecho por Harrizon Soler"
	Escribir "Digite el numero de empleados"
	leer ne
	
	si ne < 1 entonces 
		Escribir "Entrada no valida , el numero de empleados debe ser mayor o igual a 1"
	SiNo
		acum <- 0
		alto <- 0
		c1 <- Verdadero
		para i = 1 hasta ne Hacer
			Escribir "Digite el sueldo del empleado " , i
			leer sueldo
			Escribir "Digite los dias trabajados por el empleado" , i , ",(entre 1 y 30) "
			leer dias
			si sueldo < 0 o dias < 0 o dias > 30 entonces 
				Escribir "El sueldo no puede ser menor a 0 y los dias no pueden ser menores a 0 ni mayores a 30"
				c1 <- Falso
				i <- i-1
			SiNo
				acum <- acum + ((sueldo/30)*dias)
				si alto < sueldo Entonces
					alto <- sueldo
				FinSi
			FinSi
		FinPara
		si c1 = verdadero Entonces
			total <- acum/ne
			Escribir "El sueldo promedio es " , total , " , el sueldo total es ", acum , " y el sueldo mas alto es " , alto
		FinSi
	FinSi
FinProceso
