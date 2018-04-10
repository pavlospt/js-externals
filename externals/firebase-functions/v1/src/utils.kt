@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package js.externals.firebase.functions.utils

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external fun normalizePath(path: String): String = definedExternally
external fun pathParts(path: String): Array<String> = definedExternally
external fun joinPath(base: String, child: String): String = definedExternally
external fun applyChange(src: Any, dest: Any): Any = definedExternally
external fun pruneNulls(obj: Any): Any = definedExternally
external fun valAt(source: Any, path: String? = definedExternally /* null */): Any = definedExternally
