/*
 * Author: junw wo1261931780@gmail.com
 * Date: 2023-11-09 18:11:49
 * LastEditors: junw wo1261931780@gmail.com
 * LastEditTime: 2023-11-22 09:06:33
 * FilePath: \testSpringProject\src\main\java\wo1261931780\testSpringProject\welcome\WelcomeMessage.java
 * Description: 1111
 *
 * Copyright (c) 2023 by ${git_name_email}, All Rights Reserved.
 */
package wo1261931780.testSpringProject.welcome;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij IDEA.
 * Project:testSpringProject
 * Package:wo1261931780.testSpringProject
 *
 * @author liujiajun_junw
 * @Date 2023-03-14-32  星期六
 * @description
 */
@RestController
public class WelcomeMessage {
	@RequestMapping("/")
	public String banner() {
		String welcomeMessage = "welcome to my open source project!!!";
		String projectAddress = "\t --- https://github.com/wo1261931780/testSpringProject";
		return welcomeMessage + projectAddress;
	}
}
