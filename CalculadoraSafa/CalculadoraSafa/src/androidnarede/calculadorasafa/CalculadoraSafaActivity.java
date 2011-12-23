package androidnarede.calculadorasafa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalculadoraSafaActivity extends Activity {
	
	private EditText op1;
	private EditText op2;
	private EditText resultado;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         op1 = (EditText) findViewById(R.id.editText1);
         op2 = (EditText) findViewById(R.id.editText2);
         resultado = (EditText) findViewById(R.id.editText3);
    }
    
    public void calcular(View v){
    	Integer valorOp1 = Integer.parseInt(op1.getText().toString());
    	Integer valorOp2 = Integer.parseInt(op2.getText().toString());
    	final Integer soma = valorOp1 + valorOp2;
    	
    	runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				resultado.setText(""+soma);
			}
		});
    }
}