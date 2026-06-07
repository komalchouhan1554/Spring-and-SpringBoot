package com.vj.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.vj.beans") // Scanning the packages
// @ComponentScan({"com.vj.beans", "com.vj.beans2", " etc...." }) // Scanning multiple packages 
// @ComponentScan(basePackages = {"com.vj.beans", "com.vj.beans2", " etc...." }) // another way to scan packages
public class JavaConfigFile 
{
	
}
