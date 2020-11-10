// !LANGUAGE: +MultiPlatformProjects
// MODULE: m1-common
// FILE: common.kt
// TODO: .fir.kt version is just a stub.
expect interface My {
    open fun openFun()
    abstract fun abstractFun()

    open val openVal: Int
    abstract val abstractVal: Int
}

// MODULE: m1-jvm(m1-common)
// FILE: jvm.kt
actual interface My {
    actual fun <!ACTUAL_WITHOUT_EXPECT!>openFun<!>()
    actual fun abstractFun()

    actual val <!ACTUAL_WITHOUT_EXPECT!>openVal<!>: Int
    actual val abstractVal: Int
}
