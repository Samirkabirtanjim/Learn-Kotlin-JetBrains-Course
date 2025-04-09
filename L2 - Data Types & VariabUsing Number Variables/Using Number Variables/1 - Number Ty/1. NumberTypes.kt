fun main() {
    // ===== Integer Types =====

    // Byte: 8-bit signed integer, range -128 to 127
    val byteNum: Byte = 120
    println("Byte value: $byteNum")

    // Short: 16-bit signed integer, range -32,768 to 32,767
    val shortNum: Short = 30000
    println("Short value: $shortNum")

    // Int: 32-bit signed integer, default for whole numbers
    val intNum: Int = 2_147_483_647 // Max value of Int
    println("Int value: $intNum")

    // Long: 64-bit signed integer for very large values
    val longNum: Long = 9_000_000_000_000L // Note the 'L' suffix
    println("Long value: $longNum")

    // ===== Floating-Point (Decimal) Types =====

    // Float: 32-bit decimal, less precision
    val floatNum: Float = 6.0f / 13.0f
    println("Float value: $floatNum") // Precision: 6-7 digits

    // Double: 64-bit decimal, more precision (default for decimals)
    val doubleNum: Double = 6.0 / 13.0
    println("Double value: $doubleNum") // Precision: 15-16 digits
}
