package capstone.com.verve.View.Fragments

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import capstone.com.verve.Interface.AcceptListener

import capstone.com.verve.R

class ForumAddPostFragment : DialogFragment(), AcceptListener {

   // private var postList: ArrayList<SampleData> = ArrayList()
    private var listener: OnFragmentInteractionListener? = null

    override fun onSubmit() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


            //RecyclerView
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_post, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    lateinit var acceptListen: AcceptListener
    fun setListener(accept: AcceptListener) {
        acceptListen = accept
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        fun newInstance(title: String): ForumAddPostFragment {
            val frag = ForumAddPostFragment()
            val args = Bundle()
            args.putString("title", title)
            frag.arguments = args
            return frag
        }
    }

}
