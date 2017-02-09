/**
 *
 */
package ru.agentlab.genmymodel.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * Instance of this class represents diagram.
 *
 * @author Sidorenko
 *
 */
public class Diagram {

    /**
     * Class diagram type.
     */
    public static final String CLASS_DIAGRAM_TYPE = "Class-diagram";
    /**
     * Action diagram type.
     */
    public static final String ACTION_DIAGRAM_TYPE = "Action-diagram";
    /**
     * Test diagram type.
     */
    public static final String TEST_DIAGRAM_TYPE = "Test-diagram";
    private static final String DEFAULT_NAME = "Diagram";

    private String name;
    private String type;
    private Collection<Object> diagramObjects;

    /**
     * Default constructor
     */
    public Diagram() {
        name = DEFAULT_NAME;
        type = CLASS_DIAGRAM_TYPE;
        diagramObjects = new ArrayList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the diagramObjects
     */
    public Collection<Object> getDiagramObjects() {
        return diagramObjects;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param diagramObjects the diagramObjects to set
     */
    public void setDiagramObjects(Collection<Object> diagramObjects) {
        this.diagramObjects = diagramObjects;
    }

}
