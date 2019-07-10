package info.androidhive.androidanimations;

import android.app.Activity;
import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Bounce_Window extends Activity{
	
	WindowManager windowManager;
	Context cntx;
	RelativeLayout rl_menu;
	Button btnStart;
	
	 private ViewGroup mPopupLayout;
     private ViewGroup mParentView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		cntx=Bounce_Window.this;
		


		final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                                                      WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY,
                                                      WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN |
                                                      WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                                                      PixelFormat.TRANSLUCENT);

        final WindowManager mWinManager = (WindowManager) cntx.getSystemService(Context.WINDOW_SERVICE);
        
       

        LayoutInflater inflater = (LayoutInflater) cntx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mPopupLayout = (RelativeLayout) inflater.inflate(R.layout.menu_child, null);
        
        

        mParentView = new FrameLayout(cntx);

        mWinManager.addView(mParentView, params);

      //  mParentView.addView(mPopupLayout);
	}
}
