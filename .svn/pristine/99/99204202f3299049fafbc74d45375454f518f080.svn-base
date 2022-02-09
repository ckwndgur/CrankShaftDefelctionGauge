package nsl.orion.crankshaftdeflectiongauge.sqlite;

/**
 * Created by TienNT on 9/6/2015.
 */
public class CylinderTable {
    public static final String TABLE_NAME = "cylinder";
    public static final String NAME_ENGINE_ID = "engine_id";
    public static final String NAME_ORDER = "cylinder_order";
    public static final String NAME_T = "t";
    public static final String NAME_P = "p";
    public static final String NAME_BP = "bp";
    public static final String NAME_BE = "be";
    public static final String NAME_E = "e";
    public static final String NAME_DATE_OF_CREATION = "date_of_creation";
    public static final String NAME_LAST_UPDATE = "last_update";
    public static final String NAME_IS_FINISHED = "is_finished";

    public static final int INDEX_ENGINE_ID = 0;
    public static final int INDEX_ORDER = 1;
    public static final int INDEX_T = 2;
    public static final int INDEX_P = 3;
    public static final int INDEX_BP = 4;
    public static final int INDEX_BE = 5;
    public static final int INDEX_E = 6;
    public static final int INDEX_DATE_OF_CREATION = 7;
    public static final int INDEX_LAST_UPDATE = 8;
    public static final int INDEX_IS_FINISHED = 9;

    public static final String QUERY_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME +
                    "(" +
                    NAME_ENGINE_ID + " INTEGER, " +
                    NAME_ORDER + " INTEGER, " +
                    NAME_T + " REAL, " +
                    NAME_P + " REAL, " +
                    NAME_BP + " REAL, " +
                    NAME_BE + " REAL, " +
                    NAME_E + " REAL, " +
                    NAME_DATE_OF_CREATION + " TEXT, " +
                    NAME_LAST_UPDATE + " TEXT, " +
                    NAME_IS_FINISHED + " INTEGER " +
                    ")";
    public static final String QUERY_SELECT_ALL =
            "SELECT * FROM " + TABLE_NAME + " ORDER BY " + NAME_ENGINE_ID;
}
