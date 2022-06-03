package com.example.dmovrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dmovrecycler.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(
        JSONObject("{\"title\": \"Videojuegos\", \"descripcion\": \"Todo sobre videojuegos\", \"likes\": \"6k likes\"}"),
        JSONObject("{\"title\": \"Juegos de Rol\", \"descripcion\": \"Aprende a jugar DnD\", \"likes\": \"1 like\"}"),
        JSONObject("{\"title\": \"Peliculas\", \"descripcion\": \"Lo mejor del cine\", \"likes\": \"99k likes\"}"),
        JSONObject("{\"title\": \"Hobbies\", \"descripcion\": \"Coleccionistas de todo tipo\", \"likes\": \"20k likes\"}"),
        JSONObject("{\"title\": \"Ajedrez\", \"descripcion\": \"Mejores jugadas y tecnicas\", \"likes\": \"400 likes\"}"),
        )

        binding.rvVideoEntries.adapter = MainAdapter(fakeVideoData)
    }
}