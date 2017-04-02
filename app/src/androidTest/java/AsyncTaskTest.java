import android.content.Context;
import android.support.test.InstrumentationRegistry;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Nicky on 3/31/17.
 */

public class AsyncTaskTest {

    @Test
    public void test() {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {

            }
        };
        Context context = InstrumentationRegistry.getContext();
        asyncTask.execute(context);
        String joke = null;
        try {
            joke = asyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(joke);

    }
}
