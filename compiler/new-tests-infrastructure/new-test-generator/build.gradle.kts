plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    testImplementation(projectTests(":generators:test-generator"))
    testImplementation(platform("org.junit:junit-bom:5.7.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

sourceSets {
    "main" { none() }
    "test" { projectDefault() }
}

testsJar()
