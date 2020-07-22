package mvc.service;

import lombok.extern.slf4j.Slf4j;
import mvc.model.Foo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@CacheConfig(cacheNames = {"accessToken"})
public class CachingService {

    private  Foo foo = new Foo();

    @Cacheable
    public String getId(String id) {
        log.info("Calling getId...[id:{}]", id);
        return foo.processFoo(id);
    }

}
