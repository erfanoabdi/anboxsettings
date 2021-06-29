
package vendor.anbox.settings.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import vendor.anbox.settings.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private Fragment frags[] = new Fragment[5];
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

        frags[0] = new General();
        frags[1] = new Display();
        frags[2] = new Hardware();
        frags[3] = new Gaming();
        frags[4] = new About();
    }

    @Override
    public Fragment getItem(int position) {
        return frags[position];
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getResources().getString(R.string.general_title);
            case 1:
                return mContext.getResources().getString(R.string.display_title);
            case 2:
                return mContext.getResources().getString(R.string.hardware_title);
            case 3:
                return mContext.getResources().getString(R.string.gaming_title);
            case 4:
                return mContext.getResources().getString(R.string.about_anbox);
        }
        return "NULL";
    }

    @Override
    public int getCount() {
        return frags.length;
    }
}
