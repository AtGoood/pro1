package step.learing.Services;

import javax.inject.Singleton;

@Singleton
public interface TimeProvder {


    String getDate();
    String getTime();
}
