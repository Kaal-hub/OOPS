// Here, T is bounded by Object i.e. java.lang.Object 
class Geeks<T extends String> { 

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
