package vendor.anbox.settings.ui.main;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;
import vendor.anbox.settings.R;

public class General extends PreferenceFragmentCompat {

    public static final String TAG = "General";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.settings_general);
    }
}
