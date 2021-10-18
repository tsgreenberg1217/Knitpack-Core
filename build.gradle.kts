apply {
    from("$rootDir/${Android.androidLibrary}")
}
dependencies {
    "implementation"(platform(Google.firebaseBom))
    "implementation"(Google.firestore)
    "implementation"(Google.analytics)
}