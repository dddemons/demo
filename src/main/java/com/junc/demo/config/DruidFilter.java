package com.junc.demo.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
        initParams={
                @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
        }
)
/**
 * DruidFilter.class
 * @Description DruidFilter
 * @author junc
 * @date 2018年5月30日14:51:08
 */
public class DruidFilter extends WebStatFilter {

}
