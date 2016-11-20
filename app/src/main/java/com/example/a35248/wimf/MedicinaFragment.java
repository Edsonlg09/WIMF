package com.example.a35248.wimf;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.a35248.wimf.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MedicinaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MedicinaFragment extends Fragment {
    ImageView imgFAPSI;
    ImageView imgFO;
    ImageView imgFM;
    ImageView imgFAEN;
    ImageView imgFASPyN;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MedicinaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MedicinaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MedicinaFragment newInstance(String param1, String param2) {
        MedicinaFragment fragment = new MedicinaFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_medicina, container, false);
        setHasOptionsMenu(true);

        getActivity().setTitle(getResources().getString((R.string.app_name)));

        imgFAEN = (ImageView) rootView.findViewById(R.id.imgFAEN);
        imgFO = (ImageView) rootView.findViewById(R.id.imgFO);
        imgFM = (ImageView) rootView.findViewById(R.id.imgFM);
        imgFAPSI = (ImageView) rootView.findViewById(R.id.imgFAPSI);
        imgFASPyN = (ImageView) rootView.findViewById(R.id.imgFASPyN);

        // Inflate the layout for this fragment
        imgFAEN.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    Intent intent = new Intent(getActivity(),menu.class);
                                                    startActivity(intent);
                                                }
                                            },1);
                                        }
                                    }
        );
        imgFO.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          new Handler().postDelayed(new Runnable() {
                                              @Override
                                              public void run() {
                                                  Intent intent = new Intent(getActivity(),menu.class);
                                                  startActivity(intent);
                                              }
                                          },1);
                                      }
                                  }
        );
        imgFM.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          new Handler().postDelayed(new Runnable() {
                                              @Override
                                              public void run() {
                                                  Intent intent = new Intent(getActivity(),menu.class);
                                                  startActivity(intent);
                                              }
                                          },1);
                                      }
                                  }
        );
        imgFAPSI.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              new Handler().postDelayed(new Runnable() {
                                                  @Override
                                                  public void run() {
                                                      Intent intent = new Intent(getActivity(),menu.class);
                                                      startActivity(intent);
                                                  }
                                              },1);
                                          }
                                      }
        );
        imgFASPyN.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          new Handler().postDelayed(new Runnable() {
                                              @Override
                                              public void run() {
                                                  Intent intent = new Intent(getActivity(),menu.class);
                                                  startActivity(intent);
                                              }
                                          },1);
                                      }
                                  }
        );


        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
