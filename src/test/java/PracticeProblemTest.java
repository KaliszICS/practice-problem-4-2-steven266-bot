import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Method;

public class PracticeProblemTest {

   // ==================== repeatLetter Tests ====================

   @Test
   @DisplayName("repeatLetter: 'a' repeated 8 times returns 'aaaaaaaa'")
   void repeatLetterTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char.class, int.class };
         Method method = testClass.getDeclaredMethod("repeatLetter", cArg);
         assertEquals("aaaaaaaa", (String) method.invoke(null, 'a', 8));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("repeatLetter: 'e' repeated 0 times returns empty string")
   void repeatLetterTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char.class, int.class };
         Method method = testClass.getDeclaredMethod("repeatLetter", cArg);
         assertEquals("", (String) method.invoke(null, 'e', 0));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("repeatLetter: '!' repeated 1 time returns '!'")
   void repeatLetterTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char.class, int.class };
         Method method = testClass.getDeclaredMethod("repeatLetter", cArg);
         assertEquals("!", (String) method.invoke(null, '!', 1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("repeatLetter: 'z' repeated 5 times returns 'zzzzz'")
   void repeatLetterTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { char.class, int.class };
         Method method = testClass.getDeclaredMethod("repeatLetter", cArg);
         assertEquals("zzzzz", (String) method.invoke(null, 'z', 5));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ==================== countLetter Tests ====================

   @Test
   @DisplayName("countLetter: 'l' appears 2 times in 'hello'")
   void countLetterTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class, char.class };
         Method method = testClass.getDeclaredMethod("countLetter", cArg);
         assertEquals(2, (int) method.invoke(null, "hello", 'l'));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("countLetter: 'e' appears 0 times in 'I don't know'")
   void countLetterTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class, char.class };
         Method method = testClass.getDeclaredMethod("countLetter", cArg);
         assertEquals(0, (int) method.invoke(null, "I don't know", 'e'));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("countLetter: 'o' appears 2 times in 'I don't know'")
   void countLetterTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class, char.class };
         Method method = testClass.getDeclaredMethod("countLetter", cArg);
         assertEquals(2, (int) method.invoke(null, "I don't know", 'o'));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("countLetter: 'a' appears 0 times in empty string")
   void countLetterTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class, char.class };
         Method method = testClass.getDeclaredMethod("countLetter", cArg);
         assertEquals(0, (int) method.invoke(null, "", 'a'));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("countLetter: 'a' appears 3 times in 'banana'")
   void countLetterTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class, char.class };
         Method method = testClass.getDeclaredMethod("countLetter", cArg);
         assertEquals(3, (int) method.invoke(null, "banana", 'a'));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   // ==================== evenSum Tests ====================

   @Test
   @DisplayName("evenSum: evenSum(2, 6) returns 12")
   void evenSumTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(12, (int) method.invoke(null, 2, 6));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("evenSum: evenSum(0, 10) returns 30")
   void evenSumTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(30, (int) method.invoke(null, 0, 10));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("evenSum: evenSum(9, 2) returns 20 (order doesn't matter)")
   void evenSumTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(20, (int) method.invoke(null, 9, 2));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("evenSum: evenSum(1, 1) returns 0 (no evens in range)")
   void evenSumTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(0, (int) method.invoke(null, 1, 1));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("evenSum: evenSum(4, 4) returns 4 (single even number)")
   void evenSumTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(4, (int) method.invoke(null, 4, 4));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("evenSum: evenSum(3, 8) returns 18 (odd start, even end)")
   void evenSumTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(18, (int) method.invoke(null, 3, 8));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("evenSum: evenSum(3, 9) returns 18 (odd start, odd end)")
   void evenSumTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { int.class, int.class };
         Method method = testClass.getDeclaredMethod("evenSum", cArg);
         assertEquals(18, (int) method.invoke(null, 3, 9));
      } catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}