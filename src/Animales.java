//Tarea: Crear clase abstracta llamada animal.
//- Tener dos metodos abstractos, desplazarse y hacer sonidos.
//- Instanciar 5 animales distintos, que hereden de la clase abstracta llamada animal.
//- Cada animal, debe tener esos 2 métodos (sysout con la información).

public abstract class Animales {
	
	//ATRIBUTOS
	String nombre;
	
	//MÉTODOS
	
	//Moverse
	public abstract void desplazarse();
	
	//Hacer sonido
	public abstract void hacerSonido();

} //class animales

////////////////////////////////////////////

class Tigre extends Animales{

	@Override
	public void desplazarse() {
		System.out.println("El tigre se mueve en 4 patas");
		
	}

	@Override
	public void hacerSonido() {
		System.out.println("El tigre ruge");
	}
	
} // class tigre


////////////////////////////////////////////

class Serpiente extends Animales{

@Override
public void desplazarse() {
System.out.println("La serpiente repta");

}

@Override
public void hacerSonido() {
System.out.println("La serpiente sisea");
}

} // class serpiente

////////////////////////////////////////////

class Ballena extends Animales{

@Override
public void desplazarse() {
System.out.println("La ballena nada");

}

@Override
public void hacerSonido() {
System.out.println("La ballena canta");
}

} // class ballena

////////////////////////////////////////////

class Aguila extends Animales{

@Override
public void desplazarse() {
System.out.println("El águila vuela");

}

@Override
public void hacerSonido() {
System.out.println("El águila chilla");
}

} // class aguila

////////////////////////////////////////////

class Camaleon extends Animales{

@Override
public void desplazarse() {
System.out.println("El camaleón escala");

}

@Override
public void hacerSonido() {
System.out.println("El camaleón no tiene cuerdas vocales :c");
}

} // class camaleón



