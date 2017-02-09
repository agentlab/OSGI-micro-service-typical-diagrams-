/**
 *
 */
package ru.agentlab.genmymodel.ds.host;

import java.io.IOException;
import java.util.Dictionary;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

import ru.agentlab.genmymodel.IGenMyModelService;
import ru.agentlab.genmymodel.model.Diagram;
import ru.agentlab.genmymodel.model.SideBar;

/**
 *
 * Oomph component realisation.
 *
 * @author Sidorenko
 *
 */
@Component(enabled = true, immediate = true,
    property = { "service.exported.interfaces=*", "service.exported.configs=ecf.jaxrs.jersey.server",
        "ecf.jaxrs.jersey.server.urlContext=http://localhost:8080", "ecf.jaxrs.jersey.server.alias=/genmymodel",
        "service.pid=ru.agentlab.genmymodel.ds.host.GenMyModelComponent" })
public class GenMyModelComponent
    implements IGenMyModelService, ManagedService {

    @Override
    public String hello() {
        return "Hello from GenMyModel";
    }

    @Override
    public SideBar getSideBar(Diagram diagram) {
        switch (diagram.getType()) {
        case Diagram.CLASS_DIAGRAM_TYPE:
            return new SideBar(SideBar.CLASS_SIDE_BAR_TYPE);

        case Diagram.ACTION_DIAGRAM_TYPE:
            return new SideBar(SideBar.ACTION_SIDE_BAR_TYPE);

        case Diagram.TEST_DIAGRAM_TYPE:
            return new SideBar(SideBar.TEST_SIDE_BAR_TYPE);

        default:
            return new SideBar(SideBar.UNDEFINED_SIDE_BAR_TYPE);
        }
    }

    @Activate
    public void activate(ComponentContext context) throws IOException {
        System.out.println("GenMyModel service started"); //$NON-NLS-1$
    }

    @Deactivate
    public void deactivate(ComponentContext context) {
        System.out.println("GenMyModel service stopped"); //$NON-NLS-1$
    }

    @Modified
    public void modify() {
        System.out.println("GenMyModel service modified"); //$NON-NLS-1$
    }

    @Override
    public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
        // Does nothing
    }

}
