public class FilaCarros {
   public static void main(String[] args) {
    Queue<String>carros=new LinkedList<>();

    //Adicionando elementos á fila
    carros.add("carro1");
    carros.add("carro2");
    carros.add("carro3");

    //utilizando o método poll paran retirar o elemento do topo da fila
    String carroRemovido=carros.poll();
    System.out.println("Carro removido da fila: " + carroRemovido);

    //utilizando o método peek para retornar o elemento do topo da fila
    String primeiroCarro=carros.peek();
    System.out.println("primeirocarro da fila:" + primeiroCarro);

    //Verificando se a fila está vazia boolean filavazia=
    carros.is.Empty();
    if (filaVazia) {
        System.out.println("A fila de carros está vazia.");  
    } else {
        System.out.println("A fila de carros nao esta vazia.");
    }
   }
}
