package cl.individual.triviaapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.individual.triviaapp.databinding.FragmentResultadoBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResultadoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResultadoFragment extends Fragment {
    private FragmentResultadoBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ResultadoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ErrorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ResultadoFragment newInstance(String param1, String param2) {
        ResultadoFragment fragment = new ResultadoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentResultadoBinding.inflate(getLayoutInflater(), container, false);
        initListeners();
        return binding.getRoot();
    }

    private void initListeners() {

    }
}