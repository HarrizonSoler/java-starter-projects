Proceso sin_titulo
	Definir OP,n1,n2 como Entero
	Definir calc como real
	
	Escribir "Este software calcula dos numeros con las 4 operaciones basicas"
	Escribir "Hecho por Harrizon Soler"
	Escribir ""
	Repetir
		Limpiar Pantalla
		Escribir "Eliga una opcion(1-5)"
		Escribir "1.Sumar 2 Numeros"
		Escribir "2.Restar 2 Numeros"
		Escribir "3.Multiplicar 2 Numeros"
		Escribir "4.Dividir 2 Numeros"
		Escribir "5.Salir"
		
		Leer OP
		
		Segun OP hacer
			1: Escribir "Digite el primer numero"
				leer n1
				Escribir "Digite el segundo numero"
				leer n2
				calc <- n1+n2
				Escribir "La suma de ",n1," y ",n2," da ",calc
			2: Escribir "Digite el primer numero"
				leer n1
				Escribir "Digite el segundo numero"
				leer n2
				calc <- n1-n2
				Escribir "La resta entre ",n1," y ",n2," da ",calc
			3: Escribir "Digite el primer numero"
				leer n1
				Escribir "Digite el segundo numero"
				leer n2
				calc <- n1*n2
				Escribir "El producto entre ",n1," y ",n2," da ",calc
			4: Escribir "Digite el primer numero"
				leer n1
				Escribir "Digite el segundo numero"
				leer n2
				calc <- n1/n2
				Escribir "La division entre ",n1," y ",n2," da ",calc
			5: Escribir "Vuelva pronto"
			De Otro Modo:
				Escribir "Entrada no valida"
		FinSegun
		Escribir "Presione una tecla"
		Esperar Tecla
	Hasta Que OP=5

	
FinProceso
