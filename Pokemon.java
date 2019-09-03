public class Pokemon{

	private String name;
	private int hp;
	private int maxHp;

	public Pokemon(String name){

		this.name = name;
       
       if (this.maxHp < 100) {

           this.maxHp=(int)(Math.random()*10);
       	}

       	if (this.hp < maxHp) {

       		this.hp=(int)(Math.random()*10);
      		
     	}

   }

   public String getName(){

   	return this.name;
   }

   public void eat(){

   	this.hp=this.hp+10;

   	if (this.hp > this.maxHp) {

   		this.hp=this.maxHp;
   		
   	}

   }
  
   public String toString(){
   	String answer;

   	answer = ""+this.name+ " HP ="+this.hp;

   	return answer;
   }

}