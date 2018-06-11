public class HelloWorldExample {


	public String  HelloWorldExample(){
		return "Hello World from web java!!"
	}

	public String criarBug(String param){
		param = null;
		return param.toUpperCase();
	}

	public int criarBug2(String param){
		param = 0;

		return 1/param;
	}
}
