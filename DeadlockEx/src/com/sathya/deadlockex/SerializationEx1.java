package com.sathya.deadlockex;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Emp{
	   
	   int eid;
	   String ename;
	   Double esalary;
	public Emp(int eid, String ename,Double esalary){
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;

	}


	}

	public class SerializationEx1{
	 public static void main(String[] args)throws IOException,ClassNotFoundException{

	Emp emp = new Emp(11,"Dilli",24000.00);
	FileInputStream outputStream = new FileInputStream("abc.text");
	objectoutputstream objectoutputstreamm = new ObjectInputStream(outputStream);
	objectoutputstream.writeobject(emp);
	outputStream.close();
	System.out.prinln("serialization process compleated..");

	//==> deserialization : reading the data
	fioleinputstream inputstram = new fileinputsream ("abc.txt");
	Emp e = (emp) objectinputstream.readobject();
	System.out.println(e.eid+" "+e.ename+" " + e.esalary);
	System.out.println("desynchronization process compleated");
	}

}