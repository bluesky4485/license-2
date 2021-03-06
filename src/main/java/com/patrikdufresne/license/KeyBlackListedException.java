/**
 * Copyright(C) 2013 Patrik Dufresne Service Logiciel <info@patrikdufresne.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.patrikdufresne.license;

/**
 * This exception is throw by the key manager when the key is determined to be
 * black listed.
 * 
 * @author Patrik Dufresne
 * 
 */
public class KeyBlackListedException extends LicenseException {

    private static final long serialVersionUID = 4833729281645719038L;

    public KeyBlackListedException() {
        super("black listed key");
    }
}
