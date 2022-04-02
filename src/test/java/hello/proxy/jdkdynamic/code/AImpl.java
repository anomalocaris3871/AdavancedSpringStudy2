package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AImpl implements AInterface {
    @Override
    public String call(String args) {
        log.info("A call →　{}", args);
        return "a";
    }
}
