package com.ijoic.log

/**
 * Returns trimmed string content.
 *
 * @param length trim length.
 */
fun String.trimLimit(length: Int): String {
  return when(this.length <= length) {
    true -> this
    else -> substring(0, length)
  }
}