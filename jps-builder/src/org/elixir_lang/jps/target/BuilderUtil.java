package org.elixir_lang.jps.target;

import org.elixir_lang.jps.Builder;
import org.elixir_lang.jps.model.JpsElixirSdkType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.incremental.CompileContext;
import org.jetbrains.jps.incremental.ProjectBuildException;
import org.jetbrains.jps.incremental.messages.BuildMessage;
import org.jetbrains.jps.incremental.messages.CompilerMessage;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.library.sdk.JpsSdk;
import org.jetbrains.jps.model.module.JpsModule;

/**
 * Created by zyuyou on 15/7/12.
 */
public class BuilderUtil {
  public BuilderUtil() {
  }

  @NotNull
  public static JpsSdk<JpsDummyElement> getSdk(@NotNull CompileContext context,
                                               @NotNull JpsModule module) throws ProjectBuildException {

    JpsSdk<JpsDummyElement> sdk = module.getSdk(JpsElixirSdkType.INSTANCE);
    if(sdk == null){
      String errorMessage = "No SDK for module " + module.getName();
      context.processMessage(new CompilerMessage(Builder.BUILDER_NAME, BuildMessage.Kind.ERROR, errorMessage));
      throw new ProjectBuildException(errorMessage);
    }

    return sdk;
  }
}