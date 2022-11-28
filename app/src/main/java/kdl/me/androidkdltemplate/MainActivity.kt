package kdl.me.androidkdltemplate

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Hi"

        val btn = Button(this)
        btn.text = "Do"

        btn.setOnClickListener({
            tv.text = "Done"
        })

        val ll = LinearLayout(this)
        ll.addView(tv)
        ll.addView(btn)
        setContentView(ll)

    }
  }

