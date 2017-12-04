package com.u9.fabapp.virtualgym;

    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.text.TextUtils;
    import android.util.Log;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.Toast;

    /*import com.u9.fabapp.virtualgym.APIClient;*/
    import com.u9.fabapp.virtualgym.RespostaLogin;
    import com.u9.fabapp.virtualgym.Resposta;

    import retrofit2.Call;
    import retrofit2.Callback;
    import retrofit2.Response;

    /*import retrofit.Callback;
    import retrofit.RetrofitError;
    import retrofit.client.Response;*/

    public class MainActivity extends AppCompatActivity {

        Button btn_login;
        EditText edt_login;
        EditText edt_senha;

        private SOService mService;

       // private Callback<RespostaLogin> respostaCallback;

        private static final String TAG = "MainActivity";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mService = APIUtils.getSOService();


            btn_login = findViewById(R.id.btn_login);
            edt_login = findViewById(R.id.edt_Login);
            edt_senha= findViewById(R.id.edt_Senha);

            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String login = edt_login.getText().toString();
                    String senha = edt_senha.getText().toString();
                    if(TextUtils.isEmpty(login)|| TextUtils.isEmpty(senha)) {
                        Toast.makeText(MainActivity.this, "Campos vazios", Toast.LENGTH_SHORT).show();
                    } else {
                        //configurarCallback();
                       //new APIClient().getRestService().setUsuarioLoginDTO(login, senha, respostaCallback);
                        Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(i);

                        carregaDados(login, senha);
                    }

                }
            });

        }

        public void carregaDados(String login, String senha) {
            mService.CallBack(login, senha).enqueue(new Callback<Usuario>() {
                @Override
                public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                    if(response.isSuccessful()) {
                        Log.d(TAG, "Funcionou: "+ response.body() );
                        Log.d(TAG, "Funcionou: " + response.code());
                    }
                }

                @Override
                public void onFailure(Call<Usuario> call, Throwable t) {
                    Log.d(TAG, "onFailure: Erro loading from API" + t.getMessage());
                    Log.d(TAG, "onFailure: "+ t.getCause());
                    Log.d(TAG, "onFailure: "+ t.fillInStackTrace());
                }
            });
        }

       /* private void configurarCallback() {
            respostaCallback = new Callback<RespostaLogin>() {
                @Override
                public void success(RespostaLogin respostaCallback, Response response) {

                    Log.d(TAG, "Funcionou: "+ response.getStatus());
                    Log.d(TAG, "Funcionou: " + respostaCallback.getRETORNO());
                    Log.d(TAG, "Funcionou: " + response.getBody());

                    *//*if (resposta.getRETORNO().equals("SUCESSO")){
                        Intent intent1 = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(intent1);
                    }else{
                        Toast.makeText(MainActivity.this, resposta.getRETORNO() +" ,Verifique usuário e senha" , Toast.LENGTH_SHORT).show();
                    }*//*
                }

                @Override
                public void failure(RetrofitError error) {
                    Log.d(TAG, "failure: "+ error.getMessage());
                    Log.d(TAG, "failure: "+ error.getLocalizedMessage());
                    Toast.makeText(MainActivity.this, "Deu Ruim: " + error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            };
        }*/

    }
