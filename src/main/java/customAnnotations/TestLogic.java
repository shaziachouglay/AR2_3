package customAnnotations;

public class TestLogic {



    public enum ONE implements MenuTabBarMarkerInterface {
        Hello("hello"), World("World");

        private String stringvalue;

        ONE(String s){
            this.stringvalue = s;
        }
        public String toString(){
            return stringvalue;
        }
    }




    public enum TWO implements MenuTabBarMarkerInterface {
        Come("come"), Home("Home");

        private String stringvalue;

        TWO(String s){
            this.stringvalue = s;
        }
        public String toString(){
            return stringvalue;
        }


    }


    public void clickOnSomething(MenuTabBarMarkerInterface option){

        System.out.println(option.toString());

    }

    Child child2 = new Child();
    public static void main(String[] args) {

        Child child = new Child();
        child.getMessage();


    }
}
