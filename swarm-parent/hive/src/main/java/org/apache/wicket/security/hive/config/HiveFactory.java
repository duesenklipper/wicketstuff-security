/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.wicket.security.hive.config;

import org.apache.wicket.security.hive.Hive;
import org.apache.wicket.security.hive.HiveMind;

/**
 * HiveFactory creates {@link Hive}s to be registered by the {@link HiveMind}.
 * For instance there could be Hives that read the system policy from a file,
 * while others read it from a database.
 * 
 * @author marrink
 * 
 */
public interface HiveFactory
{
	/**
	 * Creates a new Hive according to the configuration (if any) of this
	 * factory. The factory is free to return null or throw an exception if an
	 * unrecoverable problem arises.
	 * 
	 * @return the new Hive.
	 */
	public Hive createHive();
}
