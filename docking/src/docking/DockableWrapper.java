/*
Copyright (c) 2022 Andrew Auclair

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package docking;

import floating.FloatListener;

public class DockableWrapper {
	private DockingPanel parent;
	private final Dockable dockable;

	private FloatListener floatListener;

	public DockableWrapper(Dockable dockable) {
		this.dockable = dockable;
		floatListener = new FloatListener(this);
	}

	public void setParent(DockingPanel parent) {
		this.parent = parent;
	}

	public Dockable getDockable() {
		return dockable;
	}

	public void docked() {
//		floatListener = new FloatListener(dockable);
	}

	public void undocked() {
//		if (floatListener != null) {
//			floatListener.removeListeners();
//			floatListener = null;
//		}
	}

	public void removedListeners() {
		floatListener = null;
	}

	public DockingPanel getParent() {
		return parent;
	}
}
