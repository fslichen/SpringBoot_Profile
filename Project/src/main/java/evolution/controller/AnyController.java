package evolution.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import evolution.bean.AnyBean;

@RestController
public class AnyController {
	@Resource(name = "anyBean0")// Inject by method name anyBean0.
	private AnyBean anyBean0;
	
	@Resource(name = "anyBean1")// Inject by method name anyBean1.
	private AnyBean anyBean1;
	
	@GetMapping("/get")
	public Object get() {
		return anyBean0 + ", " + anyBean1;
	}
}
