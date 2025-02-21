                                                                    package com.example.tugs1pb

                                                                    import android.content.Intent
                                                                    import android.os.Bundle
                                                                    import android.widget.Button
                                                                    import android.widget.EditText
                                                                    import android.widget.Toast
                                                                    import androidx.appcompat.app.AppCompatActivity
                                                                    import androidx.core.view.ViewCompat
                                                                    import androidx.core.view.WindowInsetsCompat

                                                                    class MainActivity : AppCompatActivity() {
                                                                        override fun onCreate(savedInstanceState: Bundle?) {
                                                                            super.onCreate(savedInstanceState)
                                                                            setContentView(R.layout.activity_main)

                                                                            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                                                                                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                                                                                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                                                                                insets
                                                                            }


                                                                            val username = findViewById<EditText>(R.id.username)
                                                                            val password = findViewById<EditText>(R.id.password)
                                                                            val btnLogin = findViewById<Button>(R.id.btn_login)

                                                                            btnLogin.setOnClickListener {
                                                                                val user = username.text.toString().trim()
                                                                                val pass = password.text.toString().trim()

                                                                                if (user == "admin" && pass == "admin") {
                                                                                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                                                                                    // Pindah ke HelloActivity setelah login berhasil
                                                                                    val intent = Intent(this, hello::class.java)
                                                                                    startActivity(intent)
                                                                                    finish() //
                                                                                } else {
                                                                                    Toast.makeText(this, "USERNAME DAN PASWORD SALAH (admin)", Toast.LENGTH_SHORT).show()
                                                                                }
                                                                            }
                                                                        }
                                                                    }
