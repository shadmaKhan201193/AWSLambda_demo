package in.jvahome.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class WelcomeLambda implements RequestHandler<Object,Object>{

	@Override
	public Object handleRequest(Object input, Context context) {
		System.out.println("Welcome to lambda Function shadma demo test");
		return null;
	}
}
