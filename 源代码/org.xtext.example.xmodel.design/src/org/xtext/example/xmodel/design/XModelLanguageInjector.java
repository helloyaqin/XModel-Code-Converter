package org.xtext.example.xmodel.design;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;
import org.xtext.example.xmodel.ui.internal.XmodelActivator;

public class XModelLanguageInjector implements IXtextLanguageInjector {
	@Override
	public Injector getInjector() {
		return XmodelActivator.getInstance()
				.getInjector(XmodelActivator.ORG_XTEXT_EXAMPLE_XMODEL_XMODEL);
	}
}
