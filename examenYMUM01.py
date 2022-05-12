def examenYMUM1():
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
def examenYMUM2():
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
    total=precio-descuento
    igv=total*0.18
    precio=total+igv
    #datos de salida
    print(f"el descuento de igv es de: {igv}")
    print(f"el descuento es de :{decuento}")
    print(F"total a pagar es de :{total}")
def examenYMUM3():
    #definir variables 
    valor1=float
    valor2=float
    signo=str
    total=float
    #datos de entrada
    valor1=float(input("ingrese el primer numero :"))
    valor2=float(input("ingrese el segundo numero:"))
    print("+=suma")
    print("-=resta")
    print("/=division")
    print("*=multiplicacion")
    print("^=potencia")
    print("R = RAIZ")
    print("%=modulo de 2")
    signo=str(input("ingrese el signo:"))
    #proceso
    if signo=="+":
        total=valor1+valor2
    elif signo=="-":
        total=valor1-valor2
    elif signo=="/":
        total=valor1/valor2
    elif signo=="*":
        total==valor1*valor2
    elif signo=="^":
        total=valor1^valor2
    elif signo=="R":
        total=valor1**0.5
    else:
        total=valor1-valor1
    #datos de salida
    print(f"resultado :{total}")
def examenYMUM4():
    #definir entrada
    edad=int
    vacuna=int
    genero=str
    mensaje=str
    #datos de entrada
    edad=float(input("ingrese su edad:"))
    print("genero:mujer-varon")
    genero=str(input("ingrese su genero :"))
    #proceso
    if edad>70:
        mensaje=("la vacuna es de tipo C")
    elif edad>16 and edad<=69 and genero=="mujer":
        mensaje=("la vacuna es de tipo B")
    elif edad>16 and edad<=69 and gneron=="varon":
        mensaje=("la vacuna es de tipo A")
    else:
        mensaje=("la vacuna es de tipo A")
    #datos de salida
    print(mensaje)
#EJERCICIOYMUM5
#Definir variables
numero=float
#Datos de entrada
numero=float(input("Ingrese el numero del ejercicio: "))
#proceso
if numero==1:
    examenYMUM1()
elif numero==2:
    examenYMUM2()
elif numero==3:
    examenYMUM3()
else:
    examenYMUM4()
#Datos de Salida
print("Gracias por ver")


