/*******************************************************************************
 * Copyright (c) Emil Crumhorn - Hexapixel.com - emil.crumhorn@gmail.com
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    emil.crumhorn@gmail.com - initial API and implementation
 *******************************************************************************/

package org.eclipse.nebula.widgets.ganttchart.dnd;

import org.eclipse.nebula.widgets.ganttchart.GanttComposite;
import org.eclipse.swt.dnd.DropTargetEffect;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;

public class GanttDropTargetEffect extends DropTargetEffect {

	private GanttComposite	_parent;

	public GanttDropTargetEffect(GanttComposite parent) {
		super(parent);
		_parent = parent;
	}

	public Control getControl() {
		return _parent;
	}

	public Widget getItem(int x, int y) {
		return super.getItem(x, y);
	}


}
