package tests;

        import android.test.ActivityInstrumentationTestCase2;
        import android.widget.TextView;

        import com.example.k6lu.myapplication.MainActivity2;
        import com.example.k6lu.myapplication.R;

/**
 * Created by k6lu on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity2> {

    MainActivity2 mainActivity;
    public JUnit_test() {
        super(MainActivity2.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Goodbye World", tester);
    }
}