# Programa HelloWorld por Agustín Muñoz Jimenez
Aquí podeís ver mi primera toma de contacto con el IDE Android Studio.
Este programa está diseñado con SDK 23 como mínimo. Esto quiere decir que, aunque el programa esté elaborado con el SDK 31, cualquier dispositivo que
tenga mínimo el SDK 23 podrá ejecutarlo.
Dicho programa se compone de un layout el cual contiene un TextView y un Botón. Su funcionabilidad es muy simple, ya que únicamente se cambia el
texto del TextView y el color del Botón en tiempo de ejecución.
Para poder lograr esto, primero creamos una variable de objeto para cada elemento del layout. Seguidamente instanciamos las variables haciendo
referencia a la id de cada elemento, situadas en la clase R (esta clase se crea automáticamente) y en la subclase id. Ej: (R.id.tvMessage).
Por último, tenemos que elaborar el código para conseguir nuestro objetivo. Para cambiar el texto usaremos el método setText y haremos referencia 
a el texto que tengamos en R.string. Para cambiar el color del botón emplearemos el método setBackgroundColor y haremos referencia al color que
tengamos en R.color, salvo que esta vez tendremos que usar el método getColor de la clase ContextCompact para sacar el color de R.string."color".

Captura del programa en ejecución:
![imagen](https://github.com/AgustinMunozJimenez/HelloWorld/blob/master/img/Screenshot_2021-09-25-19-35-57-672_com.example.helloworld.jpg)
