package activities;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactFolder;

import static io.restassured.RestAssured.given;

@Rule public PactProviderRule mockProvider =
        new PactProviderRule("test_provider", "localhost", 8080, this);
@RunWith(PactRunner.class)
@Provider("provider1")
@PactFolder("pacts")
public class ContractTest {
    @TestTarget
    public final Target target = new HttpTarget("localhost", 8332);
}

