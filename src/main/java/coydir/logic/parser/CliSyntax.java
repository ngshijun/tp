package coydir.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_POSITION = new Prefix("j/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");

    public static final Prefix[] PREFIX_LIST = {
        PREFIX_NAME,
        PREFIX_PHONE,
        PREFIX_EMAIL,
        PREFIX_POSITION,
        PREFIX_ADDRESS,
        PREFIX_TAG
    };
}
