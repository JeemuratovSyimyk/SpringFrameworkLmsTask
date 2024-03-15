package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {


        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pop pop = applicationContext.getBean("pop", Pop.class);
        System.out.println(pop);

        Classic classic = applicationContext.getBean("classic", Classic.class);
        System.out.println(classic);

        Singer singer = applicationContext.getBean("singer", Singer.class);
        singer.getMusic().getMusicGenre();
        System.out.println(singer);

        Singer singer1 = applicationContext.getBean("singer1", Singer.class);
        singer1.getMusics().forEach(System.out::println);

        applicationContext.close();



































    }
}
