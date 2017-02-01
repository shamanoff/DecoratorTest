package facesTest;

public interface IDev {

   default String makeJob(){
       return " I'm writing code!";
   }
    default String makeSeniorJob(){
        return " Senior is writing code!";
    }
}
