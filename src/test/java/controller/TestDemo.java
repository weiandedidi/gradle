package controller;

import com.qidi.grad.controller.demo.DemoController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/5
 * Time: 15:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration({"classpath*:spring/applicationContext-mvc.xml" })
public class TestDemo {
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Autowired
    DemoController demoController ;

    @Autowired
    ServletContext context;

    @Before
    public void setUp() {
        // mockMvc = MockMvcBuilders.webAppContextSetup( wac ).build();
        mockMvc = MockMvcBuilders.standaloneSetup( demoController).build() ;
    }

    @Test
    public void test() throws Exception {
        assertNotNull(mockMvc);
        mockMvc.perform( MockMvcRequestBuilders.get("/hello/index.do") )
                .andReturn()  ;
    }

}
