class Empleado(object):

    def _init_(self):
        self.nombre = ''
        self.apellido = ''
        self.cedula = ''
        self.comision_fija = 0
    
    def agregar_nombre(self, nombre):
        self.nombre = nombre

    def agregar_apellido(self, apellido):
        self.apellido = apellido

    def agregar_cedula(self, cedula):
        self.cedula = cedula

    def agregar_comision(self, comision):
        self.comision_fija = comision
    
    def obtener_nombre(self):
        return self.nombre

    def obtener_apellido(self):
        return self.apellido

    def obtener_cedula(self):
        return self.cedula

    def obtener_comision_fija(self):
        return self.comision_fija
    
    def presentar_datos(self):
        cadena = "Información de %s %s\n\tCedula %s"%(self.obtener_nombre(), self.apellido, self.obtener_cedula())
        return cadena