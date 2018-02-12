package com.ramiro.ernesto.qizit;

import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//**
// * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
// */
//public class ApplicationTest extends ApplicationTestCase<Application> {
//    public ApplicationTest() {
//        super(Application.class);
//    }


/**
 * @author ernesto
 */

public class ApplicationTest extends ActivityInstrumentationTestCase2<LoginActivity> {

    private Button mloginbutton;
    private EditText etext1;
    private EditText etext2;
    private LoginActivity actividad;

    public ApplicationTest() {
        super(LoginActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        etext1 = (EditText) actividad.findViewById(R.id.email);
        etext2 = (EditText) actividad.findViewById(R.id.password);
        mloginbutton = (Button) actividad.findViewById(R.id.loginbutton);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static final String USERNAME = "ernesto";
    private static final String PASSWORD = "123456";

    public void testAddValues() {
        TouchUtils.tapView(this, etext1);
        getInstrumentation().sendStringSync(USERNAME);
//        // now on value2 entry
        TouchUtils.tapView(this, etext2);
        getInstrumentation().sendStringSync(PASSWORD);
        // now on Add button
        TouchUtils.clickView(this, mloginbutton);

        // get result
//        String mathResult1 = etiqueta.getText().toString();
        // check the result
//        assertTrue("Add result should be 5", mathResult1.equals(ADD_RESULT));
    }


}
