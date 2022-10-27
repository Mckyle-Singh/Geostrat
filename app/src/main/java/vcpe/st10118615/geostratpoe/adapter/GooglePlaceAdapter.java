package vcpe.st10118615.geostratpoe.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vcpe.st10118615.geostratpoe.GooglePlaceModel;
import vcpe.st10118615.geostratpoe.NearLocationInterface;
import vcpe.st10118615.geostratpoe.R;
import vcpe.st10118615.geostratpoe.databinding.PlaceItemLayoutBinding;

public class GooglePlaceAdapter extends RecyclerView.Adapter<GooglePlaceAdapter.ViewHolder> {

    private List<GooglePlaceModel> googlePlaceModels;
    private NearLocationInterface nearLocationInterface;

    public GooglePlaceAdapter(NearLocationInterface nearLocationInterface) {
        this.nearLocationInterface = nearLocationInterface;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PlaceItemLayoutBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.place_item_layout, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (googlePlaceModels != null) {
            GooglePlaceModel placeModel = googlePlaceModels.get(position);
            holder.binding.setGooglePlaceModel(placeModel);
            holder.binding.setListener(nearLocationInterface);
        }

    }

    @Override
    public int getItemCount() {
        if (googlePlaceModels != null)
            return googlePlaceModels.size();
        else
            return 0;
    }

    public void setGooglePlaceModels(List<GooglePlaceModel> googlePlaceModels) {
        this.googlePlaceModels = googlePlaceModels;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private PlaceItemLayoutBinding binding;

        public ViewHolder(@NonNull PlaceItemLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
