package lab11Threading.exercises;

public class Exercise2DP {
    public static void main(String[] args) throws Exception {

        PhilosopherExample[] philosophers = new PhilosopherExample[5];
        Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new PhilosopherExample(leftFork, rightFork);

            Thread t
                    = new Thread(philosophers[i], "PhilosopherExample " + (i + 1));
            t.start();
        }
    }
}
