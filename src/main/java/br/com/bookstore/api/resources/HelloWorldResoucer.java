
package br.com.bookstore.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author karol
 */
@Path("hello-world")
public class HelloWorldResoucer {
    
    @GET
    public String helloWorldMensagem() {
        return "hello World Web Services em Java";
    }
}
