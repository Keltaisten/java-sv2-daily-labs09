package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testCreate(){
        StringLists stringLists = new StringLists();
        List<String> words = Arrays.asList("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(Arrays.asList("aa","bb", "dd"),stringLists.shortestWords(words));
    }

}