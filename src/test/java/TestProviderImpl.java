import com.ai.kara.spi.service.ISpiHelloWorld;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @author coxon
 */
public class TestProviderImpl {

    @Test
    public void spi(){
        ServiceLoader<ISpiHelloWorld> loader = ServiceLoader.load(ISpiHelloWorld.class);

        for (ISpiHelloWorld spiHelloWorld : loader) {
            spiHelloWorld.sayHi();
        }
    }
}
