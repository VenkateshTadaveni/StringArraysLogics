package com.sathya.deadlockex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;

class Mythread1 implements Serializable{
	int id;
	String ename;
	double esal;
	
	
	public Mythread1(int id, String ename, double esal) {
		super();
		this.id = id;
		this.ename = ename;
		this.esal = esal;
	}
}


public class SerializeDeserializeEx {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
	Mythread1 e=new Mythread1(123, "venky", 1000.0);
	FileOutputStream fileOutputStream=new FileOutputStream("abc.txt");
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(e);
	fileOutputStream.close();
	System.out.println("serialization process complete...");
	}
}