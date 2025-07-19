package net.codecrete.windowsapi.winmd;

import net.codecrete.windowsapi.metadata.Architecture;
import net.codecrete.windowsapi.metadata.LazyString;

/**
 * Custom attribute data for methods.
 */
class MethodCustomAttributeData {
    /**
     * Supported processor architectures.
     */
    int supportedArchitecture = Architecture.ALL;
    /**
     * URL to Microsoft's documentation.
     */
    LazyString documentationUrl = null;
    /**
     * Value of a constant.
     */
    Object constantValue = null;
}
