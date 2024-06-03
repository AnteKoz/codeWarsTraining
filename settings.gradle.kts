
rootProject.name = "codeWarsTrainings"
include("src:main:Training")
findProject(":src:main:Training")?.name = "Training"
