package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;


public class Registry {
	private ArrayList<Person> personasRegistradas = new ArrayList<Person>();
	
	public RegisterResult registerVoter(Person p) {	
		RegisterResult result = RegisterResult.VALID;
		if((p.getAge() >= 18 && p.getAge() < 150) && p.isAlive()== true) {
			for(Person n:personasRegistradas) {
				if(n.getId() == p.getId()) {
					result = RegisterResult.DUPLICATED;
						}
					}
				}
		
		else if ((p.getAge()<0 || p.getAge() > 150)&&(p.isAlive())) {

				result= RegisterResult.INVALID_AGE;
				}
		else if ((p.getAge()<18 && p.getAge()>0)&&(p.isAlive())) {
				result= RegisterResult.UNDERAGE;
				
				}
	
		else if (p.isAlive()==false) {
			result=RegisterResult.DEAD;
				}
		personasRegistradas.add(p);
		return result;
    }
}
