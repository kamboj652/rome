/*
 * Copyright 2007 Sun Microsystems, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rometools.propono.atom.server.impl;

import com.rometools.propono.atom.common.Workspace;

/**
 * File based Atom service Workspace.
 *
 * @deprecated Propono will be removed in Rome 2.
 */
@Deprecated
public class FileBasedWorkspace extends Workspace {

    public FileBasedWorkspace(final String handle, final String baseDir) {
        super(handle, "text");
    }

}
