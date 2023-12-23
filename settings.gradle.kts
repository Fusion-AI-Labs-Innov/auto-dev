rootProject.name = "AutoDev-Intellij"

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("experiment")
include("plugin")

include(
    "pycharm",
    "java",
    "kotlin",
    "webstorm",
    "goland",
    "rust",
    "csharp",
    "cpp",
)
