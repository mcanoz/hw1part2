/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hw1part2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void isItwork(){
        ArrayList<String> analiste = new ArrayList<String>(5);
        analiste.add("a");
        analiste.add("b");
        analiste.add("c");
        analiste.add("d");
        ArrayList<String> listem = new ArrayList<String>(5);
        listem.add("a");
        listem.add("b");
        ArrayList<String> cikti=App.includedStrings(analiste, listem);
        
       assertEquals(2, App.includedStrings(analiste, listem).size());
      // System.out.println(App.includedStrings(analiste, listem).toString());
       assertTrue(App.includedStrings(analiste, listem).containsAll(listem));
        listem.add("f");
        assertFalse(App.includedStrings(analiste, listem).containsAll(listem));
        
    }
}
