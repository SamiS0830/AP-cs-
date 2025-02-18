public class ArrayInitialize{
    
  
    
public static void printStuff(int[][] ten){
    for(int i=0; i<ten.length; i++){
        for(int j=0; j<ten[i].length; j++){
            System.out.print(ten[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();
}
        

 public static void fiveSize(double[][] five){

        for(int i = 0; i<five.length; i++){
            for(int j=0; j<five.length; j++){
                System.out.print(five[i][j]+" ");
            }
            System.out.println(); //how does this row printing wrk??
        }
        System.out.println();
        }

public static int smallNumb(int[][] num){
    int numb =1000000000;
   for(int i=0; i<num.length; i++){
       for(int j=0; j<num[i].length;j++){
           if(numb>num[i][j]){
               numb=num[i][j];
           }
    
       }
   }
           return numb;
}
    
public static float sum(float[][] nums){
    int total = 0;
 for(int i=0; i<nums.length; i++){
       for(int j=0; j<nums[i].length;j++){
          total+= nums[i][j];
             
           }
       
       }
        return total;
   }

public static int aWords(String[][] words){
    int total =0;
    for(int i=0; i<words.length; i++){
        for(int j=0; j<words[i].length; j++){
            if(words[i][j].substring(0, 1).equalsIgnoreCase("a")){
                total+=1;
            }
        }
    }
    return total;
}


public static void main(String[] args){
    

int [][] values = new int [4][4];
    
int[][] ten = new int[10][10];
     for(int i = 0; i<ten.length; i++){
            for(int j = 0; j<ten[i].length; j++){
              if(i==j){
                  ten[i][j]=1;
              } 
             else{
                 ten[i][j]=0;
             }
            }
     }
    
String[][] words = {
    {"hello", "amaze", "perf"},
    {"aardvark", "lovely", "mice"},
    {"smith"}
};

double[][] five = new double[5][5];
    for(int i=0; i<five.length; i++){
        for(int j=0; j<five[i].length; j++){
            five[i][j]= 11.0+j+(i*10.0);
        }

    }
    
int[][] sixByFive = new int [6][5];
  for(int i = 0; i<sixByFive.length; i++){
      for(int j=0; j<sixByFive[i].length;j++){
          sixByFive[i][j]= i+1;
      }
  }

float[][] floatNums = {
    {8.5f, 3.2f, 5.1f},
    {5.0f, 3.1f, 3.2f},
    {4.1f, 5.7f}
};

printStuff(ten);
printStuff(values);
fiveSize(five);
printStuff(sixByFive);
System.out.println("small: " + 
smallNumb(sixByFive) + " " + "words: " + 
aWords(words) + " " + "sum: " + 
" "+ sum(floatNums)
                          );


    }

}