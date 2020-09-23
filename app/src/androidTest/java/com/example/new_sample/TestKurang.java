package com.example.new_sample;

        import androidx.test.filters.LargeTest;
        import androidx.test.rule.ActivityTestRule;
        import androidx.test.runner.AndroidJUnit4;

        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.runner.RunWith;

        import static androidx.test.espresso.Espresso.onView;
        import static androidx.test.espresso.action.ViewActions.click;
        import static androidx.test.espresso.assertion.ViewAssertions.matches;
        import static androidx.test.espresso.matcher.ViewMatchers.withId;
        import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TestKurang {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tes(){
        //cari id button1 terus di klik
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }

}
