package wo1261931780.testSpringProject.welcome;


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
