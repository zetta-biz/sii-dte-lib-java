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
