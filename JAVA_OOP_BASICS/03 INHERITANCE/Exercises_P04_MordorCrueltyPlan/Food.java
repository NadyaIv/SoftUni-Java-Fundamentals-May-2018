package Exercises_P04_MordorCrueltyPlan;

public class Food {
    private static final int gram=2;
    private static final int lembas=3;
    private static final int apple=1;
    private static final int melon=1;
    private static final int honeycake=5;
    private static final int mushrooms=-10;
    private static final int other=-1;

    public static int addFood(String food){
        if(food.equalsIgnoreCase("Cram")){
            return gram;
        }else if(food.equalsIgnoreCase("Lembas")){
            return lembas;
        }else if(food.equalsIgnoreCase("Apple")){
            return apple;
        }else if(food.equalsIgnoreCase("Melon")){
            return melon;
        }else if(food.equalsIgnoreCase("HoneyCake")){
            return honeycake;
        }else if(food.equalsIgnoreCase("Mushrooms")){
            return mushrooms;
        }else{
            return other;
        }
    }
}
