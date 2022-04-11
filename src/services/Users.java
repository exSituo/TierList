package services;

import java.util.Map;

import javax.transaction.InvalidTransactionException;

import org.apache.log4j.Logger;

import dao.Transaction;

public class Users
{
    private static Users instance = new Users();
    // collection d'animé (key --> id user  value --> nom)
    private Map<Integer, String> collUsers;

    
    protected Users()
    {
        
    }
    
    public static final Users getInstance() 
    {
        return instance;    
    }
    
    private void init() throws InvalidTransactionException
    {
        try (Transaction transaction = new Transaction("Transaction d'initialisation des users")) 
        {
            
        }
        
        catch (Exception e)
        {
            Logger.getLogger(Users.class).error(e);
        }
    
    }
}
