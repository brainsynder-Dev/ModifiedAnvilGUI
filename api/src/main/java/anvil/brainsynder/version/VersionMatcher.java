package anvil.brainsynder.version;

import anvil.brainsynder.internal.bslib.ServerVersion;

/**
 * Matches the server's NMS version to its {@link VersionWrapper}
 *
 * @author Wesley Smith
 * @author brainsynder
 * @since 1.2.1
 */
public class VersionMatcher {

    /**
     * Matches the server version to it's {@link VersionWrapper}
     *
     * @return The {@link VersionWrapper} for this server
     * @throws IllegalStateException If the version wrapper failed to be instantiated or is unable to be found
     */
    public VersionWrapper match() {
        ServerVersion version = ServerVersion.getVersion();
        try {
            return (VersionWrapper) Class.forName(getClass().getPackage().getName() + ".Wrapper_" + version.name()).newInstance();
        } catch (IllegalAccessException | InstantiationException exception) {
            throw new IllegalStateException("Failed to instantiate version wrapper for version " + version.name(), exception);
        } catch (ClassNotFoundException exception) {
            throw new IllegalStateException("AnvilGUI does not support server version \"" + version.name() + "\"", exception);
        }
    }

}
