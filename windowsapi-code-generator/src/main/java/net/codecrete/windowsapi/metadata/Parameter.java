//
// Windows API Generator for Java
// Copyright (c) 2025 Manuel Bleichenbacher
// Licensed under MIT License
// https://opensource.org/licenses/MIT
//
package net.codecrete.windowsapi.metadata;

/**
 * Parameter of a method.
 *
 * @param name the parameter name
 * @param type the parameter type
 * @param associatedEnumType enumeration type associated with this parameter
 */
public record Parameter(String name, Type type, EnumType associatedEnumType) {
}
