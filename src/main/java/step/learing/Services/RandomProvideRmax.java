package step.learing.Services;
import javax.inject.Singleton;
import java.util.Random;

    @Singleton
    public class RandomProvideRmax implements RandomProvider {
        private final int n = new Random().nextInt();

        public int getN()
        {
            return n;
        }
    }
