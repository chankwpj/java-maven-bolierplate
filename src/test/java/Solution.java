import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solution {

//    https://app.codility.com/demo/results/trainingUJJ9DS-PU8/

    public int solution(int N, int flavors, int[] from, int[] to, int[] ingredients) {
        final Map<Integer, Cake> good = new HashMap<>();
        final Map<Integer, Cake> bad = new HashMap<>();
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = from[i] - 1; j <= to[i] - 1; j++) {
                if (bad.containsKey(j)) {
                    continue;
                } else {
                    final Cake cake = good.getOrDefault(j, new Cake(flavors));
                    cake.apply(ingredients[i]);
                    if (cake.isNotGood) {
                        good.remove(j);
                        bad.put(j, cake);
                    } else {
                        good.put(j, cake);
                    }
                }
            }
        }
        return good.size();
    }

    private class Cake {
        private boolean isNotGood = false;
        private final LinkedList<Integer> cake = new LinkedList<>();
        private int flavors;

        public Cake(final int flavors) {
            this.flavors = flavors;
        }

        public void apply(final int ingredient) {
            if (isNotGood) {
                return;
            }

            if (cake.size() == flavors || (cake.size() == 0 && ingredient != 1)) {
                isNotGood = true;
                return;
            }

            if (cake.size() != 0) {
                isNotGood = cake.getLast() != ingredient - 1;
            }
            cake.addLast(ingredient);
        }
    }
}