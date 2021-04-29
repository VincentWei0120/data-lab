public class Cereal {
    
    private String name;
    private int sugar;
    private int vitamins;
    private double weight;
    
    //Constructor
    public Cereal (String name, int sugar, int vitamins, double weight)
    {
        this.name = name;
        this.sugar = sugar;
        this.vitamins = vitamins;
        this.weight = weight;
    }
    
    //Access Methods
    public int getVitamins()
    {
        return vitamins;
    }
    
    public void setVitamins(int vitamins)
    {
        this.vitamins = vitamins;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public void setWeight(double weigth)
    {
        this.weight = weight;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getSugar()
    {
        return sugar;
    }
    
    public void setSugar(int sugar)
    {
        this.sugar = sugar;
    }
    
    public Cereal compareCereal(Cereal other)
    {
        if((this.getSugar() < 6) && (other.getSugar() < 6))
        {
            if(this.getVitamins() > other.getVitamins())
            {
                return this;
            } else {
                return other;
            }
        } else if(this.getSugar()>6 && other.getSugar()<6)
        {
            return other;
        } else if(this.getSugar()<6 && other.getSugar()>6)
        {
            return this;
        }else {
            return null;
        }
    }
    
    
    //toString()
    public String toString()
    {
        //units of measure is unsure
        return name + " has " + sugar + " grams of sugar with " + vitamins + " grams of vitamins. It weighs " +weight + " ounces.";
    }
    
}