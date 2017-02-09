/**
 *
 */
package ru.agentlab.genmymodel;

import ru.agentlab.genmymodel.model.Diagram;
import ru.agentlab.genmymodel.model.SideBar;

/**
 *
 * GenMyModel service. Returns different type of side bars depending on diagram type.
 *
 * @author Sidorenko
 *
 */
public interface IGenMyModelService {

    /**
     *
     * Says hello to user.
     *
     * @return hello message. Can't return <code>null</code>.
     */
    String hello();

    /**
     *
     * Returns side bar. Type of side bar depends on given diagram type.
     *
     * @param diagram - diagram. Can't be <code>null</code>.
     *
     * @return side bar in html format. Can't return <code>null</code>.
     */
    SideBar getSideBar(Diagram diagram);
}
