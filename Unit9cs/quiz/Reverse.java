public static Reverse{
    public static String reverse (String s){
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
            result+=s.substring(i, i+1);
        }
        return result;
    }
    
    public static String[] reverseAll(String[] word){
        String[] result = new String[word.length]{
            for(int i = 0; i<words.length; i++){
                resutl[i] = reverse(word[i]);
            }
        }
    }
}