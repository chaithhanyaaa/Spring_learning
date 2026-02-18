// we write this controller class

public class UsingConst{
  private Service service;
  public UsingConst(Service service){
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


// without DI

/*
public class UsingConst{
  private Service service;
  public UsingConst(){
    Repository repository = new Repository();
    this.service = new Service(repository);
  }

  public void doSomething(){
    service.serve();
  }
 */