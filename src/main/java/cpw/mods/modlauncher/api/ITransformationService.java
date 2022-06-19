package cpw.mods.modlauncher.api;

import java.util.List;
import java.util.Set;

public interface ITransformationService {

    String name();

    void initialize(IEnvironment var1);

    void onLoad(IEnvironment var1, Set<String> var2) throws IncompatibleEnvironmentException;

    List<ITransformer> transformers();

}