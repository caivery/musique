/*
 * Copyright (c) 2008, 2009, 2010 Denis Tulskiy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.xiph.libvorbis;

import static org.xiph.libvorbis.vorbis_constants.integer_constants.*;

public class compandblock {

    int[] data;        // data[NOISE_COMPAND_LEVELS]


    public compandblock(int[] _data) {

        data = new int[NOISE_COMPAND_LEVELS];
        System.arraycopy(_data, 0, data, 0, _data.length);
    }

    public compandblock(compandblock src) {

        this(src.data);
    }
}