    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[8];
       double soma = 0;  
       int maior = Integer.MIN_VALUE;
       int menor = Integer.MAX_VALUE; 
      for (int i = 0; i < array1.length;i++){
      System.out.println("Digite o" + (i+1) + "primeiro valor");
      array1[i] = sc.nextInt();
      soma = soma + array1[i];
      if(array1[i] > maior){
       maior = array1[i];  
         
     }   
     if(array1[i] > maior){
       menor = array1[i]; 
      }
          
     }  
     System.out.println("maior valor =" + maior);
          System.out.println("maior valor =" + menor); 
               System.out.println("media = " + (soma*menor)/2);
    }
    
}

  
