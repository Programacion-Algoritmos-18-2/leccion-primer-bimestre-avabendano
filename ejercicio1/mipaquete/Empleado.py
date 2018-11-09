# Clase Padre Empleado
class Empleado(object):

    # Constructor de Clase Empleado
    def _init_(self):
        self.nombre = ''
        self.apellido = ''
        self.cedula = ''
        self.comision_fija = 0

    # metodos set
    def agregar_nombre(self, nombre):
        self.nombre = nombre

    def agregar_apellido(self, apellido):
        self.apellido = apellido

    def agregar_cedula(self, cedula):
        self.cedula = cedula

    def agregar_comision_fija(self, comision):
        self.comision_fija = comision
    
    # metodos get
    def obtener_nombre(self):
        return self.nombre

    def obtener_apellido(self):
        return self.apellido

    def obtener_cedula(self):
        return self.cedula

    def obtener_comision_fija(self):
        return self.comision_fija
    
    # metodo para presnetar datos
    def presentar_datos(self):
        cadena = "Información de %s %s\n\tCedula %s"%(self.obtener_nombre(), self.apellido, self.obtener_cedula())
        return cadena


# Clase Hija EmpleadoPorHoras
class EmpleadoPorHoras(Empleado):

    # constructor de clase
    def _init_(self):
        # se llama al acontructor de la clase padre
        super(EmpleadoPorHoras, self)._init_()
        self.numero_horas = 0
        self.valor_hora = 0

    #metodos set
    def agregar_numero_horas(self, numero_horas):
        self.numero_horas = numero_horas

    def agregar_valor_hora(self, valor_hora):
        self.valor_hora = valor_hora

    # metodos get
    def obtener_numero_horas(self):
        return self.numero_horas

    def obtener_valor_hora(self):
        return self.valor_hora

    # Calculamos el sueldo final: horas * su valor
    def calcular_sueldo_final(self):
        return self.numero_horas * self.valor_hora

    # presentamos datos
    def presentar_datos(self):
        cadena = "%s\nNumero horas: %s\nValor hora: %s\nSueldo Final: %s" %(super(EmpleadoPorHoras, self).presentar_datos(),
        self.obtener_numero_horas(),
        self.obtener_valor_hora(),
        self.calcular_sueldo_final())
        return cadena
    
    def calcular_valor_sueldo(self):
        print(self.numero_horas)
        print(self.valor_hora)
        print(self.comision_fija)


# Clase Hija EmpleadoFijo
class EmpleadoFijo(Empleado):

    #constructor de clase
    def _init_(self):
        # Llamamos al constructor de la clase padre
        super(EmpleadoFijo, self)._init_()
        self.sueldo_fijo = 0
        self.descuento_seguro = 0
    
    # Metodos set
    def agregar_sueldo_fijo(self, sueldo_fijo):
        self.sueldo_fijo = sueldo_fijo

    def agregar_descuento_seguro(self, descuento_seguro):
        self.descuento_seguro = descuento_seguro

    # metodos get
    def obtener_sueldo_fijo(self):
        return self.sueldo_fijo

    def obtener_descuento_seguro(self):
        return self.descuento_seguro

    # Calculamos el sueldo final: sueldo - (sueldo * descuento)
    def calcular_sueldo_final(self):
        return (self.sueldo_fijo - (self.sueldo_fijo * (self.descuento_seguro / 100)))
    
    # presentamos datos
    def presentar_datos(self):
        cadena = "%s\nSueldo Fijo: %s\nDescuento: %s\nSueldo Final: %s" %(super(EmpleadoFijo, self).presentar_datos(),
        self.obtener_sueldo_fijo(),
        self.obtener_descuento_seguro(),
        self.calcular_sueldo_final())
        return cadena 