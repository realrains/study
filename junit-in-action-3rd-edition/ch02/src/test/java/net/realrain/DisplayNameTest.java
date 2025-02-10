package net.realrain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class showing the @DisplayName annotation")
public class DisplayNameTest {

    @Test
    @DisplayName("This is first test")
    void nameForMethodTest() {
        System.out.println("Hello First Test");
    }

    @Test
    @DisplayName("Is it support emoji? 🤨")
    void emojiTest() {
        System.out.println("Hello Emoji Test");
    }
}
