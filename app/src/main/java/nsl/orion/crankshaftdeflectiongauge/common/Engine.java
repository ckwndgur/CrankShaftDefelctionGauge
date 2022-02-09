package nsl.orion.crankshaftdeflectiongauge.common;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by TienNT on 9/6/2015.
 */
public class Engine implements Parcelable {

    public static final int FINISHED = 1;
    public static final int NOT_FINISHED = 0;
    public final static Creator<Engine> CREATOR = new Creator<Engine>() {
        @Override
        public Engine createFromParcel(Parcel source) {
            return new Engine(source);
        }

        @Override
        public Engine[] newArray(int size) {
            return new Engine[size];
        }
    };
    public ArrayList<Cylinder> cylinderArrayList;
    private Long id;
    private String name;
    private String type;
    private Integer numberOfCylinder;
    private String dateOfCreation;
    private String lastUpdate;
    private Integer isFinished;


    public Engine() {
        cylinderArrayList = new ArrayList();
    }

    public Engine(Parcel source) {
        cylinderArrayList = new ArrayList();
        id = source.readLong();
        numberOfCylinder = source.readInt();
        name = source.readString();
        type = source.readString();
        dateOfCreation = source.readString();
        lastUpdate = source.readString();
        source.readTypedList(cylinderArrayList, Cylinder.CREATOR);
        isFinished = source.readInt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumberOfCylinder() {
        return numberOfCylinder;
    }

    public void setNumberOfCylinder(Integer numberOfCylinder) {
        this.numberOfCylinder = numberOfCylinder;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeInt(numberOfCylinder);
        dest.writeString(name);
        dest.writeString(type);
        dest.writeString(dateOfCreation);
        dest.writeString(lastUpdate);
        dest.writeTypedList(cylinderArrayList);
        dest.writeInt(isFinished);
    }


}
