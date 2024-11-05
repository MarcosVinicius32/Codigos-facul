 public static void main(String[] args) {
  Scanner read = new Scanner(System.in);
  int veta []= new int[8];
  int vetb []= new int[8];
  int i;
  for(i = 0;i<=7;i++){
  
      System.out.printf("Digite um valor de uma posicao %d: ", i);
      veta[i]= read.nextInt();
      vetb[i]= veta[i]*3;
  }
  for(i = 0;i<=7;i++){
      System.out.printf("posicao %d a: %d \t",i,veta[i]);
       System.out.printf("posicao %d b: %d \n",i,vetb[i]);

  }
    }
    
}
