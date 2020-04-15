subProceso option(op)
	definir nb,dl como entero
	
	si op!=4 entonces
		Escribir Sin Saltar "how many " 
		segun op hacer
			1:Escribir sin saltar "Books"
			2:Escribir sin saltar "Journals"
			3:Escribir sin saltar "Videos"
		FinSegun
		Escribir " do you want to request?"
		leer nb
		
		mientras nb<1 hacer
			Escribir ""
			Escribir sin saltar "ERROR, The number of "
			segun op hacer
				1:Escribir sin saltar "Books"
				2:Escribir sin saltar "Journals"
				3:Escribir sin saltar "Videos"
			FinSegun
			Escribir " must be greater than 1 (repeat)"
			leer nb
		FinMientras	
	
	Escribir ""
	Escribir sin saltar "for how many days do you want the loan? (Maximum "
	segun op hacer
		1:Escribir Sin Saltar "4"
		2:Escribir Sin Saltar "3"
		3:Escribir Sin Saltar "2"
	FinSegun
	
	Escribir " days)"
	
	leer dl
	
	Escribir ""
	segun op hacer
		1:mientras dl<1 o dl>4 hacer
			Escribir "ERROR, The loan is maximum 4 days"
			leer dl
		FinMientras
		2:mientras dl<1 o dl>3 hacer
			Escribir "ERROR, The loan is maximum 3 days"
			leer dl
		FinMientras
		3:mientras dl<1 o dl>2 hacer
			Escribir "ERROR, The loan is maximum 2 days"
			leer dl
		FinMientras
    FinSegun

    SiNo
	    nb<-1
		dl<-1
    FinSi
	
	Escribir ""
	
	
	Escribir sin saltar "successful loan, you requested ",nb," " 
	segun op hacer
		1:si nb=1 entonces
			Escribir Sin Saltar "Book"
		SiNo
			Escribir sin saltar "Books"
		finsi 
		2:si nb=1 entonces
			Escribir Sin Saltar "Journal"
		SiNo
			Escribir sin saltar "Journals"
		finsi
		3:si nb=1 entonces
			Escribir Sin Saltar "Video"
		SiNo
			Escribir sin saltar "Videos"
		finsi
		4:Escribir sin saltar "Computer"
	FinSegun
	
	Escribir Sin Saltar " for ",dl," "
	
	si dl=1 Entonces
		Escribir "Day"
	SiNo
		Escribir "Days"
	FinSi
	
	Escribir ""
	Escribir "Press Any key..."
	Esperar Tecla
FinSubProceso

SubProceso return(op)
	si op!=4 entonces
		Escribir Sin Saltar "how many " 
		segun op hacer
			1:Escribir sin saltar "Books"
			2:Escribir sin saltar "Journals"
			3:Escribir sin saltar "Videos"
		FinSegun
		Escribir " do you must return?"
		leer nb
		
		mientras nb<1 hacer
			Escribir ""
			Escribir sin saltar "ERROR, The number of "
			segun op hacer
				1:Escribir sin saltar "Books"
				2:Escribir sin saltar "Journals"
				3:Escribir sin saltar "Videos"
			FinSegun
			Escribir " must be greater than 1 (repeat)"
			leer nb
		FinMientras	
		
		Escribir ""
		Escribir "for how many days do you have the loan?"
		
		leer dl
		
		mientras dl<1 Hacer
			Escribir "ERROR, The input must be grater than 1"
			leer dl
		FinMientras
		
		
		
	FinSi
	
		Escribir ""
FinSubProceso

Proceso sin_titulo
	definir op,op1 como entero
	
	Repetir
		
	Limpiar Pantalla
	
	Escribir "This software simulates book loans in a library.Made by Harrizon Soler"
	Escribir "Select an option"
	Escribir "1. Loan"
	Escribir "2. Return"
	Escribir "3. Exit"
	
	leer op
	Escribir ""
	
	segun op hacer
		1: Escribir "What do you want to request?"
			Escribir "1.Books (4 Days)"
			Escribir "2.Journals (3 Days)"
			Escribir "3.Videos (2 Days)"
			Escribir "4.Computer (1 Day)"
			leer op1
			
			mientras op1<1 o op1>4 hacer 
				Escribir ""
				Escribir "ERROR, The input must be between 1 and 4"
				leer op1
			FinMientras
			
			option(op1)
			
		2: Escribir "What do you want to return?"
			Escribir "1.Books"
			Escribir "2.Journals"
			Escribir "3.Videos"
			Escribir "4.Computer"
			leer op2
			
			mientras op2<1 o op2>4 hacer 
				Escribir ""
				Escribir "ERROR, The input must be between 1 and 4"
				leer op2
			FinMientras
			
			return(op2)
		De Otro Modo:
			Escribir ""
			Escribir "ERROR, the input must be between 1 and 3"
	FinSegun
	
    Hasta Que op=3
FinProceso
