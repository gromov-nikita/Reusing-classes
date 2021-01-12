public class Frog extends Amphibian {
    @Override
    public void swim(int n){
        System.out.println(n);
    }
    @Override
    public void move(int n){
        System.out.println("Jump " + n);
    }
    @Override
    public void voice(){
        System.out.println("Kva-kva");
    }
}
