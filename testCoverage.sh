#!/usr/bin/env bash
set -e

sbt ++$TRAVIS_SCALA_VERSION -DscalaFmtEnabled=false -DhammerEnabled=false clean coverage test
sbt ++$TRAVIS_SCALA_VERSION -DscalaFmtEnabled=false -DhammerEnabled=false coverageReport
sbt ++$TRAVIS_SCALA_VERSION -DscalaFmtEnabled=false -DhammerEnabled=false coverageAggregate
sbt ++$TRAVIS_SCALA_VERSION -DscalaFmtEnabled=false -DhammerEnabled=false codacyCoverage

echo "testing successful $CODACY_PROJECT_TOKEN"
echo "Finished! hmmm :)"
echo $CODACY_PROJECT_TOKEN
