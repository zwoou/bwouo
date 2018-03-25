package bid.woou.bwouo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Author: zwoou
 * @Date: 2018/3/25
 */

public class ServletnIitialier extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BwouoApplication.class);
    }
}
