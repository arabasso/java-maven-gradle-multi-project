package sk.host.arabasso.core;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by arabasso on 02/10/2016.
 * Example of Java multi project
 */
public class CoreTests {
    @Test
    public void test(){
        assertThat(true, is(equalTo(true)));
    }
}
