package net.codecrete.windowsapi.winmd;

import net.codecrete.windowsapi.metadata.Architecture;
import net.codecrete.windowsapi.metadata.LazyString;

import java.util.UUID;

/**
 * Custom attribute data for fields.
 */
public class FieldCustomAttributeData {
    /**
     * Supported processor architectures.
     */
    int supportedArchitecture = Architecture.ALL;
    /**
     * URL to Microsoft's documentation.
     */
    LazyString documentationUrl = null;
    /**
     * GUID associated with this type.
     */
    UUID guidConstant = null;
    /**
     * Indicates that a string value is encoded as ANSI (Windows-1252).
     */
    boolean isAnsiEncoding = false;
    /**
     * Indicates that an array has a flexible size.
     */
    boolean isFlexibleArray = false;
    /**
     * Value of a constant.
     */
    Object constantValue = null;
}
