/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package randoop.ClassLoaderUtils;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        ClassLoader classLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str1 = org.apache.commons.lang3.ClassLoaderUtils.toString(classLoader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.net.URLClassLoader uRLClassLoader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            String str1 = org.apache.commons.lang3.ClassLoaderUtils.toString(uRLClassLoader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.net.URL[] uRLArray0 = org.apache.commons.lang3.ClassLoaderUtils.getThreadURLs();
        Class<?> wildcardClass1 = uRLArray0.getClass();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.apache.commons.lang3.ClassLoaderUtils classLoaderUtils0 = new org.apache.commons.lang3.ClassLoaderUtils();
        Class<?> wildcardClass1 = classLoaderUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        Object obj0 = new Object();
        Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.net.URL[] uRLArray0 = org.apache.commons.lang3.ClassLoaderUtils.getSystemURLs();
        Class<?> wildcardClass1 = uRLArray0.getClass();
        org.junit.Assert.assertNotNull(uRLArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

