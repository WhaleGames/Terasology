/*
 * Copyright 2011 Benjamin Glatzel <benjamin.glatzel@me.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.logic.generators;

import org.terasology.utilities.FastRandom;

/**
 * Object generators are used to generate objects like trees etc.
 *
 * @author Benjamin Glatzel <benjamin.glatzel@me.com>
 */
public abstract class TreeGenerator {

    protected final GeneratorManager _generatorManager;
    private double _genProbability = 1.0;

    /**
     * Init. a new tree generator.
     *
     * @param m The generator manager
     */
    TreeGenerator(GeneratorManager m) {
        _generatorManager = m;
    }

    /**
     * Generates a tree at the given position.
     *
     * @param rand  The random generator
     * @param posX   Position on the x-axis
     * @param posY   Position on the y-axis
     * @param posZ   Position on the z-axis
     * @param update If true, the chunk will be queued for updating
     */
    public abstract void generate(FastRandom rand, int posX, int posY, int posZ, boolean update);

    public double getGenProbability() {
        return _genProbability;
    }

    public TreeGenerator withGenerationProbability(double genProbability) {
        this._genProbability = genProbability;
        return this;
    }
}
