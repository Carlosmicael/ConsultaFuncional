
//////////////////Funcion simsop1/3 Correcta Optimizada No se repite el codigo////////////////
/////////////////////////////////IMPLEMENTAR FUNCIONAL////////////////////////////////////////
def integral1(num:Double):Double=(-num * num) + (8 * num) - (12)

def integral2(num:Double):Double=(3)*(Math.pow(num,2))

def integral3(num:Double):Double=(num) + (2 * num * num) - (Math.pow(num, 3)) + (5 * Math.pow(num, 4))

def integral4(num:Double):Double={
  val p1: Double = (2 * num) + (1)
  val p2: Double = (Math.pow(num, 2)) + (num)
  val result: Double = p1 / p2
  result
}

def integral5(num:Double):Double=(Math.pow(2.71828,num))

def integral6(num:Double):Double=(1) / (math.sqrt(num - 1))

def integral7(num:Double):Double={
  val falla: Double = (1) + (Math.pow(num, 2))
  val result2: Double = (1) / falla
  result2
}
//////////////////////////FuncionIntegradoraGeneral/////////////////////////////////////
def funcionIntegracion(Integra:(Double)=>Double,a:Double,b:Double):Double={
    val proceso1:Double=Integra(a)
    val proceso2:Double=Integra(b)
    val X:Double=(a+b)/2
    val proceso3:Double=Integra(X)
    val proceso3Final:Double=proceso3*4
    val suma:Double=(proceso1+proceso2+proceso3Final)/6*(b-a)
    suma
}
val primero:Double=funcionIntegracion(integral1,3,5)
val segun:Double=funcionIntegracion(integral2,0,2)
val tercer:Double=funcionIntegracion(integral3,-1,1)
val cuart:Double=funcionIntegracion(integral4,1,2)
val quinto:Double=funcionIntegracion(integral5,0,1)
val sexto:Double=funcionIntegracion(integral6,2,3)
val septimo:Double=funcionIntegracion(integral7,0,1)
////////////////////////////////////////////////////////////////////////////////////
///////////////////////valor exacto obtenido///////////////////////////
def errorAproximacion(valorObtenido:Double,valorEsperado:Double):Double={
  val error:Double=math.abs(valorObtenido-valorEsperado)
  error
}
val Error1:Double=errorAproximacion(primero,7.33)
val Error2:Double=errorAproximacion(segun,8.0)
val Error3:Double=errorAproximacion(tercer,3.333)
val Error4:Double=errorAproximacion(cuart,1.09861)
val Error5:Double=errorAproximacion(quinto,1.71828)
val Error6:Double=errorAproximacion(sexto,0.828427)
val Error7:Double=errorAproximacion(septimo,0.785398)
///////////////////////////////////////////////////////////////////////////////




