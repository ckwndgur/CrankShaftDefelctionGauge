package nsl.orion.crankshaftdeflectiongauge.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by TienNT on 9/6/2015.
 */
public class Cylinder implements Parcelable {

    public static final int POSITION_T = 0;
    public static final int POSITION_P = 1;
    public static final int POSITION_BP = 2;
    public static final int POSITION_BE = 3;
    public static final int POSITION_E = 4;
    public static final int POSITION_IS_FINISHED = 5;

    public static final int FINISHED = 1;
    public static final int NOT_FINISHED = 0;
    public static final Parcelable.Creator<Cylinder> CREATOR =
            new Parcelable.Creator<Cylinder>() {

                @Override
                public Cylinder createFromParcel(Parcel source) {
                    return new Cylinder(source);
                }

                @Override
                public Cylinder[] newArray(int size) {
                    return new Cylinder[size];
                }
            };
    public boolean[] finishedPositions = {false, false, false, false, false};
    private Long engineId;
    private Integer order;
    private Float t;
    private Float p;
    private Float bp;
    private Float be;
    private Float e;
    private String dateOfCreation;
    private String lastUpdate;
    private Integer isFinished;

    public Cylinder() {
    }

    private Cylinder(Parcel in) {
        engineId = in.readLong();
        order = in.readInt();
        t = in.readFloat();
        p = in.readFloat();
        bp = in.readFloat();
        be = in.readFloat();
        e = in.readFloat();
        dateOfCreation = in.readString();
        lastUpdate = in.readString();
        isFinished = in.readInt();
    }

    public Long getEngineId() {
        return engineId;
    }

    public void setEngineId(long engineId) {
        this.engineId = engineId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Float getT() {
        return t;
    }

    public void setT(float t) {
        this.t = t;
    }

    public Float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public Float getBp() {
        return bp;
    }

    public void setBp(float bp) {
        this.bp = bp;
    }

    public Float getBe() {
        return be;
    }

    public void setBe(float be) {
        this.be = be;
    }

    public Float getE() {
        return e;
    }

    public void setE(float e) {
        this.e = e;
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
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(engineId);
        dest.writeInt(order);
        dest.writeFloat(t);
        dest.writeFloat(p);
        dest.writeFloat(bp);
        dest.writeFloat(be);
        dest.writeFloat(e);
        dest.writeString(dateOfCreation);
        dest.writeString(lastUpdate);
        dest.writeInt(isFinished);
    }
}
