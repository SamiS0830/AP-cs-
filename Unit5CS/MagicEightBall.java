public class MagicEightBall{
    public MagicEightBall(){
  
    }
    public String ask(String input){
        int a = (int)(Math.random()*5)+1;
        if(a == 1){
            return("Yes");
        }
        else if(a==2){
            return("no");
        }
        else if(a==3){
            return("ask again later");
        }
       else  if(a==4){
            return("i dunno");
        }
        else if(a==5){
            return("if you go to sleep tomorwo than maybe");
        }
      else{
          return("meepmorp");
      }
    }

      private int a;
}