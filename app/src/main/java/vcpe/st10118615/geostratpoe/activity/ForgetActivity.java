package vcpe.st10118615.geostratpoe.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import vcpe.st10118615.geostratpoe.databinding.ActivityForgetBinding;

public class ForgetActivity extends AppCompatActivity {
    private ActivityForgetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnBack.setOnClickListener(view -> {
            onBackPressed();
        });
    }
}
