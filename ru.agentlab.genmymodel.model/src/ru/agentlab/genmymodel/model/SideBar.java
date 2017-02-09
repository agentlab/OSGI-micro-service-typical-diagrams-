/**
 *
 */
package ru.agentlab.genmymodel.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * Instance of this class represents side bar.
 *
 * @author Sidorenko
 *
 */
public class SideBar {

    /**
     * Class sideBar type.
     */
    public static final String UNDEFINED_SIDE_BAR_TYPE = "Undefined-sideBar";
    /**
     * Class sideBar type.
     */
    public static final String CLASS_SIDE_BAR_TYPE = "Class-sideBar";
    /**
     * Action sideBar type.
     */
    public static final String ACTION_SIDE_BAR_TYPE = "Action-sideBar";
    /**
     * Test sideBar type.
     */
    public static final String TEST_SIDE_BAR_TYPE = "Test-sideBar";

    private String type;
    private Collection<Object> items;

    /**
     * Default constructor
     */
    public SideBar(String type) {
        this.type = type;
        items = new ArrayList<>();
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the items
     */
    public Collection<Object> getItems() {
        return items;
    }

}
