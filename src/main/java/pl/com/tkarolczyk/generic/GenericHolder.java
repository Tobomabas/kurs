package pl.com.tkarolczyk.generic;

public class GenericHolder<E> {

    E secret;

    public E getSecret(){
        return secret;

    }
    public void setSecret(E secret){
        this.secret = secret;

    }

}
