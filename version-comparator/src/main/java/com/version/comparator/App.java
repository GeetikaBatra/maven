package com.version.comparator;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.artifact.versioning.ComparableVersion; 

/**
 * Maven Artifact interface. Notice that it mixes artifact definition concepts (groupId, artifactId, version)
 * with dependency information (version range, scope).
 */
public class App 
{

    private static Comparable newComparable( String version )
    {
        ComparableVersion ret = new ComparableVersion( version );
//        String canonical = ret.getCanonical();
//        String parsedCanonical = new ComparableVersion( canonical ).getCanonical();
//
//        System.out.println( "canonical( " + version + " ) = " + canonical );
//        assertEquals( "canonical( " + version + " ) = " + canonical + " -> canonical: " + parsedCanonical, canonical,
//                      parsedCanonical );

        return ret;
    }
    public static void main( String[] args )
    {
        Comparable temp = newComparable( "1.1.1" );
       
    }
}
