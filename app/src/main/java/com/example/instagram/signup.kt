package com.example.instagram

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.instagram.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SignupBtn.setOnClickListener {
            HomePage()
        }

        binding.AskLogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }

    private fun HomePage() {
        val email = binding.Email.text.toString()
        val name = binding.Name.text.toString()
        val username = binding.UserName.text.toString()
        val password = binding.Password.text.toString()

        var isValid = true

        if (email.isEmpty()) {
            binding.SignupLayout1.error = "Complete This Field"
            isValid = false
        }
        if (name.isEmpty()) {
            binding.SignupLayout2.error = "Complete This Field"
            isValid = false
        }
        if (username.isEmpty()) {
            binding.SignupLayout3.error = "Complete This Field"
            isValid = false
        }
        if (password.isEmpty()) {
            binding.SignupLayout4.error = "Complete This Field"
            isValid = false
        }
        if (isValid) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}