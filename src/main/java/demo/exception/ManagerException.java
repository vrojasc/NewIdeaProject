package demo.exception;

/**
 * Created by poo2 on 01/07/2015.
 */
public class ManagerException extends RuntimeException{
    public ManagerException(Long id){
        super("Manager id: "+id+" no existe.");
    }
}
