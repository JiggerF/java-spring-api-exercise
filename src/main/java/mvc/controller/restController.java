package mvc.controller;

import lombok.RequiredArgsConstructor;
import mvc.model.FooRequestDto;
import mvc.model.FooResponseDto;
import mvc.model.JsonRequest;
import mvc.model.JsonResponse;
import mvc.service.CachingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class restController {

	private final CachingService cachingService;
	private Logger logger = LoggerFactory.getLogger(restController.class);

	@PostMapping(value = "/v1/members", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse restController(@Valid @RequestBody JsonRequest jsonRequest) {
		logger.info("Received a POST API request for name: {}", jsonRequest.getName());
		return JsonResponse.builder()
				.name(jsonRequest.getName())
				.lastName(jsonRequest.getLastName())
				.id(jsonRequest.getId())
				.address("Hudson Avenue")
				.course("Computer Science")
				.department("Engineering")
				.build();
	}

	@GetMapping(value = "/v1/members", produces = MediaType.APPLICATION_JSON_VALUE)
	public JsonResponse getMembers() {
        logger.info("Received a GET API request...");
		return JsonResponse.builder()
				.name("John")
				.lastName("Smith")
				.id("431")
				.address("Smithson Avenue")
				.course("Computer Science")
				.department("Engineering")
				.build();
	}

	// Test the use of Spring Cache
	@PostMapping(value = "/v1/cache", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FooResponseDto restCacheTest(@Valid @RequestBody FooRequestDto fooRequest) {

		String result = cachingService.getId(fooRequest.getId());
		return FooResponseDto.builder()
				.Id(result)
				.build();
	}
}
