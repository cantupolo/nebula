package org.eclipse.nebula.effects.stw;

import org.eclipse.swt.graphics.Image;

/**
 * {@link Transitionable} interface to obtain the control's image transition directly,
 * without obtaining it from the control itself.
 * @author Rodrigo Cantu Polo (cantupolo@yahoo.com.br)
 */
public interface ImageTransitionable extends Transitionable {
    /**
     * returns the {@link Image} object at index <i>index</i>
     * 
     * @param index the index of the {@link Image} object to return
     * @return the {@link Image} object at the specified index
     */
    public Image getControlImage(int index);

}
