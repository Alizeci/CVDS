package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();
        person.setAlive(true);
        person.setAge(20);
        person.setId(102233);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    /**
     * Prueba para la primera clase de equivalencia
     * Edad inválida: age < 0 & age > 150 & alive:true
     */
    @Test
    public void validateInvalidateAge() {

        Person person = new Person();
        person.setAge(-4);
        person.setAlive(true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
		
        
        Person person2 = new Person();
        person2.setAge(155);
        person2.setAlive(true);
        
        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result2);
    }
    
    /**
     * Prueba para la segunda clase de equivalencia
     * Menor de edad: age < 18 & alive:true
     */
    @Test
    public void validateUnderAge() {

        Person person = new Person();
        person.setAge(17);
        person.setAlive(true);
        
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
        
        Person person2 = new Person();
        person2.setAge(10);
        person2.setAlive(true);
        
        RegisterResult result2 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.UNDERAGE, result2);
        
    }
    
    /**
     * Prueba para la tercera clase de equivalencia
     * Estado: La persona este muerta -> alive:false
     */
    @Test
    public void validateIsDead() {

        Person person = new Person();
        person.setAlive(false);
        
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
        
    }
    
    /**
     * Prueba para la cuarta clase de equivalencia
     * Duplicado: Exista dos veces la misma id (cédula) en el registro
     *  & alive:true & 18 >= edad < 150
     */
    @Test
    public void validateIsDuplicated() {

        Person person = new Person();
        person.setAlive(true);
        person.setAge(23);
        person.setId(1075689433);
        RegisterResult result = registry.registerVoter(person);
        Person person2 = new Person();
        person2.setAlive(true);
        person2.setAge(21);
        person2.setId(1075689433);
        RegisterResult result1 = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, result1);
        
    }
    
    /**
     * Prueba para la quinta clase de equivalencia
     * Válida: 18 >= edad < 150 & alive:true & No exista dos veces
     *  la misma id (cédula)
     */
    @Test
    public void validateValidRegistry() {

        Person person = new Person();
        person.setAlive(true);
        person.setAge(34);
        person.setId(1075689433);
        
        Person person2 = new Person();
        person2.setAlive(true);
        person2.setAge(26);
        person2.setId(1075689412);
        
        RegisterResult result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.VALID, result);
        
    }
    

    // TODO Complete with more test cases
}