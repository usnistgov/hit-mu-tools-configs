package gov.nist.hit.lri.config;

import gov.nist.hit.core.service.ResourcebundleLoader;
import gov.nist.hit.core.service.exception.ProfileParserException;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.codehaus.jackson.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LRIBootstrap {

	
	@Autowired
	ResourcebundleLoader resourcebundleLoader;
	
	@PostConstruct
	public void init() throws JsonProcessingException, ProfileParserException, IOException{
		resourcebundleLoader.load();
	}
		
}
