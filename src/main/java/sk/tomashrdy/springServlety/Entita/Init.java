package sk.tomashrdy.springServlety.Entita;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class Init implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Osoba osoba = new Osoba("Tomáš" , "Hrdý");
    }
}
