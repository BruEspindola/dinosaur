public class Dinosaur {
    
    public int energy;
    public int velocity;
    public int temperature;
    public int mood;

    public void toJump(){
        if (energy == 0){
            System.out.println("Não consigo fazer isso agora, estou sem energia 😥");
        } else{
        energy--;
        mood++;
            System.out.println("Uhuuul, pulei 😁");
        }
    }

    public void run(){
        if (energy == 0){
            System.out.println("Não consigo fazer isso agora, estou sem energia 😥");
        }else{
        energy--;
        mood++;
            System.out.println("correr me deixa feliz 😅");;
        }
    }

    public void eat(){
        energy++;
        mood++;
        System.out.println("hummmm, comer é bom 😋");
    }

    public void play(){
        if (energy == 0){
            System.out.println("Não consigo fazer isso agora, estou sem energia 😥");
        }else{
        energy--;
        mood++;
        System.out.println("Adoro brincar 🥰");
        }
    }
    public void sunbathe(){
        if (energy == 0){
            System.out.println("Não consigo fazer isso agora, estou sem energia 😥");
        }else{
        velocity++;
        mood++;
        energy--;
        System.out.println("O sol é fundamental para minha saúde 🤗");
        }
    }
    public void stayInTheShade(){
        energy++;
        mood--;
        System.out.println("O sol as vezes fica quente e é bom se refrescar na sombra 🥵");
    }
}