package androidnarede.calculadorasafa.test;

import org.junit.Before;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.EditText;
import androidnarede.calculadorasafa.CalculadoraSafaActivity;

/**
 * TestCase Android para a Activity {@link CalculadoraSafaActivity} apresentado
 * durante o #safaDojo de Android, no #tasafoemacaoCastanhal 2a edicao.
 * 
 * @author ramonrabello
 * @since 17 de Dezembro de 2011
 */
public class CalculadoraSafaTestCase extends ActivityInstrumentationTestCase2<CalculadoraSafaActivity> {

	// componentes gr‡ficos da 
	// Activity CalculadoraSafaActivity
	CalculadoraSafaActivity activity;
	EditText et1;
	EditText et2;
	EditText resultado;
	Button botaoCalcular;

	public CalculadoraSafaTestCase() {
		super(CalculadoraSafaActivity.class.getPackage().getName(),
				CalculadoraSafaActivity.class);
		// TODO Auto-generated constructor stub
	}

	/**
	 * inicializa os componentes gr‡ficos da Activity
	 */
	@Before
	public void setUp() {
		activity = (CalculadoraSafaActivity) getActivity();
		et1 = (EditText) activity.findViewById(androidnarede.calculadorasafa.R.id.editText1);
		et2 = (EditText) activity.findViewById(androidnarede.calculadorasafa.R.id.editText2);
		resultado = (EditText) activity.findViewById(androidnarede.calculadorasafa.R.id.editText3);
		botaoCalcular = (Button) activity.findViewById(androidnarede.calculadorasafa.R.id.button1);
	}

	/**
	 * Libera recursos n‹o
	 * utilizados.
	 */
	public void tearDown() {
		activity = null;
		et1 = null;
		et2 = null;
		resultado = null;
	}

	/**
	 * MŽtodo utilizado para testar unitariamente a soma
	 * de nossa calculadora safa! :)
	 */
	@UiThreadTest
	public void testCalcularSomaPelaActivity() {

		// simulando o preenchimento dos campos
		// para a soma
		et1.setText("1");
		et2.setText("2");

		// simula o clique no bot‹o para
		// calcular a soma
		botaoCalcular.performClick();

		// testa se o resultado est‡ ou n‹o correto
		assertEquals(resultado.getText().toString(), "3");
	}

	// adicionar testes unitarios para outras operacoes
	// (subtracao, divisao, multiplicacao...)

}
