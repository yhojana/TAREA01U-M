    def ejercicio1
    #definir variables
    examen=float
    entrevista=float
    test=float
    nota=float
    mensaje=str
    #datos de entrada
    examen=float(input("ingrese la nota examen:"))
    entrevista=float(input("ingrese la nota de la entrevista:"))
    test=float(input("ingrese la nota del test spicologico:"))
    #proceso
    a=examen*0.40
    b=entrevista*0.35
    c=test*0.25
    nota=a+b+c
    if nota>=17:
        mensaje=("obtuvo la vacante ,nivel 4")
    elif nota<17 and nota>=14:
        mensaje=("obtuvo la vacante ,nivel 3")
    elif nota<14 and nota>= 11:
        mensaje=("obtuvo la vacante,nivel 2")
    else:
        mensaje=("no puede obtener una vacante  nivel 1")
    #datos de salida
    print(mensaje)

    def ejercicio2
    #definir variables
    precio=float
    igv=float
    venta=float
    descuento=float 
    total=float
    precio=float
    #datos de entrada
    precio=float(input("ingrese el precio:"))
    #proceso
    if precio>=2000:
        descuento=precio*0.10
    elif precio<2000 and precio>=1000:
        decuento=precio*0.5
    elif precio<1000 and precio>=500:
        descuento=precio*0.2
    else:
        decuento=precio*0
        igv=total*0.18
        total=descuento-precio
        precio=total+igv
    #datos de salida
    print(f"el descuento de igv es de: {igv}")
    print(f"el descuento es de :{decuento}")
    print(F"total a pagar es de :{total}")
    

    def ejercicio3
    #definir variables 
    valor1=float
    valor2=float






