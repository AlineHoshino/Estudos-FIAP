Precisa criar a instância retorfit 

    val api: ApiInterface by lazy {
        Retrofit.Builder()
            .baseUrl(Util.Base)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }


Criar uma interface que vai receber a model com os dados de resposta 

Não esquecer de dar permissão para permitir rede:
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.INTERNET"/>

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
. . . trecho de código omitido

Criar pacotes model e service 

package br.com.fiap.consultacep.model

data class Endereco(
  val cep: String = "",
  val rua: String = "",
  val cidade: String = "",
  val bairro: String = "",
  val uf: String = ""
)