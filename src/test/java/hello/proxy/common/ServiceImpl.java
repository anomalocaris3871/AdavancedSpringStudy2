package hello.proxy.common;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceImpl implements ServiceInterface{
    @Override
    public void save() {
        log.info("save call");
    }

    @Override
    public void find() {
        log.info("find call");
    }
}
