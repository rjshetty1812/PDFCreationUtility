package com.verizon.zero.PdfCreationUtility;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		tags = {
				@Tag(name="PDF creation", description="Creation of PDF files using different libraries")
		},
		info = @Info(
				title="PDF Creation API",
				version = "1.0.1")
)
public class PdfCreationUtilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfCreationUtilityApplication.class, args);
	}

}
