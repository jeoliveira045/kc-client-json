package knicell;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.keycloak.admin.client.JacksonProvider;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.spi.ResteasyClientProvider;

import java.io.File;

import static java.rmi.server.RemoteServer.getLog;

@Mojo(name = "send-json")
public class ClientJson extends AbstractMojo {

    @Parameter(name = "file", property = "file")
    String filePath;

    File file = new File(filePath);


    public void execute() throws MojoExecutionException {
        getLog().info("Hello");
    }


}
