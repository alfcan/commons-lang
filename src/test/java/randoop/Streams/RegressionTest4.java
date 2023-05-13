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

package randoop.Streams;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream9 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet8);
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsFailableStream9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass8 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector9 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass8);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector9.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector9.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer12 = strArrayCollector9.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer13 = strArrayCollector9.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier14 = strArrayCollector9.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction15 = strArrayCollector9.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction16 = strArrayCollector9.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator17 = strArrayCollector9.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier18 = strArrayCollector9.supplier();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector20 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector9, strCollectorBinaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNotNull(strListFunction10);
        org.junit.Assert.assertNotNull(strListFunction11);
        org.junit.Assert.assertNotNull(strListBiConsumer12);
        org.junit.Assert.assertNotNull(strListBiConsumer13);
        org.junit.Assert.assertNotNull(strListSupplier14);
        org.junit.Assert.assertNotNull(strListFunction15);
        org.junit.Assert.assertNotNull(strListFunction16);
        org.junit.Assert.assertNotNull(strListBinaryOperator17);
        org.junit.Assert.assertNotNull(strListSupplier18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer12 = strArrayCollector1.accumulator();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListFunction11);
        org.junit.Assert.assertNotNull(strListBiConsumer12);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier11 = strArrayCollector1.supplier();
        java.lang.Class<?> wildcardClass12 = strListSupplier11.getClass();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strListSupplier11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream11 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
        org.junit.Assert.assertNotNull(characteristicsFailableStream11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction2 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator11 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListFunction2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListBinaryOperator11);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer11 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier12 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet13 = strArrayCollector1.characteristics();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(strListBiConsumer11);
        org.junit.Assert.assertNotNull(strListSupplier12);
        org.junit.Assert.assertNotNull(characteristicsSet13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator2 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBinaryOperator2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListFunction5);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass6 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector7 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass6);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector7.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector7.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector7.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator11 = strArrayCollector7.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = strArrayCollector7.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier13 = strArrayCollector7.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction14 = strArrayCollector7.finisher();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector16 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector7, strCollectorBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(strListBinaryOperator11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
        org.junit.Assert.assertNotNull(strListSupplier13);
        org.junit.Assert.assertNotNull(strListFunction14);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator9 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListBinaryOperator9);
        org.junit.Assert.assertNotNull(strListFunction10);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier3 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream6 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet5);
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream7 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet5);
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream8 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet5);
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListSupplier3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(characteristicsFailableStream6);
        org.junit.Assert.assertNotNull(characteristicsFailableStream7);
        org.junit.Assert.assertNotNull(characteristicsFailableStream8);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer6 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(strListBiConsumer6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(strListSupplier8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier12 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet13 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet14 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction15 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListFunction10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
        org.junit.Assert.assertNotNull(strListSupplier12);
        org.junit.Assert.assertNotNull(characteristicsSet13);
        org.junit.Assert.assertNotNull(characteristicsSet14);
        org.junit.Assert.assertNotNull(strListFunction15);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector1.accumulator();
        java.lang.Class<?> wildcardClass11 = strArrayCollector1.getClass();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator4 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier5 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListBinaryOperator4);
        org.junit.Assert.assertNotNull(strListSupplier5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream8 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream9 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream10 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream11 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream12 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream13 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream14 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream15 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream16 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream17 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream18 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream19 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream20 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream21 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream22 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream23 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream24 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream25 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream26 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream27 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream28 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream29 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream30 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream31 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream32 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream33 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass34 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector35 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass34);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer36 = strArrayCollector35.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet37 = strArrayCollector35.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier38 = strArrayCollector35.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction39 = strArrayCollector35.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier40 = strArrayCollector35.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator41 = strArrayCollector35.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier42 = strArrayCollector35.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction43 = strArrayCollector35.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier44 = strArrayCollector35.supplier();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier45 = strArrayCollector35.supplier();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector47 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector35, strCollectorBinaryOperator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNull(strCollectorStream8);
        org.junit.Assert.assertNull(strCollectorStream9);
        org.junit.Assert.assertNull(strCollectorStream10);
        org.junit.Assert.assertNull(strCollectorStream11);
        org.junit.Assert.assertNull(strCollectorStream12);
        org.junit.Assert.assertNull(strCollectorStream13);
        org.junit.Assert.assertNull(strCollectorStream14);
        org.junit.Assert.assertNull(strCollectorStream15);
        org.junit.Assert.assertNull(strCollectorStream16);
        org.junit.Assert.assertNull(strCollectorStream17);
        org.junit.Assert.assertNull(strCollectorStream18);
        org.junit.Assert.assertNull(strCollectorStream19);
        org.junit.Assert.assertNull(strCollectorStream20);
        org.junit.Assert.assertNull(strCollectorStream21);
        org.junit.Assert.assertNull(strCollectorStream22);
        org.junit.Assert.assertNull(strCollectorStream23);
        org.junit.Assert.assertNull(strCollectorStream24);
        org.junit.Assert.assertNull(strCollectorStream25);
        org.junit.Assert.assertNull(strCollectorStream26);
        org.junit.Assert.assertNull(strCollectorStream27);
        org.junit.Assert.assertNull(strCollectorStream28);
        org.junit.Assert.assertNull(strCollectorStream29);
        org.junit.Assert.assertNull(strCollectorStream30);
        org.junit.Assert.assertNull(strCollectorStream31);
        org.junit.Assert.assertNull(strCollectorStream32);
        org.junit.Assert.assertNull(strCollectorStream33);
        org.junit.Assert.assertNotNull(strListBiConsumer36);
        org.junit.Assert.assertNotNull(characteristicsSet37);
        org.junit.Assert.assertNotNull(strListSupplier38);
        org.junit.Assert.assertNotNull(strListFunction39);
        org.junit.Assert.assertNotNull(strListSupplier40);
        org.junit.Assert.assertNotNull(strListBinaryOperator41);
        org.junit.Assert.assertNotNull(strListSupplier42);
        org.junit.Assert.assertNotNull(strListFunction43);
        org.junit.Assert.assertNotNull(strListSupplier44);
        org.junit.Assert.assertNotNull(strListSupplier45);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer12 = strArrayCollector1.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator13 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator14 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListSupplier8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strListFunction11);
        org.junit.Assert.assertNotNull(strListBiConsumer12);
        org.junit.Assert.assertNotNull(strListBinaryOperator13);
        org.junit.Assert.assertNotNull(strListBinaryOperator14);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer6 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(strListBiConsumer6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListFunction9);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListSupplier10);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction2 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer6 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.lang.Class<?> wildcardClass10 = characteristicsSet9.getClass();
        org.junit.Assert.assertNotNull(strListFunction2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListBiConsumer6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier13 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet14 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer15 = strArrayCollector1.accumulator();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
        org.junit.Assert.assertNotNull(strListSupplier13);
        org.junit.Assert.assertNotNull(characteristicsSet14);
        org.junit.Assert.assertNotNull(strListBiConsumer15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator11 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer12 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction13 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListBinaryOperator11);
        org.junit.Assert.assertNotNull(strListBiConsumer12);
        org.junit.Assert.assertNotNull(strListFunction13);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier2 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer3 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier5 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListSupplier2);
        org.junit.Assert.assertNotNull(strListBiConsumer3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(strListSupplier5);
        org.junit.Assert.assertNotNull(strListFunction6);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass8 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector9 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass8);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = strArrayCollector9.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector9.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction12 = strArrayCollector9.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction13 = strArrayCollector9.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer14 = strArrayCollector9.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator15 = strArrayCollector9.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet16 = strArrayCollector9.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer17 = strArrayCollector9.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction18 = strArrayCollector9.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction19 = strArrayCollector9.finisher();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector21 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector9, strCollectorBinaryOperator20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strListFunction11);
        org.junit.Assert.assertNotNull(strListFunction12);
        org.junit.Assert.assertNotNull(strListFunction13);
        org.junit.Assert.assertNotNull(strListBiConsumer14);
        org.junit.Assert.assertNotNull(strListBinaryOperator15);
        org.junit.Assert.assertNotNull(characteristicsSet16);
        org.junit.Assert.assertNotNull(strListBiConsumer17);
        org.junit.Assert.assertNotNull(strListFunction18);
        org.junit.Assert.assertNotNull(strListFunction19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator3 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListBinaryOperator3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.lang.Class<java.lang.String> strClass2 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector3 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass2);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = strArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector3.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector3.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector3.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector3.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector3.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer12 = strArrayCollector3.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator13 = strArrayCollector3.combiner();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector15 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector3, strCollectorBinaryOperator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
        org.junit.Assert.assertNotNull(strListBiConsumer12);
        org.junit.Assert.assertNotNull(strListBinaryOperator13);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer6 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListBiConsumer6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector1.characteristics();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator9 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(strListSupplier8);
        org.junit.Assert.assertNotNull(strListBinaryOperator9);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass8 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector9 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass8);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = strArrayCollector9.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer11 = strArrayCollector9.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = strArrayCollector9.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator13 = strArrayCollector9.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer14 = strArrayCollector9.accumulator();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector16 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector9, strCollectorBinaryOperator15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strListBiConsumer11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
        org.junit.Assert.assertNotNull(strListBinaryOperator13);
        org.junit.Assert.assertNotNull(strListBiConsumer14);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction2 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier6 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier11 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier13 = strArrayCollector1.supplier();
        org.junit.Assert.assertNotNull(strListFunction2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(strListSupplier6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListSupplier11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
        org.junit.Assert.assertNotNull(strListSupplier13);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream8 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream9 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream10 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream11 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream12 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass13 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector14 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass13);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer15 = strArrayCollector14.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet16 = strArrayCollector14.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction17 = strArrayCollector14.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator18 = strArrayCollector14.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction19 = strArrayCollector14.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier20 = strArrayCollector14.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet21 = strArrayCollector14.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction22 = strArrayCollector14.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet23 = strArrayCollector14.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator24 = strArrayCollector14.combiner();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector26 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector14, strCollectorBinaryOperator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNull(strCollectorStream8);
        org.junit.Assert.assertNull(strCollectorStream9);
        org.junit.Assert.assertNull(strCollectorStream10);
        org.junit.Assert.assertNull(strCollectorStream11);
        org.junit.Assert.assertNull(strCollectorStream12);
        org.junit.Assert.assertNotNull(strListBiConsumer15);
        org.junit.Assert.assertNotNull(characteristicsSet16);
        org.junit.Assert.assertNotNull(strListFunction17);
        org.junit.Assert.assertNotNull(strListBinaryOperator18);
        org.junit.Assert.assertNotNull(strListFunction19);
        org.junit.Assert.assertNotNull(strListSupplier20);
        org.junit.Assert.assertNotNull(characteristicsSet21);
        org.junit.Assert.assertNotNull(strListFunction22);
        org.junit.Assert.assertNotNull(characteristicsSet23);
        org.junit.Assert.assertNotNull(strListBinaryOperator24);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer6 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator9 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(strListBiConsumer6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListBinaryOperator9);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(strListFunction10);
        org.junit.Assert.assertNotNull(strListFunction11);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer3 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.lang.Class<?> wildcardClass6 = characteristicsSet5.getClass();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListBiConsumer3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass5 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector6 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass5);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector6.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector6.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector6.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = strArrayCollector6.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector6.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer12 = strArrayCollector6.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator13 = strArrayCollector6.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer14 = strArrayCollector6.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction15 = strArrayCollector6.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator16 = strArrayCollector6.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier17 = strArrayCollector6.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction18 = strArrayCollector6.finisher();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector20 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector6, strCollectorBinaryOperator19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strListFunction11);
        org.junit.Assert.assertNotNull(strListBiConsumer12);
        org.junit.Assert.assertNotNull(strListBinaryOperator13);
        org.junit.Assert.assertNotNull(strListBiConsumer14);
        org.junit.Assert.assertNotNull(strListFunction15);
        org.junit.Assert.assertNotNull(strListBinaryOperator16);
        org.junit.Assert.assertNotNull(strListSupplier17);
        org.junit.Assert.assertNotNull(strListFunction18);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream8 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream9 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream10 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream11 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream12 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream13 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream14 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream15 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream16 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream17 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream18 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream19 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream20 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream21 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream22 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream23 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream24 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream25 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream26 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream27 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream28 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream29 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream30 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream31 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream32 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream33 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass34 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector35 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass34);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer36 = strArrayCollector35.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet37 = strArrayCollector35.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction38 = strArrayCollector35.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator39 = strArrayCollector35.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction40 = strArrayCollector35.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier41 = strArrayCollector35.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet42 = strArrayCollector35.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier43 = strArrayCollector35.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction44 = strArrayCollector35.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator45 = strArrayCollector35.combiner();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector47 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector35, strCollectorBinaryOperator46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNull(strCollectorStream8);
        org.junit.Assert.assertNull(strCollectorStream9);
        org.junit.Assert.assertNull(strCollectorStream10);
        org.junit.Assert.assertNull(strCollectorStream11);
        org.junit.Assert.assertNull(strCollectorStream12);
        org.junit.Assert.assertNull(strCollectorStream13);
        org.junit.Assert.assertNull(strCollectorStream14);
        org.junit.Assert.assertNull(strCollectorStream15);
        org.junit.Assert.assertNull(strCollectorStream16);
        org.junit.Assert.assertNull(strCollectorStream17);
        org.junit.Assert.assertNull(strCollectorStream18);
        org.junit.Assert.assertNull(strCollectorStream19);
        org.junit.Assert.assertNull(strCollectorStream20);
        org.junit.Assert.assertNull(strCollectorStream21);
        org.junit.Assert.assertNull(strCollectorStream22);
        org.junit.Assert.assertNull(strCollectorStream23);
        org.junit.Assert.assertNull(strCollectorStream24);
        org.junit.Assert.assertNull(strCollectorStream25);
        org.junit.Assert.assertNull(strCollectorStream26);
        org.junit.Assert.assertNull(strCollectorStream27);
        org.junit.Assert.assertNull(strCollectorStream28);
        org.junit.Assert.assertNull(strCollectorStream29);
        org.junit.Assert.assertNull(strCollectorStream30);
        org.junit.Assert.assertNull(strCollectorStream31);
        org.junit.Assert.assertNull(strCollectorStream32);
        org.junit.Assert.assertNull(strCollectorStream33);
        org.junit.Assert.assertNotNull(strListBiConsumer36);
        org.junit.Assert.assertNotNull(characteristicsSet37);
        org.junit.Assert.assertNotNull(strListFunction38);
        org.junit.Assert.assertNotNull(strListBinaryOperator39);
        org.junit.Assert.assertNotNull(strListFunction40);
        org.junit.Assert.assertNotNull(strListSupplier41);
        org.junit.Assert.assertNotNull(characteristicsSet42);
        org.junit.Assert.assertNotNull(strListSupplier43);
        org.junit.Assert.assertNotNull(strListFunction44);
        org.junit.Assert.assertNotNull(strListBinaryOperator45);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer11 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = strArrayCollector1.characteristics();
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream13 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet12);
        java.lang.Class<?> wildcardClass14 = characteristicsSet12.getClass();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListBiConsumer11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
        org.junit.Assert.assertNotNull(characteristicsFailableStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator12 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
        org.junit.Assert.assertNotNull(strListBinaryOperator12);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer11 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction12 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
        org.junit.Assert.assertNotNull(strListBiConsumer11);
        org.junit.Assert.assertNotNull(strListFunction12);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction2 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        org.junit.Assert.assertNotNull(strListFunction2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator7 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListBinaryOperator7);
        org.junit.Assert.assertNotNull(strListSupplier8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListFunction10);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator9 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator11 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction12 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet13 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator14 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer15 = strArrayCollector1.accumulator();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListSupplier8);
        org.junit.Assert.assertNotNull(strListBinaryOperator9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListBinaryOperator11);
        org.junit.Assert.assertNotNull(strListFunction12);
        org.junit.Assert.assertNotNull(characteristicsSet13);
        org.junit.Assert.assertNotNull(strListBinaryOperator14);
        org.junit.Assert.assertNotNull(strListBiConsumer15);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier9 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer11 = strArrayCollector1.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator12 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction13 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator14 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(strListSupplier9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
        org.junit.Assert.assertNotNull(strListBiConsumer11);
        org.junit.Assert.assertNotNull(strListBinaryOperator12);
        org.junit.Assert.assertNotNull(strListFunction13);
        org.junit.Assert.assertNotNull(strListBinaryOperator14);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator9 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier11 = strArrayCollector1.supplier();
        java.lang.Class<?> wildcardClass12 = strArrayCollector1.getClass();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(strListBinaryOperator9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(strListSupplier11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer9 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet10 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier11 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction12 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListBiConsumer9);
        org.junit.Assert.assertNotNull(characteristicsSet10);
        org.junit.Assert.assertNotNull(strListSupplier11);
        org.junit.Assert.assertNotNull(strListFunction12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet6 = strArrayCollector1.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator11 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(characteristicsSet6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
        org.junit.Assert.assertNotNull(strListBinaryOperator11);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet2 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier6 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator7 = strArrayCollector1.combiner();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction11 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(characteristicsSet2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListSupplier6);
        org.junit.Assert.assertNotNull(strListBinaryOperator7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListFunction10);
        org.junit.Assert.assertNotNull(strListFunction11);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator8 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction9 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer10 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier12 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator13 = strArrayCollector1.combiner();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(strListBinaryOperator8);
        org.junit.Assert.assertNotNull(strListFunction9);
        org.junit.Assert.assertNotNull(strListBiConsumer10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
        org.junit.Assert.assertNotNull(strListSupplier12);
        org.junit.Assert.assertNotNull(strListBinaryOperator13);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction2 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction3 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer4 = strArrayCollector1.accumulator();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer5 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction7 = strArrayCollector1.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListFunction2);
        org.junit.Assert.assertNotNull(strListFunction3);
        org.junit.Assert.assertNotNull(strListBiConsumer4);
        org.junit.Assert.assertNotNull(strListBiConsumer5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListFunction7);
        org.junit.Assert.assertNotNull(strListFunction8);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream8 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream9 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream10 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass11 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector12 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass11);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer13 = strArrayCollector12.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet14 = strArrayCollector12.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction15 = strArrayCollector12.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction16 = strArrayCollector12.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator17 = strArrayCollector12.combiner();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector19 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector12, strCollectorBinaryOperator18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNull(strCollectorStream8);
        org.junit.Assert.assertNull(strCollectorStream9);
        org.junit.Assert.assertNull(strCollectorStream10);
        org.junit.Assert.assertNotNull(strListBiConsumer13);
        org.junit.Assert.assertNotNull(characteristicsSet14);
        org.junit.Assert.assertNotNull(strListFunction15);
        org.junit.Assert.assertNotNull(strListFunction16);
        org.junit.Assert.assertNotNull(strListBinaryOperator17);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction2 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator3 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier5 = strArrayCollector1.supplier();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer6 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector.Characteristics> characteristicsFailableStream10 = org.apache.commons.lang3.Streams.stream((java.util.Collection<java.util.stream.Collector.Characteristics>) characteristicsSet9);
        org.junit.Assert.assertNotNull(strListFunction2);
        org.junit.Assert.assertNotNull(strListBinaryOperator3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(strListSupplier5);
        org.junit.Assert.assertNotNull(strListBiConsumer6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(characteristicsFailableStream10);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier4 = strArrayCollector1.supplier();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction5 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator6 = strArrayCollector1.combiner();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator7 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator9 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction10 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListSupplier4);
        org.junit.Assert.assertNotNull(strListFunction5);
        org.junit.Assert.assertNotNull(strListBinaryOperator6);
        org.junit.Assert.assertNotNull(strListBinaryOperator7);
        org.junit.Assert.assertNotNull(strListSupplier8);
        org.junit.Assert.assertNotNull(strListBinaryOperator9);
        org.junit.Assert.assertNotNull(strListFunction10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass4 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector5 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass4);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector5.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector5.characteristics();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer8 = strArrayCollector5.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector5.characteristics();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector11 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector5, strCollectorBinaryOperator10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListBiConsumer8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream8 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream9 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream10 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream11 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream12 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream13 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream14 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream15 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream16 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream17 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream18 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream19 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream20 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream21 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream22 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream23 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream24 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream25 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass26 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector27 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass26);
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction28 = strArrayCollector27.finisher();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction29 = strArrayCollector27.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer30 = strArrayCollector27.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction31 = strArrayCollector27.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer32 = strArrayCollector27.accumulator();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator33 = strArrayCollector27.combiner();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector35 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector27, strCollectorBinaryOperator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNull(strCollectorStream8);
        org.junit.Assert.assertNull(strCollectorStream9);
        org.junit.Assert.assertNull(strCollectorStream10);
        org.junit.Assert.assertNull(strCollectorStream11);
        org.junit.Assert.assertNull(strCollectorStream12);
        org.junit.Assert.assertNull(strCollectorStream13);
        org.junit.Assert.assertNull(strCollectorStream14);
        org.junit.Assert.assertNull(strCollectorStream15);
        org.junit.Assert.assertNull(strCollectorStream16);
        org.junit.Assert.assertNull(strCollectorStream17);
        org.junit.Assert.assertNull(strCollectorStream18);
        org.junit.Assert.assertNull(strCollectorStream19);
        org.junit.Assert.assertNull(strCollectorStream20);
        org.junit.Assert.assertNull(strCollectorStream21);
        org.junit.Assert.assertNull(strCollectorStream22);
        org.junit.Assert.assertNull(strCollectorStream23);
        org.junit.Assert.assertNull(strCollectorStream24);
        org.junit.Assert.assertNull(strCollectorStream25);
        org.junit.Assert.assertNotNull(strListFunction28);
        org.junit.Assert.assertNotNull(strListFunction29);
        org.junit.Assert.assertNotNull(strListBiConsumer30);
        org.junit.Assert.assertNotNull(strListFunction31);
        org.junit.Assert.assertNotNull(strListBiConsumer32);
        org.junit.Assert.assertNotNull(strListBinaryOperator33);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier3 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet4 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier6 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet7 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier8 = strArrayCollector1.supplier();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(strListSupplier3);
        org.junit.Assert.assertNotNull(characteristicsSet4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListSupplier6);
        org.junit.Assert.assertNotNull(characteristicsSet7);
        org.junit.Assert.assertNotNull(strListSupplier8);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator5 = strArrayCollector1.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier7 = strArrayCollector1.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet8 = strArrayCollector1.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator10 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet11 = strArrayCollector1.characteristics();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator12 = strArrayCollector1.combiner();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet13 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction14 = strArrayCollector1.finisher();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(strListBinaryOperator5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListSupplier7);
        org.junit.Assert.assertNotNull(characteristicsSet8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListBinaryOperator10);
        org.junit.Assert.assertNotNull(characteristicsSet11);
        org.junit.Assert.assertNotNull(strListBinaryOperator12);
        org.junit.Assert.assertNotNull(characteristicsSet13);
        org.junit.Assert.assertNotNull(strListFunction14);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.Class<java.lang.String> strClass0 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector1 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass0);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer2 = strArrayCollector1.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet3 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction4 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet5 = strArrayCollector1.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction6 = strArrayCollector1.finisher();
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer7 = strArrayCollector1.accumulator();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction8 = strArrayCollector1.finisher();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet9 = strArrayCollector1.characteristics();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier10 = strArrayCollector1.supplier();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier11 = strArrayCollector1.supplier();
        org.junit.Assert.assertNotNull(strListBiConsumer2);
        org.junit.Assert.assertNotNull(characteristicsSet3);
        org.junit.Assert.assertNotNull(strListFunction4);
        org.junit.Assert.assertNotNull(characteristicsSet5);
        org.junit.Assert.assertNotNull(strListFunction6);
        org.junit.Assert.assertNotNull(strListBiConsumer7);
        org.junit.Assert.assertNotNull(strListFunction8);
        org.junit.Assert.assertNotNull(characteristicsSet9);
        org.junit.Assert.assertNotNull(strListSupplier10);
        org.junit.Assert.assertNotNull(strListSupplier11);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream0 = null;
        org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorFailableStream1 = new org.apache.commons.lang3.Streams.FailableStream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>>(strCollectorStream0);
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream2 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream3 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream4 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream5 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream6 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream7 = strCollectorFailableStream1.stream();
        java.util.stream.Stream<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorStream8 = strCollectorFailableStream1.stream();
        java.lang.Class<java.lang.String> strClass9 = null;
        org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String> strArrayCollector10 = new org.apache.commons.lang3.Streams.ArrayCollector<java.lang.String>(strClass9);
        java.util.function.BiConsumer<java.util.List<java.lang.String>, java.lang.String> strListBiConsumer11 = strArrayCollector10.accumulator();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet12 = strArrayCollector10.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction13 = strArrayCollector10.finisher();
        java.util.function.BinaryOperator<java.util.List<java.lang.String>> strListBinaryOperator14 = strArrayCollector10.combiner();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction15 = strArrayCollector10.finisher();
        java.util.function.Supplier<java.util.List<java.lang.String>> strListSupplier16 = strArrayCollector10.supplier();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet17 = strArrayCollector10.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet18 = strArrayCollector10.characteristics();
        java.util.Set<java.util.stream.Collector.Characteristics> characteristicsSet19 = strArrayCollector10.characteristics();
        java.util.function.Function<java.util.List<java.lang.String>, java.lang.String[]> strListFunction20 = strArrayCollector10.finisher();
        java.util.function.BinaryOperator<java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>> strCollectorBinaryOperator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]> strCollector22 = strCollectorFailableStream1.reduce((java.util.stream.Collector<java.lang.String, java.util.List<java.lang.String>, java.lang.String[]>) strArrayCollector10, strCollectorBinaryOperator21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strCollectorStream2);
        org.junit.Assert.assertNull(strCollectorStream3);
        org.junit.Assert.assertNull(strCollectorStream4);
        org.junit.Assert.assertNull(strCollectorStream5);
        org.junit.Assert.assertNull(strCollectorStream6);
        org.junit.Assert.assertNull(strCollectorStream7);
        org.junit.Assert.assertNull(strCollectorStream8);
        org.junit.Assert.assertNotNull(strListBiConsumer11);
        org.junit.Assert.assertNotNull(characteristicsSet12);
        org.junit.Assert.assertNotNull(strListFunction13);
        org.junit.Assert.assertNotNull(strListBinaryOperator14);
        org.junit.Assert.assertNotNull(strListFunction15);
        org.junit.Assert.assertNotNull(strListSupplier16);
        org.junit.Assert.assertNotNull(characteristicsSet17);
        org.junit.Assert.assertNotNull(characteristicsSet18);
        org.junit.Assert.assertNotNull(characteristicsSet19);
        org.junit.Assert.assertNotNull(strListFunction20);
    }
}

