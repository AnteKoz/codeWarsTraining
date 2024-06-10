
rootProject.name = "codeWarsTrainings"
include("src:training-findHighestAge")
include("src:training-romanNumeralsEncoder")
findProject(":src:training-romanNumeralsEncoder")?.name = "training-romanNumeralsEncoder"
