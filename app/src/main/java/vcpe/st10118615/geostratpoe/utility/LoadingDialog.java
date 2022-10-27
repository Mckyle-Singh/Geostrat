package vcpe.st10118615.geostratpoe.utility;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

import vcpe.st10118615.geostratpoe.R;
import vcpe.st10118615.geostratpoe.activity.SignUpActivity;
import vcpe.st10118615.geostratpoe.databinding.DialogLayoutBinding;
public class LoadingDialog {

    private Activity activity;
    private AlertDialog alertDialog;

    public LoadingDialog(Activity activity) {
        this.activity = activity;
    }
    public void startLoading() {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.loadingDialogStyle);
        DialogLayoutBinding binding = DialogLayoutBinding.inflate(LayoutInflater.from(activity), null, false);
        builder.setView(binding.getRoot());
        builder.setCancelable(false);
        alertDialog = builder.create();
//        binding.rotateLoading.start();
        alertDialog.show();
    }
    public void stopLoading() {
        alertDialog.dismiss();
    }
}
