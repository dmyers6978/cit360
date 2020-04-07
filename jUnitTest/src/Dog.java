public class Dog {
    private String mDogName;
    private String mDogBreed;
    private int mDogAge;
    private int mDogWeight;
    private boolean mDogIsHappy;
    private int mDogHasBone;
    public Dog(String name, String breed){
        this.mDogName = name;
        this.mDogBreed = breed;
        this.mDogWeight = 5;
        this.mDogAge = 2;
    }
    public String getName(){
        return mDogName;
    }
    public String getBreed(){
        return mDogBreed;
    }
    public void setName(String name){
        mDogName = name;
    }
    public int getWeight(){
        return mDogWeight;
    }
    public int getAge(){
        return mDogAge;
    }
    public void setWeight(int weight){
        mDogWeight = weight;
    }
    public void eat(){
        System.out.println("Yuum that was delicious");
        mDogWeight += 5;
    }
    public void play(){
        mDogIsHappy = true;
    }
    public Boolean isHappy(){
        return mDogIsHappy;
    }
    public void giveDogBone(){
        mDogHasBone = mDogHasBone + 1;
        mDogIsHappy = true;
    }
    public int getBones(){
        return mDogHasBone;
    }
}