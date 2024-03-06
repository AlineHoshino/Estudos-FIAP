Precisa criar a instância retorfit 

    val api: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(Util.Base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }


Criar uma interface que vai receber a model com os dados de resposta 