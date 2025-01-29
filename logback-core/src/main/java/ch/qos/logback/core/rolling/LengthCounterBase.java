/*
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2024, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */

package ch.qos.logback.core.rolling;

import java.util.concurrent.atomic.LongAdder;

public class LengthCounterBase implements LengthCounter {

    LongAdder counter = new LongAdder();

    @Override
    public void add(long len) {
        counter.add(len);
    }

    @Override
    public long getLength() {
        return counter.longValue();
    }

    @Override
    public void reset() {
        counter.reset();
    }
}
