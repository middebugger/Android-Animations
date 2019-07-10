package info.androidhive.androidanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

public class BounceActivity extends Activity implements AnimationListener {

	RelativeLayout rl_menu;
	Button btnStart;

	Animation animBounce;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_child);

		rl_menu = (RelativeLayout) findViewById(R.id.rl_men_pop);
		btnStart = (Button) findViewById(R.id.btnStart);
		
       

		// load the animation
		animBounce = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.bounce);

		// set animation listener
//		animBounce.setAnimationListener(this);

		// button click event
		btnStart.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// start the animation
				rl_menu.setVisibility(View.VISIBLE);
				rl_menu.startAnimation(animBounce);
			}
		});

	}

	@Override
	public void onAnimationEnd(Animation animation) {
		// Take any action after completing the animation

		// check for zoom in animation
		if (animation == animBounce) {
		}

	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

}
