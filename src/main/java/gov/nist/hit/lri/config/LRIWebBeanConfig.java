package gov.nist.hit.lri.config;

import gov.nist.hit.core.hl7v2.service.HL7V2MessageParser;
import gov.nist.hit.core.hl7v2.service.HL7V2MessageParserImpl;
import gov.nist.hit.core.hl7v2.service.HL7V2MessageValidator;
import gov.nist.hit.core.hl7v2.service.HL7V2MessageValidatorImpl;
import gov.nist.hit.core.hl7v2.service.HL7V2ResourcebundleLoaderImpl;
import gov.nist.hit.core.hl7v2.service.HL7V2ValidationReportGenerator;
import gov.nist.hit.core.hl7v2.service.HL7V2ValidationReportGeneratorImpl;
import gov.nist.hit.core.service.ResourcebundleLoader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LRIWebBeanConfig {

	@Bean
	  public ResourcebundleLoader resourcebundleLoader() {
	      return new HL7V2ResourcebundleLoaderImpl();
	  }

	 @Bean
	  public HL7V2ValidationReportGenerator hl7v2ValidationReportGenerator() {
	      return new HL7V2ValidationReportGeneratorImpl();
	 }

	  @Bean
	  public HL7V2MessageValidator hl7v2MessageValidator() {
	     return new HL7V2MessageValidatorImpl();
	  }
	  
	  @Bean
	  public HL7V2MessageParser hl7v2MessageParser() {
	    return new HL7V2MessageParserImpl();
	  }
	
}
