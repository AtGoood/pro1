package step.learing.Services;

import com.google.inject.AbstractModule;

public class ConfigModule extends AbstractModule {
@Override
    protected void configure()
{
bind(SybolService.class).to(CharService.class);
}
}
