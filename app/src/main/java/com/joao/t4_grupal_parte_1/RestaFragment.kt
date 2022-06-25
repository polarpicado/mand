    package com.joao.t4_grupal_parte_1

    import android.os.Bundle
    import androidx.fragment.app.Fragment
    import android.view.LayoutInflater
    import android.view.View
    import android.view.ViewGroup
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView
    import android.widget.Toast


    class RestaFragment : Fragment(R.layout.fragment_resta) {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_resta,container, false)
            val btn_restar = view.findViewById<Button>(R.id.btn_restar)
            val txt_primero_resta = view.findViewById<EditText>(R.id.txt_primero_resta)
            val txt_segundo_resta = view.findViewById<EditText>(R.id.txt_segundo_resta)
            val lbl_resultado_resta = view.findViewById<TextView>(R.id.lbl_resultado_resta)

            btn_restar.setOnClickListener {
//                lbl_resultado_resta.setText(
//                    "Resultado: " + (txt_primero_resta.toString().toInt()-txt_segundo_resta.toString().toInt())
//
//                )

            }
                Toast.makeText(context,txt_primero_resta.toString(),Toast.LENGTH_SHORT).show()

            return super.onCreateView(inflater, container, savedInstanceState)
        }

    }