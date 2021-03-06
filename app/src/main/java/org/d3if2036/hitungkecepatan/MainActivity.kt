package org.d3if2036.hitungkecepatan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import org.d3if2036.hitungkecepatan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { hitungKec() }
    }
    private fun hitungKec() {
        val jarak = binding.jarakInp.text.toString()
        if (TextUtils.isEmpty(jarak)) {
            Toast.makeText(this, R.string.jarak_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val waktu = binding.waktuInp.text.toString()
        if (TextUtils.isEmpty(waktu)) {
            Toast.makeText(this, R.string.waktu_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val totalKec = jarak.toFloat() / waktu.toFloat()

        binding.total.text = totalKec.toString()
    }
}