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
 * Distribution.java
 * Copyright (C) 2016-2018 University of Waikato, Hamilton, New Zealand
 */

package weka.dl4j.distribution;

import java.io.Serializable;
import java.util.Enumeration;

import lombok.EqualsAndHashCode;
import weka.core.Option;
import weka.core.OptionHandler;
import weka.dl4j.ApiWrapper;
import weka.dl4j.ApiWrapperUtil;

/**
 * Abstract distribution class.
 *
 * @param <T> Distribution implementation
 * @author Steven Lang
 */
@EqualsAndHashCode public abstract class Distribution<T extends org.deeplearning4j.nn.conf.distribution.Distribution>
		implements ApiWrapper<T>, OptionHandler, Serializable {

	private static final long serialVersionUID = -283820469693291697L;
	T backend;

	public Distribution() {
		initializeBackend();
	}

	/**
	 * Create an API wrapped layer from a given layer object.
	 *
	 * @param newBackend Backend object
	 * @return API wrapped object
	 */
	public static Distribution<? extends org.deeplearning4j.nn.conf.distribution.Distribution> create(
			org.deeplearning4j.nn.conf.distribution.Distribution newBackend) {
		return ApiWrapperUtil.getImplementingWrapper(Distribution.class, newBackend, "weka.dl4j.distribution");
	}

	@Override public T getBackend() {
		return backend;
	}

	@Override public void setBackend(T newBackend) {
		this.backend = newBackend;
	}

	/**
	 * Returns an enumeration describing the available options.
	 *
	 * @return an enumeration of all the available options.
	 */
	@Override public Enumeration<Option> listOptions() {

		return Option.listOptionsForClass(this.getClass()).elements();
	}

	/**
	 * Gets the current settings of the Classifier.
	 *
	 * @return an array of strings suitable for passing to setOptions
	 */
	@Override public String[] getOptions() {

		return Option.getOptions(this, this.getClass());
	}

	/**
	 * Parses a given list of options.
	 *
	 * @param options the list of options as an array of strings
	 * @throws Exception if an option is not supported
	 */
	public void setOptions(String[] options) throws Exception {

		Option.setOptions(options, this, this.getClass());
	}
}
