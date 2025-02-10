package net.realrain;

import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedWithEnumSourceTest {

    private WordCounter wordCounter = new WordCounter();

    @ParameterizedTest
    @EnumSource(Sentences.class)
    void testWordsInSentence(Sentences sentence) {
        assertEquals(3, wordCounter.countWords(sentence.value()));
    }

    @ParameterizedTest
    @EnumSource(
            value = Sentences.class,
            mode = EnumSource.Mode.INCLUDE,
            names = {"JUNIT_IN_ACTION", "THREE_PARAMETERS"}
    )
    void testSelectedWordsInSentence(Sentences sentence) {
        assertEquals(3, wordCounter.countWords(sentence.value()));
    }

    @ParameterizedTest
    @EnumSource(
            value = Sentences.class,
            mode = EnumSource.Mode.EXCLUDE,
            names = {"THREE_PARAMETERS"}
    )
    void testExcludedWordsInSentence(Sentences sentence) {
        assertEquals(3, wordCounter.countWords(sentence.value()));
    }
}
