package util;

/**
 * Created by 71500286 on 23/02/2018.
 */

public class Pilha {
    private String [] arrayStack;
    private int size = -1;
    public Pilha (int size){
        this.arrayStack = new String[size];
    }

    public void push(String element) throws Exception{
        if (!isFull()){
            size++;
            for (int i=size;i>0;i--){
                this.arrayStack[i] = this.arrayStack[i-1];
            }
            this.arrayStack[0] = element;
        }
        else{
            throw new Exception("ERRO: Pilha Cheia!");
        }
    }

    public void pop() throws Exception{
        if (!isEmpty()){
            for(int i=0;i<size;i++){
                this.arrayStack[i]=this.arrayStack[i+1];
            }
            this.arrayStack[size]=null;
            size--;
        }
        else{
            throw new Exception("ERRO: Pilha Vazia!");
        }
    }

    public boolean isEmpty() {
        if (this.arrayStack[0]==null)
            return true;
        return false;
    }

    public int size() {
        return size+1;
    }

    public String top() throws Exception{
        if (isEmpty())
            throw new Exception("ERRO: Pilha Vazia!");
        return this.arrayStack[0];
    }

    private boolean isFull(){
        if (this.arrayStack[arrayStack.length-1]!=null)
            return true;
        return false;
    }
}