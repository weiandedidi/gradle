package com.qidi.grad.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.qidi.grad.util.SpringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 10:55
 */
public class SpringContextLoaderListener extends ContextLoaderListener {
    private static final Logger logger = LoggerFactory.getLogger(SpringContextLoaderListener.class);
    @Override
    public void contextInitialized(ServletContextEvent event) {
        try {
            super.contextInitialized(event);
            ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(event.getServletContext());
            SpringUtils.setApplicationContext(ctx);

        } catch (Exception ex) {
            logger.error("设置spring context环境异常！", ex);
        }
    }
}
