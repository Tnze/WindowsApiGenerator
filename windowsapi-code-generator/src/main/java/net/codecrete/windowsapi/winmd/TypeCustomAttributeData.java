package net.codecrete.windowsapi.winmd;

import net.codecrete.windowsapi.metadata.Architecture;
import net.codecrete.windowsapi.metadata.LazyString;

import java.util.UUID;

/**
 * Custom attribute data for types.
 */
class TypeCustomAttributeData {
    /**
     * Supported processor architectures.
     */
    int supportedArchitecture = Architecture.ALL;
    /**
     * URL to Microsoft's documentation.
     */
    LazyString documentationUrl = null;
    /**
     * Indicates that the type is a TypeDef (alias).
     */
    boolean isTypedef = false;
    /**
     * Indicates that an enumeration uses values that can be combined as a bitmask to encode multiple flags.
     */
    boolean isEnumFlags = false;
    /**
     * Name of field used to set the struct size.
     */
    String structSizeField = null;
    /**
     * GUID associated with this type.
     */
    UUID guidConstant = null;
}
