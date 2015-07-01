package demo.exception;

/**
 * Created by poo2 on 01/07/2015.
 */
public class ProjectException extends RuntimeException{
    public ProjectException(Long id){
        super("Project id: "+id+" no existe.");
    }
}
