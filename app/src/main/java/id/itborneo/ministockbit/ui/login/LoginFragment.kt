package id.itborneo.ministockbit.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import id.itborneo.ministockbit.R


class LoginFragment : Fragment() {


    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeNavigation(view)

        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            navController.navigate(R.id.action_loginFragment_to_watchListFragment)
        }
    }

    private fun initializeNavigation(view: View) {
        navController =
            view.findNavController()

    }
}