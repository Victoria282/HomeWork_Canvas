package otus.homework.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import otus.homework.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initPieChart()
    }

    private fun initPieChart() {
        val payloads = this.readData()
        val pieces = payloads.map()
        binding.pieChart.setPieces(pieces)
    }
}