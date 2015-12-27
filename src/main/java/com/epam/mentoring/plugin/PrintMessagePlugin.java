package com.epam.mentoring.plugin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Print Message Plugin implementation. Just prints input string in console.
 *
 * @author vkrasovsky
 */
public class PrintMessagePlugin implements Plugin {
    private static final Logger LOGGER = LogManager.getLogger(PrintMessagePlugin.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public void processInput(String input) {
        LOGGER.info(MenuConstants.DELIMITER);
        LOGGER.info("Printed input: " + input);
        LOGGER.info(MenuConstants.DELIMITER);
    }
}
