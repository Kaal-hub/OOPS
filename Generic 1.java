class Geeks<T> { 

// Here, T will be replaced by String i.e. java.lang.String 
	T str; 
	Geeks(T o) 
	{ 
		str = o; 
	} 
	T getob() 
	{ 
		return str; 
	} 
} 

class Vehicle {
	public static void main(String args[])
	{
		Geeks a = new Geeks(123);  // No error even if we don't parameterize T , but then here there will be no meaning of using 
		                           // generics because now there is no restriction on type of object stored in object of type Geeks
		Geeks b = new Geeks("rahul");
		System.out.println(a.getob());
		System.out.println(b.getob());
	}
}

// Result : 123
//          rahul

// The above code is same as using Object instead of Generics 
class Geeks { 


	Object str; 
	Geeks(Object o) 
	{ 
		str = o; 
	} 
	Object getob() 
	{ 
		return str; 
	} 
} 

class Vehicle {
	public static void main(String args[])
	{
		Geeks a = new Geeks(123);
		Geeks b = new Geeks("rahul");
		System.out.println(a.getob());
		System.out.println(b.getob());
	}
}

// result - 123
//          rahul
