package sk.sandeep.jfldemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.stepstone.stepper.Step
import com.stepstone.stepper.VerificationError
import sk.sandeep.jfldemo.compose_screen.CashFlowDetails
import sk.sandeep.jfldemo.theme.JFLDemoTheme

class CashFlowDetailsFragment : Fragment(), Step {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                JFLDemoTheme {
                    CashFlowDetails()
                }
            }
        }
    }

    override fun verifyStep(): VerificationError? {
        return null
    }

    override fun onSelected() {
    }

    override fun onError(error: VerificationError) {
    }

}