package jp.techacademy.atsuya.task_2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //インスタンス作成
        val human = Human("中山", 20, "ネコの世話")

        human.say()
        human.think()
    }
}
