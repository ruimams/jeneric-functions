package ist.meic.pa.GenericFunctions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class GFMMap<E extends GFMethod> implements GFMContainer<E> {
  private Map<List<Class<?>>, E> methods;

  public GFMMap() {
    this.methods = new HashMap<List<Class<?>>, E>();
  }

  @Override
  public void add(E gfm) {
    List<Class<?>> params = Arrays.asList(gfm.getParameterTypes());
    this.methods.put(params, gfm);
  }

  @Override
  public Stream<E> stream() {
    return this.methods.values().stream();
  }
}