package cz.sweb.pichlik.springioc.spi;

import org.springframework.stereotype.Service;

@Service
@TargetEnvironment(Environment.CLIENT)
public class ClientSPIImplentation implements ServiceProviderInterface{

}
