import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.mock.MockService;
import org.apache.camel.Exchange;
import org.apache.camel.test.junit4.CamelSpringTestSupport;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * User: chris
 * Date: 17/03/12
 * Time: 18:48
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/camel-context.xml")
public class TestCamel extends CamelSpringTestSupport {

    @Autowired
    private ApplicationContext applicationContext;

    /** Soap UI PROJECT. */
    private WsdlProject project;

    /**
     * @throws java.lang.Exception
     */

    public void setUp() throws Exception {
        super.setUp();
        URL resource = getClass().getClassLoader().getResource("order-project.xml");
        project = new WsdlProject(resource.getPath());
        for (MockService mockService : project.getMockServiceList()) {
            mockService.start();
        }
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return (AbstractApplicationContext) applicationContext;
    }

    @Test
    public void testSuccessful() throws InterruptedException {
        List<Object> params = new ArrayList<Object>();
        params.add("motor");
        params.add(1);
        params.add("honda");
        String reply = template
                .requestBody("direct:startOrder", params, String.class);
        assertEquals("OK", reply);

    }

    @Test
    public void testUnsuccessful() throws InterruptedException {
        List<Object> params = new ArrayList<Object>();
        params.add("motor");
        params.add(10);
        params.add("honda");
        String reply = template
                .requestBody("direct:startOrder", params, String.class);
        assertEquals("KO", reply);
    }

    @Test
    public void testFault() throws InterruptedException {
        List<Object> params = new ArrayList<Object>();
        params.add("teapot");
        params.add(-1);
        params.add("honda");
        String reply = template
                .requestBody("direct:startOrder", params, String.class);
        assertEquals("KO", reply);
    }
}
