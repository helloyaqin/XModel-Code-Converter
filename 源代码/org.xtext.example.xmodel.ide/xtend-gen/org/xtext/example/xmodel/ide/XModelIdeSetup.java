/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.example.xmodel.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.xmodel.XModelRuntimeModule;
import org.xtext.example.xmodel.XModelStandaloneSetup;
import org.xtext.example.xmodel.ide.XModelIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XModelIdeSetup extends XModelStandaloneSetup {
  @Override
  public Injector createInjector() {
    XModelRuntimeModule _xModelRuntimeModule = new XModelRuntimeModule();
    XModelIdeModule _xModelIdeModule = new XModelIdeModule();
    return Guice.createInjector(Modules2.mixin(_xModelRuntimeModule, _xModelIdeModule));
  }
}
