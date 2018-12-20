package mordor_cruelty_plan;

import java.util.ArrayList;
import java.util.List;

class Gandalf {
    private List<String> food;

    Gandalf() {
        this.food = new ArrayList<>();
    }

    void addFood(String food) {
        this.food.add(food);
    }

    private int calculatePoints() {
        int points = 0;
        for (String foo : food) {
            switch (foo.toLowerCase()) {
                case "cram":
                    points += 2;
                    break;
                case "lembas":
                    points += 3;
                    break;
                case "apple":
                    points += 1;
                    break;
                case "melon":
                    points += 1;
                    break;
                case "honeycake":
                    points += 5;
                    break;
                case "mushrooms":
                    points -= 10;
                    break;
                default:
                    points -= 1;
                    break;
            }
        }
        return points;
    }

    private String getMood() {
        int points = this.calculatePoints();
        String mood;
        if (points < -5) {
            mood = "Angry";
        } else if (points < 0) {
            mood = "Sad";
        } else if (points <= 15) {
            mood = "Happy";
        } else {
            mood = "JavaScript";
        }
        return mood;
    }

    @Override
    public String toString() {
        return String.valueOf(this.calculatePoints()) + System.lineSeparator() +
                this.getMood();
    }
}
