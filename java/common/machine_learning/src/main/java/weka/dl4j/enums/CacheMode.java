/*
 * WekaDeeplearning4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WekaDeeplearning4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WekaDeeplearning4j.  If not, see <https://www.gnu.org/licenses/>.
 *
 * CacheMode.java
 * Copyright (C) 2017-2018 University of Waikato, Hamilton, New Zealand
 */

package weka.dl4j.enums;

/**
 * Cache modes for datasetiterators.
 * <ul>
 * <li>NONE: Do not use any cache</li>
 * <li>MEMORY: Cache data in memory</li>
 * <li>FILESYSTEM: Cache data in the filesystem in "java.io.tmpdir"</li>
 * </ul>
 *
 * @author Steven Lang
 */
public enum CacheMode {
	NONE, MEMORY, FILESYSTEM
}
