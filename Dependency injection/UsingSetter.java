public class UsingSetter 
{
  private Service service;
  public void setService(Service service){
    this.service = service;
  }
  public void doSomething(){
    service.serve();
  }

  
}

class Service{
  public void serve(){
    System.out.println("Service is serving...");
  }
}

//test

