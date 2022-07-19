package it.euris.patterns.structural.proxy;

public interface BusinessLogic {
    void process();
}

class BusinessLogicRealSubject implements BusinessLogic {

    @Override
    public void process() {
        System.out.println("Inside Real Subject");
    }

}

class BusinessLogicProxy implements BusinessLogic {

    private final BusinessLogic real = new BusinessLogicRealSubject();

    private String user;

    public BusinessLogicProxy(String user) {
        this.user = user;
    }

    @Override
    public void process() {
        if(user.equals("admin")){
            real.process();
        }
        else{
            throw new RuntimeException("Invalid user");
        }
    }

}