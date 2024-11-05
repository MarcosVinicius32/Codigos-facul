
    
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int veta [] = new int[10];
     int i;
     for (i=0;i<=9;i++){
         System.out.printf("digite o valor para a posicao %d: de veta:",i);
     if ( i%2==0){
      veta[i] = read.nextInt()*2;
     } 
     else{
      veta[i] = read.nextInt()+ 9;
     }
     }
     for(i=0;i<=9;i++){
       System.out.printf("Valor na posicao %d de veta: %d \n",i,veta[i]);
     }   
    }   
}
