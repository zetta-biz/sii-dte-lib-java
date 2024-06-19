/**
 * Copyright (C) 2024 Jorge Arias Leal
 * SPDX-License-Identifier: LGPL-3.0-only OR Zetta-Commercial
 */

package model.extension;

import cl.sii.siidte.EnvioDTE;

public class ObjectFactory extends cl.sii.siidte.ObjectFactory {
    public EnvioDTEExtension createEnvioDTEExtension() {
        return new EnvioDTEExtension();
    }

    @Override
    public EnvioDTE createEnvioDTE() {
        return createEnvioDTEExtension();
    }
}
