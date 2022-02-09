package nsl.orion.crankshaftdeflectiongauge.sqlite;

/**
 * Created by TienNT on 9/6/2015.
 */
public class EngineTable {
    public static final String TABLE_NAME = "engine";
    public static final String NAME_ENGINE_ID = "id";
    public static final String NAME_ENGINE_NAME = "name";
    public static final String NAME_ENGINE_TYPE = "type";
    public static final String NAME_NUMBER_OF_CYLINDER = "number_of_cylinder";
    public static final String NAME_DATE_OF_CREATION = "date_of_creation";
    public static final String NAME_LAST_UPDATE = "last_update";
    public static final String NAME_IS_FINISHED = "is_finished";

    public static final int INDEX_ENGINE_ID = 0;
    public static final int INDEX_ENGINE_NAME = 1;
    public static final int INDEX_ENGINE_TYPE = 2;
    public static final int INDEX_NUMBER_OF_CYLINDER = 3;
    public static final int INDEX_DATE_OF_CREATION = 4;
    public static final int INDEX_LAST_UPDATE = 5;
    public static final int INDEX_IS_FINISHED = 6;

    public static final String QUERY_CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME +
                    "(" +
                    NAME_ENGINE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME_ENGINE_NAME + " TEXT, " +
                    NAME_ENGINE_TYPE + " TEXT, " +
                    NAME_NUMBER_OF_CYLINDER + " INTEGER, " +
                    NAME_DATE_OF_CREATION + " TEXT, " +
                    NAME_LAST_UPDATE + " TEXT, " +
                    NAME_IS_FINISHED + " INTEGER " +
                    ")";
    public static final String QUERY_SELECT_ALL =
            "SELECT * FROM " + TABLE_NAME + " ORDER BY " + NAME_ENGINE_ID;
}
