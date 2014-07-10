package info.CICP.tabsswipe.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.cicp_layout.Retrieve_Stamp;
import com.example.cicp_layout.Stamp_Collect;



public class TabsPagerAdapter extends FragmentPagerAdapter {
	
	public TabsPagerAdapter(FragmentManager fm){
		super(fm);
	}
	
	@Override
	public Fragment getItem(int index) {
		
		switch (index) {
		case 0:
			return new Retrieve_Stamp();
		case 1:
			return new Stamp_Collect();
		}
		
		return null;
	}
	
	@Override
	public int getCount(){
		return 2;
	}

}
