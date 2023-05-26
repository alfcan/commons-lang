<!---
 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
-->

Apache Commons Lang
===================

[![GitHub Actions Status](https://github.com/apache/commons-lang/workflows/Java%20CI/badge.svg)](https://github.com/apache/commons-lang/actions)
[![Coverage Status](https://codecov.io/gh/apache/commons-lang/branch/master/graph/badge.svg)](https://app.codecov.io/gh/apache/commons-lang)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.commons/commons-lang3/badge.svg?gav=true)](https://maven-badges.herokuapp.com/maven-central/org.apache.commons/commons-lang3/?gav=true)
[![Javadocs](https://javadoc.io/badge/org.apache.commons/commons-lang3/3.12.0.svg)](https://javadoc.io/doc/org.apache.commons/commons-lang3/3.12.0)
[![CodeQL](https://github.com/apache/commons-lang/workflows/CodeQL/badge.svg)](https://github.com/apache/commons-lang/actions/workflows/codeql-analysis.yml?query=workflow%3ACodeQL)
[![OpenSSF Scorecard](https://api.securityscorecards.dev/projects/github.com/apache/commons-lang/badge)](https://api.securityscorecards.dev/projects/github.com/apache/commons-lang)

Apache Commons Lang, a package of Java utility classes for the
  classes that are in java.lang's hierarchy, or are considered to be so
  standard as to justify existence in java.lang.
  In this fork, our objective is to enhance project performance and address errors with the assistance of various tools.



Branch master 
-------------
In the branch master, we merged a pull request in which we fixed 23 bugs and 11 code smells identified by the SonarCloud tool.
We also merged a pull request in which we fixed 72 code smells identified by the ecoCode tool.


Branch fix-blocker-code-smells
-------------
In this branch we have a pull request in which we tried to resolve 29 code smells detected by the SonarCloud tool but the CI build failed due to changes on deprecated classes.

Branch docker-image
-------------
In this branch, we have added the necessary files to create a Docker image and the GitHub Action for Docker on the project.

Branch code-coverage-mutation-testing
-------------
In this branch, we have added Pitest configuration for mutation testing on the project.
Jacoco and Codecov were already integrated into the project. 

Branch performance-testing
-------------
In this branch, we have added configuration to execute a benchmark testing with JMH on class LockingVisitorsTest.

Branch automated-test-case-generation
-------------
In this branch, we have generated tests using the Evosuite and Randoop tools for classes with low coverage.

Branch security-vulnerabilities
-------------
In this branch, we added reports about the FindSecBugs and OWASP Dependency Check tools.
