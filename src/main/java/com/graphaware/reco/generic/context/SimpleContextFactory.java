/*
 * Copyright (c) 2014 GraphAware
 *
 * This file is part of GraphAware.
 *
 * GraphAware is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.generic.context;

/**
 * A {@link com.graphaware.reco.generic.context.ContextFactory} producing {@link com.graphaware.reco.generic.context.SimpleContext}.
 */
public class SimpleContextFactory<OUT, IN> implements ContextFactory<OUT, IN, SimpleContext<OUT, IN>> {

    /**
     * {@inheritDoc}
     */
    @Override
    public SimpleContext<OUT, IN> produceContext(IN input, Mode mode, int limit) {
        SimpleContext<OUT, IN> result = new SimpleContext<>(mode, limit);
        result.initialize(input);
        return result;
    }
}
