package core;

import java.util.function.Function;

public class LambdaClass{


//	@Override
//	public Long apply(Long aLong) {
//
//		return aLong + 3;
//
//	}

	public static void main(String[] args) {
		
		
//		Function<Long, Long> cl = new LambdaClass();
		Function<Long, Long> cl = (aLong) ->  aLong+3;	
	
		System.out.println(cl.apply(9L));

	}

}
