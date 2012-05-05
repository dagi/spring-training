package cz.sweb.pichlik.springioc.spi;

import org.springframework.stereotype.Service;

@Service
@TargetEnvironment(Environment.SERVER)
public class ServerSPIImplentation implements ServiceProviderInterface{

}
