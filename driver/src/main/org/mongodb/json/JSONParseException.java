/*
 * Copyright (c) 2008 - 2013 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.json;


/**
 * JSONParseException indicates some exception happened during JSON processing.
 */
public class JSONParseException extends RuntimeException {


    private static final long serialVersionUID = -6722022620020198727L;

    /**
     * Constructs a new runtime exception with null as its detail message.
     */
    public JSONParseException() {
        super();
    }

    /**
     * Constructs a new runtime exception with the specified detail message.
     *
     * @param s The detail message.
     */
    public JSONParseException(String s) {
        super(s);
    }

    /**
     * Constructs a new runtime exception with string formated using specified pattern and arguments.
     *
     * @param pattern A {@link  java.util.Formatter format string}.
     * @param args
     */
    public JSONParseException(String pattern, Object... args) {
        super(String.format(pattern, args));
    }
}
