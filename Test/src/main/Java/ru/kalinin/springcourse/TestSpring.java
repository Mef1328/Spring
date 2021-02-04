package ru.kalinin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created bu Mef
 * date<br>
 */

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();

        context.close();

    }
}
