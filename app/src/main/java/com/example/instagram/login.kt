package com.example.instagram


import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.instagram.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.LoginBtn.setOnClickListener {
            validation()
        }
        binding.AskSignUp.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

    }

    private fun validation() {
        val email = binding.Email.text.toString()
        val password = binding.Password.text.toString()
        var isValid = true
        if (email.isEmpty()) {
            binding.LoginLayout1.error = "Complete This Field"
            isValid = false
        }
        if (password.isEmpty()) {
            binding.LoginLayout2.error = "Complete This Field"
            isValid = false
        }
        if (isValid) {
            HomePage()
        }
    }

    private fun HomePage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}