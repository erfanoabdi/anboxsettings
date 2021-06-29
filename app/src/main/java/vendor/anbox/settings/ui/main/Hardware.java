package vendor.anbox.settings.ui.main;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;
import vendor.anbox.settings.R;

public class Hardware extends PreferenceFragmentCompat {

    public static final String TAG = "Hardware";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.settings_hardware);
    }
}
