public class Reusable {
   /* public String sample(String name){
        return ("You have entered your name as" +" "+name);

    }*/
   public void sample(String name)
   {
       System.out.println("You have entered your name as" +" "+name);
   }
    public static void main(String args[]){
        Reusable res= new Reusable();
        /*System.out.println(res.sample("Ram"));
       System.out.println(res.sample("Sham"));
       System.out.println(res.sample("Steve"));
       System.out.println(res.sample("Tim"));*/
        res.sample("Ram");
        res.sample("Sham");
        res.sample("Steve");
        res.sample("Tim");
    }
}
