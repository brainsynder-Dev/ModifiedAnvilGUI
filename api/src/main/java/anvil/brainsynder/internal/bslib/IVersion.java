package anvil.brainsynder.internal.bslib;

import anvil.brainsynder.internal.bslib.utils.Triple;

public interface IVersion {
    String name ();

    String getNMS ();

    Triple<Integer, Integer, Integer> getVersionParts();

    IVersion getParent ();
}
