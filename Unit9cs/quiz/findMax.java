public static double findMax(ArrayList<Double> numb){
    double result = numb.get(0.0);
    for(double value : numb){
        if(value>result){
            result = value;
        }     
    }
    return result;
}

public static int filterGoodScores(ArrayList<Integer> numb){
    ArrayList<Integer> result = new ArrayList<Integer>();
    for(int i = 0; i<numb.length; i++){
        if(i>90){
            result.add(i);
        }
    }
    return result;
}

public static String reverse(String word){
    String result = "";
    for(int i = word.length; i>=0; i++){
        result+=i;
    } 
}
public static String[] reverseAll(String[] numb){
    for(int i = 0; i<numb.lenght)
}

public static int[] fibonacci(int n){
    int[] result;
    if(n<1){
        int[] a = {1}
        return a;
    }
    else if(n<2){
        return result[0]= 1;
    }
    result[0]=1;
    result[1]= 1;
    for(int i = 2; i<n; i++){
        result[i] = result[i-2]+result[i-1];
    }
    return result
}