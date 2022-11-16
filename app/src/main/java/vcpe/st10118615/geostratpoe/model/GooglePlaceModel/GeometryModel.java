package vcpe.st10118615.geostratpoe.model.GooglePlaceModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Geometry Model
 */
public class GeometryModel {
    @SerializedName("location")
    @Expose
    private LocationModel location;

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

}
