package junittests;

import static org.junit.Assert.fail;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Before;
import org.junit.Test;

import services.interfaces.DomainServicesRemote;

public class TestServices {
	private Context context;
	private DomainServicesRemote domainServicesRemote;

	/**
	 * Inits the.
	 * 
	 * @throws NamingException
	 *             the naming exception
	 */
	@Before
	public void init() throws NamingException {
		context = new InitialContext();
		context = (Context) new InitialContext()
				.lookup("ejb:/tn.espritCs.prototypeEjb/DomainServices!services.interfaces.DomainServicesRemote");

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
