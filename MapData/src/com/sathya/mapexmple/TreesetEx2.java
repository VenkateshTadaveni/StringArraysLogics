package com.sathya.mapexmple;


import java.util.TreeSet;

public class TreesetEx2 {

	public static void main(String[] args) {
TreeSet<UserTreeSetEx> user=new TreeSet<UserTreeSetEx>(new Namecomp()) ;
user.add(new UserTreeSetEx("Mr.ratan", "ratan", 25, "ratan@gmail.com",9000100010l));
user.add(new UserTreeSetEx("Kalyan", "chintu", 23, "kalyan@gmail.com",9878378789l));
user.add(new UserTreeSetEx("Karthik", "peace", 22, "karthik@gmail.com",7707707707l));
user.add(new UserTreeSetEx("Santhosh", "santhu", 21, "santhosh@gmail.com",9515761770l));
user.add(new UserTreeSetEx("Shiva", "hello", 21, "shiva@gmail.com",895681770l));
//
//System.out.println(user);

//TreeSet<UserTreeSetEx>user1= (TreeSet<UserTreeSetEx>) user.descendingSet();
//
//System.out.print(user1);
for(UserTreeSetEx u:user) {
	System.out.println(u.uname+"  "+u.upass+"   "+u.age+" "+u.email+" "+u.phnno);
}
}
}