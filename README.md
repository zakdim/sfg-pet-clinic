# sfg-pet-clinic

SFG Pet Clinic

## S03-49 Using the Maven Release Plugin

* [Maven Release Plugin - Prepare a Release](https://maven.apache.org/maven-release/maven-release-plugin/examples/prepare-release.html)
* [Maven Release Plugin - Perform a Release](https://maven.apache.org/maven-release/maven-release-plugin/examples/perform-release.html)

1. Prepare release

NOTE: there should not be any local change, commit and push before proceeding.

```
mvn release:prepare
...
What is the release version for "sfg-pet-clinic"? (guru.springframework:sfg-pet-clinic) 0.0.1: : <Enter>
What is the release version for "pet-clinic-data"? (guru.springframework:pet-clinic-data) 0.0.1: : <Enter>
What is the release version for "pet-clinic-web"? (guru.springframework:pet-clinic-web) 0.0.1: : <Enter>
What is SCM release tag or label for "sfg-pet-clinic"? (guru.springframework:sfg-pet-clinic) sfg-pet-clinic-0.0.1: : <Enter>
What is the new deployment version for "sfg-pet-clinic"? (guru.springframework:sfg-pet-clinic) 0.0.2-SNAPSHOT: : <Enter>
What is the new deployment version for "pet-clinic-data"? (guru.springframework:pet-clinic-data) 0.0.2-SNAPSHOT: : <Enter>
What is the new deployment version for "pet-clinic-web"? (guru.springframework:pet-clinic-web) 0.0.2-SNAPSHOT: : <Enter>
...
# If there no errors, run:
mvn release:perform
```
