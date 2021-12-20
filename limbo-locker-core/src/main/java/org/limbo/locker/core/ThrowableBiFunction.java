/*
 * Copyright 2020-2024 Limbo Team (https://github.com/limbo-world).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.limbo.locker.core;

/**
 * {@link java.util.function.BiFunction} 的扩展，可抛出异常。
 *
 * @author Brozen
 * @since 1.0
 */
@FunctionalInterface
public interface ThrowableBiFunction<ARG0, ARG1, RETURN> {

    /**
     * @see java.util.function.BiFunction#apply(Object, Object)
     */
    RETURN apply(ARG0 arg0, ARG1 arg1) throws RuntimeException;

}
