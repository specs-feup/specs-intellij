package pt.up.fe.specs.intellij.psiweaver.lara;

import org.lara.interpreter.weaver.utils.LaraResourceProvider;

public enum WeaverLaraResource implements LaraResourceProvider {

    JOIN_POINTS("JoinPoints.lara");

    private final String resource;

    private static final String WEAVER_PACKAGE = "intellij/";
    private static final String BASE_PACKAGE = "weaver/";

    /**
     * @param resource
     */
    private WeaverLaraResource(String resource) {
        this.resource = WEAVER_PACKAGE + getSeparatorChar() + BASE_PACKAGE + resource;
    }

    /* (non-Javadoc)
     * @see org.suikasoft.SharedLibrary.Interfaces.ResourceProvider#getResource()
     */
    @Override
    public String getOriginalResource() {
        return resource;
    }
}
