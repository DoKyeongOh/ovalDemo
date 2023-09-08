package org.example.oval.test;

import org.example.oval.OvalEntityMappingContext;
import org.example.oval.item.ItemExtractResult;

public interface OvalTestExecutor {
    public OvalTestResultType execute(OvalEntityMappingContext ovalEntityMappingContext)
            throws Exception;
}
