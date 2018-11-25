package capstone.com.verve.View.Fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import capstone.com.verve.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private const val GALLERY_PICK = 1

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ForumPopularFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ForumPopularFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class ForumPopularFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forum_popular, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

<<<<<<< HEAD:Verve/app/src/main/java/capstone/com/verve/View/Fragments/ForumPopularFragment.kt
=======
    private fun openGallery() {
        val galleryIntent = Intent()
        galleryIntent.action = Intent.ACTION_GET_CONTENT
        galleryIntent.type = "image/*"
        startActivityForResult(galleryIntent, GALLERY_PICK)
    }

    lateinit var acceptListen: AcceptListener
    fun setListener(accept: AcceptListener) {
        acceptListen = accept
    }

>>>>>>> 02af95747303e6c133c8e796b1448af2b4105c68:Verve/app/src/main/java/capstone/com/verve/View/Fragments/AddPostFragment.kt

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
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ForumPopularFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ForumPopularFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
