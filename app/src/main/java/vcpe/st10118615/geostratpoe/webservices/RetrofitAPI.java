package vcpe.st10118615.geostratpoe.webservices;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;
import vcpe.st10118615.geostratpoe.model.DirectionPlaceModel.DirectionResponseModel;
import vcpe.st10118615.geostratpoe.model.GooglePlaceModel.GoogleResponseModel;

/**
 * RetrofitAPI interface
 * For network communications
 */
public interface RetrofitAPI {
    @GET
    Call<GoogleResponseModel> getNearByPlaces(@Url String url);

    @GET
    Call<DirectionResponseModel> getDirection(@Url String url);
}
