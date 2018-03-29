CICLO DE EJECUCION DE LOS METODOS DEL PATRON UTILIZADO:

Observable notifica que se realizo un cambio con el metodo setChanged() y luego avisa al Observer del cambio efectuado con notifiObservers() pasandole por parametro los cambios y borrando el modificador de cambio en hadChanged() con clearChanged(). Observer implementa el metodo update() donde recibe el objeto "actualizado" y los cambios, y segun se halla implementado lo que hace con estos datos.

QUE ARGUMENTOS SE PASAN AL METODO UPDATE() Y EN QUE MOMENTO SE EJECUTA DICHO METODO?

Update() se ejecuta dentro de notifyObservers() cuando observable avisa del cambio realizado.
Los argumentos de Update() son: Object o (el objeto con los cambios hechos) y Object arg (un arreglo de los cambios realizados)