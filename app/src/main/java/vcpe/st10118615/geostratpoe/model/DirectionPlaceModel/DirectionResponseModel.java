package vcpe.st10118615.geostratpoe.model.DirectionPlaceModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Direction Response Model
 */
public class DirectionResponseModel {
    @SerializedName("routes")
    @Expose
    List<DirectionRouteModel> directionRouteModels;

    public List<DirectionRouteModel> getDirectionRouteModels() {
        return directionRouteModels;
    }

    public void setDirectionRouteModels(List<DirectionRouteModel> directionRouteModels) {
        this.directionRouteModels = directionRouteModels;
    }
}
