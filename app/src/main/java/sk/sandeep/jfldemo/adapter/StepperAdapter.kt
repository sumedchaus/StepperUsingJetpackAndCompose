package sk.sandeep.jfldemo.adapter

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.stepstone.stepper.Step
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter
import sk.sandeep.jfldemo.fragments.BusinessInformationFragment
import sk.sandeep.jfldemo.fragments.CashFlowDetailsFragment
import sk.sandeep.jfldemo.fragments.PersonalInformationFragment
import sk.sandeep.jfldemo.fragments.VerificationOfDocumentsFragment


class StepperAdapter(fm: FragmentManager?, context: Context?) :
    AbstractFragmentStepAdapter(fm!!, context!!) {

    override fun getCount(): Int {
        return 4
    }

    override fun createStep(position: Int): Step {

        val step = when (position) {
            0 -> return PersonalInformationFragment()
            1 -> return BusinessInformationFragment()
            2 -> return CashFlowDetailsFragment()
            3 -> return VerificationOfDocumentsFragment()
            else -> PersonalInformationFragment()
        }
        return step
    }
}
