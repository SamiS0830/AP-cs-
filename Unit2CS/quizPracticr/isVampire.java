public class isVampire{
    
 static boolean isVampire(float hour, boolean awake){
   if(awake==true && (hour <6 || hour>22)){
       return true;
   }
   else if(awake==false && (hour>6 || hour<22)){
    return true; 
}
     else{
         return false;
     }
}
}