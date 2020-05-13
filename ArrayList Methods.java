class Test{
public static void main(String args[]){  
ArrayList<Integer> al1 = new ArrayList<Integer>();
al1.add(20);
al1.add(9);

ArrayList<Integer> al2 = new ArrayList<Integer>();
al2.add(22);
al2.add(53);

al1.addAll(al2);

al2.retainAll(al1);
System.out.println(al2);
Collections.sort(al1);
System.out.println(al1);
System.out.println(al1.get(3));
System.out.println(al1.contains(22));
al1.remove(0);
System.out.println(al1);
al1.add(10);
System.out.println(al1);
al1.add(0, 9);
System.out.println(al1);
al1.ensureCapacity(0);
System.out.println(al1);
ArrayList<String> students = new ArrayList<String>(); 

// Add Strings to list 
// each string represents student name 
students.add("Ram"); 
students.add("Mohan"); 
students.add("Sohan"); 
students.add("Rabi"); 
students.add("Shabbir"); 

// apply removeIf() method 
// we are going to remove names 
// start with S 
students.removeIf(n -> (n.charAt(0) == 'S')); 

System.out.println("Students name Does not start with S"); 
// print list 
for (String str : students) { 
    System.out.println(str); 

}

}
