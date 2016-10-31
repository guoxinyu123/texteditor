package iet.jxufe.cn.android;

import android.app.Activity;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	private Button red, green, bule, bold, italic, moren, bigger, smaller;
	private EdiText content;
	private TextView testText;
	private int flag=0;
	
	public void onCreat(Bundle savedInstanceState){
		super.oncreat(savedInstanceState);
		setContentView(R.layout.activity_main);
		testText = (TextView) findViewById(R.id.testText);
		testText.setTypeface(Typeface.DEFAULT);
		red = (Button) findViewById(R.id.red);
		green = (Button) findViewById(R.id.green);
		blue = (Button) findViewById(R.id.blue);
		bold = (Button) findViewById(R.id.bold);
		italic = (Button) findViewById(R.id.italic);
		moren = (Button) findViewById(R.id.moren);
		bigger = (Button) findViewById(R.id.bigger);
		smaller = (Button) findViewById(R.id.smaller);
		SizeListener mysizeListener=new SizeListener(testText);
		bigger.setOnClickListener(mysizeListener);
		smaller.setOnClickListener(mysizeListener);
		content = (EditText) findViewById(R.id.content);
		colorListner myColorListner =new colorListner();
		red.setOnClickListener(myColorListner);
		green.setOnClickListener(myColorListner);
		blue.setOnClickListener(myColorListner);
		italic.setOnClickListener(this);
		bold.setOnClickListener(this);
		moren.setOnClickListener(this);
		content.setOnEditorActionListener(new OnEditorActionListener(){
			public boolean onEditorAcion(TextView v, int actionId, keyEvent enent){
				testText.setText(content.getText().toString)());
		        return false;
			}
		});
		
}
   private class ColorListener implements OnClickListener{
	   public void onClick(View ){
		   swith (v.getId()){
			   case R.id.red:
				   testText.setTextColor(Color.RED);
				   break;
			   case R.id.blue;
			       testText.setTextColor(Color.BLUE);
			       break;
			   case R.id.green;    
			   testText.setTextColor(Color.GREEN);
			   break;
			   default;
			   break;
		   }
	   }
   }
	public void onClick(View v){
		Typeface tf=testText.getTypeface();
		//testText.get
		switch (v.getId()){
		case R.id.italic:
			if(flag==2||flag==3){
				testText.setTypeface(Typeface.MONOSPACE,Typeface.BOLD_ITALIC);
				flag=3;
			}else{
				testText.setTypeface(Typeface.MONOSPACE,Typeface.ITALIC);
				flag=1;
			}
			break;
		case R.id.bold:
			if(flag==1)||flag==3){
				testText.setTypeface(Typeface.MONOSPACE,Typeface.BOLD_ITALIC);
				flag=3;
			}else{
				testText.setTypeface(Typeface.DEFAULT_BOLD,Typeface.BOLD);
				flag=2;
			}
			break;
			case R.id.moren:
				testText.setTypeface(Typeface.MONOSPACE,Typeface.NORMAL);
				flag=0;
				break;
				default;
				break;
		}
				
			}
		}
	
